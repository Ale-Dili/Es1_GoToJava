public class Main {
    //[0] Appuntamento
    //[1] boolean
    public static Object[] newAppuntamento(int gg,int  h1,int h2){
        Object[] obj = new Object[2];
        obj[0]=new Appuntamento(0,0,0);
        obj[1]=false;
        if ((gg>=0)&&(gg<=366)){
            if (h1<=h2){
                if ((h1>=0)&&(h2<=24)){
                    obj[0]=new Appuntamento(gg,h1,h2);
                    obj[1]=true;
                }
            }
        }
        return obj;
    }

    public static boolean checkSovrapposizioni(Appuntamento app1, Appuntamento app2){
        boolean sovrapposti = false;
        if (app1.getGiorno() == app2.getGiorno()){
            if (app1.getOraInizio()==app2.getOraInizio()){
                sovrapposti = true;
            }else if (app1.getOraInizio()<app2.getOraInizio()){ //se app1 inizia prima di app2
                if(app1.getOraFine()>app2.getOraInizio()){
                    sovrapposti = true;
                }
            }else {
                if(app2.getOraFine()>app1.getOraInizio()){
                    sovrapposti = true;
                }
            }
        }
        return sovrapposti;
    }




    public static void main(String[] args) {
        /*
        Object[] obj = newAppuntamento(1,11,15);//obj[0] --> oggetto Appuntamento da castare
        Appuntamento app2 = new Appuntamento(1,15,16);
        if ((Boolean)obj[1]){
            System.out.println(((Appuntamento) obj[0]).toString());
        }

        if (checkSovrapposizioni(((Appuntamento) obj[0]),app2)){
            System.out.println("Yup");
        }
        */

    }
}

import java.util.*;
public class Main {
    //[0] Appuntamento
    //[1] boolean
    private static ArrayList<Appuntamento> agenda = new ArrayList<Appuntamento>();

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

    public static boolean addAppuntamento(Appuntamento app){
        for (int i = 0; i < agenda.size(); i++) {
            if (checkSovrapposizioni(app, agenda.get(i))){
                return false;
            }
        }
        agenda.add(app);
        return true;
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
        Scanner scanner = new Scanner(System.in);
        int data,oraInizio,oraFine;
        Object[] obj;
        System.out.println("PREMI CTRL+D PER TERMINARE");
        boolean continua = true;
        while (continua) {
            try {

                System.out.println("Inserisci la data");
                data = scanner.nextInt();
                System.out.println("Inserisci l'ora d'inizio'");
                oraInizio = scanner.nextInt();
                System.out.println("Inserisci l'ora di fine'");
                oraFine = scanner.nextInt();
                obj = newAppuntamento(data, oraInizio, oraFine);
                if ((boolean) obj[1]) {
                    if (addAppuntamento((Appuntamento) obj[0])) {
                        System.out.println("Appuntamento aggiunto");
                    } else {
                        System.out.println("Appuntamento sovrapposto");
                    }
                } else {
                    System.out.println("I dati inseriti non sono corretti");
                }
            } catch (Exception e) {
                continua = false;
            }
        }
        System.out.println(agenda.toString());

    }
}

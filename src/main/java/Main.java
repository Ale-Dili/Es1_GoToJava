public class Main {
    //[0] Appuntamento
    //[1] boolean
    public Object[] newAppuntamento(int gg,int  h1,int h2){
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

    public static void main(String[] args) {

    }
}

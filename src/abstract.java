abstract class RBI{
    RBI(){

    }
   abstract void open_account();
   abstract void close_account();
   abstract void show_balance();
   abstract void calculate_SI();
   abstract void deposite_account();
}

class SBI extends RBI{
    private int cbal,cid;
    String cname, city;
    private static int bbal;
    static int count = 100;
    private static float final roi = 7.2f;     //final because no-one can change(override) 7.2 ; //use of final variable,method. 

    SBI(int cbal){
        this.cbal= cbal;
        ++count;
        cid = "SBI-" +count;
        open_account();
    }

    void open_account(){
    
    }
    void close_account(){
        //done through garbage collection
    }
    void deposite_account(){
        cbal = cbal + amt;
        bbal = bbal + amt;
    }
    void show_balance(){
        System.out.println("Balance of the customer = " +cbal+ "with id"+cid);
    }
    void calculate_SI(){

    }
}
class Axis extends RBI {
    private int cbal,cid;
    String cname, city;
    private static int bbal;
    static int count = 100;
    private float final roi = 7.9f; 

    Axis(int cbal){
        this.cbal= cbal;
        ++count;
        cid = "SBI-" +count;
        open_account();
    }

    void open_account(){
    
    }
    void close_account(){

    }
    void show_balance(){

    }
    void deposite_account(){

    }
    void calculate_SI(){

    }
}
class abstract{
    public static void main(String[] arg){
        RBI r= new SBI(1000);
        r.deposite_account();
        r = new Axis(1000);
        r.deposite_account();
    }
}


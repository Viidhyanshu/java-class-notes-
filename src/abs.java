abstract class RBI{
    RBI(){

    }
    abstract void open_account();
    abstract void deposite_account(int amt);
    abstract void calculate_SI();
    abstract void show_balance();
}

class SBI extends RBI{
    private int cbal;
    private String cid;
    String name, city;
    private static int bbal;
    private static  final float roi = 7.2f;
    static int count = 100;

    SBI(int cbal){
        this.cbal=cbal;
        ++count;
        cid = "SBI-" + count;
        open_account();
    }

    void open_account(){
        if (cbal>=1000) {
            System.out.println("Acount opened");
        }else{
            System.out.println("Balance is low");
        }
    }
    void deposite_account(int amt){
        if(amt > 0){
            cbal += amt;
            bbal += amt;
            System.out.println("Amount Deposited" + amt);
        }else{
            System.out.println("invalid amount");
        }
    }
    void calculate_SI(){
        if(cbal > 0){
            int time  = 1;
            float si = (cbal * roi * time)/100;
            System.out.println("imple intrest is "+si);
        }
    }
    void show_balance(){
        if(cbal > 0){
            System.out.println("your id is," + cid + "your balance is" + cbal);
        }else{
            System.out.println("invalid details");
        }
    }

}
class HDFC extends RBI{
    private int cbal;
    private String cid;
    private String name,city;
    private static int bbal;
    private static final float roi = 7.9f;
    private static int count = 100;

    HDFC(int cbal){
        this.cbal = cbal;
        ++count;
        cid = "HDFC" + count;
        open_account();
    }
    void open_account(){
        if (cbal>=1000) {
            System.out.println("Acount opened");
        }else{
            System.out.println("Balance is low");
        }
    }
    void deposite_account(int amt){
        if(amt > 0){
            cbal += amt;
            bbal += amt;
            System.out.println("Amount Deposited" + amt);
        }else{
            System.out.println("invalid amount");
        }
    }
    void calculate_SI(){
        if(cbal > 0){
            int time  = 1;
            float si = (cbal * roi * time)/100;
            System.out.println("imple intrest is "+si);
        }
    }
    void show_balance(){
        if(cbal > 0){
            System.out.println("your id is," + cid + "your balance is" + cbal);
        }else{
            System.out.println("invalid details");
        }
    }
}

class abs {
    public static void main(String[] args) {
        RBI r = new SBI(10000);
        r.deposite_account(500);
        r.calculate_SI();
        r.show_balance();
        System.out.println("-------");
        r = new HDFC(10000);
        r.deposite_account(500);
        r.calculate_SI();
        r.show_balance();
    }    
}

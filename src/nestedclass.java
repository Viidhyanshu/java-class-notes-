class outer{
    private int x;
    static int y;
    outer(){
        System.out.println("outer constructor");
    }
    void displayouter(){
        System.out.println("outer display" + x);
    }
        class inner{
        private int a;
        static int b;
            inner(){
        System.out.println("inner constructor");
    }
    void displayinner(){
        System.out.println("inner display" + a);
        System.out.println("outer display" + x);
    }
    }
}

public class nestedclass {
    public static void main(String[] args) {
        outer o1 = new outer();
        outer.inner in = o1.new inner();
        in.displayinner();
        //in.displayouter();   //we cant call the outer class, it will give error with help of inner class
    }
}
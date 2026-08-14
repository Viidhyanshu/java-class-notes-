class statbf4{
    { // this is called inilizer block or instant block:  which will be called by default by calling any constructor
         System.out.println("lol"); 
    }
    static { // decleared as static block
        System.out.println("first static block");
    }
    
    static { // decleared as static block
        System.out.println("sec static block");
    }   
    
    static { // decleared as static block
        System.out.println("third static block");
    }
    statbf4(){ //constructor
        System.out.println("default");
    }
        statbf4(int x){ // paramaterized constructor 
        System.out.println("paramet");
    }
    public static void main(String[] args) {
        System.out.println("main method start");
        statbf4 s1 = new statbf4();
         statbf4 s2 = new statbf4(20);
    }
}
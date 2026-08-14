class studentf4 {

    private int reg;
    String name;
    int marks;
    String city;

    // Default constructor
    studentf4() {
        System.out.println("def const");
    }

    // Parameterized constructor - 4 parameters
    studentf4(String name, int reg, String city, int marks) {

        // Calling 2-parameter constructor
         //calling to the constructor with 2 parameter of string type -- called constructor chaining
         
        //current obj name = differnet obj name 
        this.name = name;
        this.reg = reg;
        this.city = city;
        this.marks = marks;
        this(name, city);

        System.out.println("para const, with 4 param");
    }

    // Parameterized constructor - 2 parameters
    studentf4(String name, String city) {
        //it called default constructor 'this(name, city);'
        //this(Vii, 56, blr, 67); compile time error, recursion invoke
        System.out.println("para const, with 2 param");
    }

    void get(){
        System.out.println("get method");
    }

    void show() {
    get(); //here this keyword is working in compiler like "this.get();" thats why it is compiling 
        System.out.println("Name = " + name + " Reg no = " + reg);
    }
}

// Separate class
class demof4 {
    public static void main(String[] args) {
        studentf4 s1 = new studentf4();
        studentf4 s2 = new studentf4("Ajay", 10, "BLR", 1);
        s2.show();
    }
}
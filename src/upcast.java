abstract class student_basic {

    protected int roll;

    private String name;

    static int count = 100;

    student_basic(String name) {

        roll = ++count;

        this.name = name;

    }

    void show() {

        System.out.println("name " + name);

        System.out.println("roll " + roll);

    }

    abstract void showdata();

    abstract void showperformance();

}

class Academic extends student_basic {

    private int marks;

    Academic(int marks, String name, int roll) {

        super(name);

        this.marks = marks;

    }
    final void show_basic(){
        System.out.println("roll" + roll);
    }
    void show_aca(int marks) {

        System.out.println("marks of student " + marks);

    }

    void showperformance() {

        System.out.println("performance");

    }

    void showdata() {

        System.out.println("data");

    }

}

class upcast {

    public static void main(String[] args) {

        student_basic s = new Academic(100, "ajay", 1); // upcasting

        s.showperformance();

        s.showdata();

        //System.out.println(s.name);

        //s.show_aca(); will give error because "can't find the symbol"

        //upcasting works only for overridden methods. CTError

        //due to compiler checks only types then bind it
        
    }

}
class student_basic {
    private String name;
    private int reg;
    private String city;
    static int count = 250;

    student_basic(){
        System.out.println("default of base");
        ++count;
    }

    student_basic(String name,String city ){
        System.out.println("vii");
        this.name=name;
        reg = ++count;
        this.city=city;
    }

    public void show_basic(){
        System.out.println("name of student " +name);
        System.out.println("city of student" +city);
        System.out.println("reg of student" +reg);
    }
}

class acedmic extends student_basic{
    private int att;
    private float cgpa;

    public acedmic(){
        super();
        System.out.println("default");
    }

    public acedmic(int att, float cgpa, String name,String city){
        super(name, city); 
        System.out.println("parameterized");
        this.att=att;
        this.cgpa=cgpa;
        
    }

    public void show_acad(){
        System.out.println("att of student" +att);
        System.out.println("cgpa of student" +cgpa);
    }
}

class inher{
    public static void main(String[] args) {
        acedmic a1 = new acedmic();
        acedmic a2= new acedmic(23,56.0f, "Vii", "Benguluru");
        a1.show_acad();
        a2.show_acad();
        a2.show_basic();
    }
}


//first it calling 1st class i.e default then 2nd class i.e. default then it go inside of 1st class calling vii 
// after that it goes to 2nd class nested and calling parametrized then its goes in main calling a1,a2show_acad then it call a2.show_basic();
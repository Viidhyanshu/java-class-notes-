class student{
    int name;
    int marks;
    int att;
    int reg;
    String city;
    static int count = 250;

    student(int marks, String city){
        this.marks = marks;
        this.city = city;
        reg = count++;
    }
    void getattendence(){
        ++att;
    }
    void show(){
        System.out.println("Name of student =" + name);
        System.out.println("reg of student" + reg);
        System.out.println("city of student" + city);
        System.out.println("att of student" + att);
    }
    void findcity(){

    }
}
class arrf4 {
    public static void main(String[] args) {
        student s[] = new student[5];

    }
}


import java.util.*;
class student{
    String name;
    int marks;
    int att;
    int reg;
    String city;
    static int count = 250;

    student( String name, String city, int marks){
        this.name = name;
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
    static void findcity(student s[]){
        for(int i =0 ; i < s.length; i++){
            if (s[i] != null && "Jaipur".equalsIgnoreCase(s[i].city)){
                System.out.println("Student from Jaipur"+ s[i].name);
            }
        }
    }
    
}
class arrf4 {
    public static void main(String[] args) {
        student s[] = new student[3];
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < s.length; i++) {
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("enter city");
            String city = sc.next();
            System.out.println("enter marks");
            int marks = sc.nextInt();
            s[i]= new student(null, null, i);

        }
        student.findcity(s);

    }
}


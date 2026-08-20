import java.util.*;
class employee{
    String name;
    String city;
    int salary;
    int id;
    String company;
    private static int count =1;

    employee(String name, String city, int salary){
        this.name= name;
        this.city = city;
        this.company= "Infosys";
        this.salary = salary;
        this.id = count++;
    }
    static void findcity(employee s[]){
        for (int i = 0; i < s.length; i++){
            if(s[i] != null && "Jaipur".equalsIgnoreCase(s[i].city)){
                System.out.println("From jaipur");
                s[i].show();
            }
        }
    }
    static void findsalary(employee s[]){
        for (int i = 0; i < s.length; i++){
            if(s[i] != null && s[i].salary >= 50000){
                 System.out.println("salary greater than 50k");
                 s[i].show();
            }
        }
    }

    void show(){
        System.out.println("Name of employee =" + name);
        System.out.println("Salary of employee =" + salary);
        System.out.println("City of employee =" + city);
        System.out.println("Company of employee =" + company);
    }
}

class employeedata{
    public static void main(String[] args){
        employee s[]= new employee[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < s.length ; i ++){
            System.out.println("name");
            String name = sc.next();

             System.out.println("city");
            String city = sc.next();

            System.out.println("salary");
            int salary = sc.nextInt();

            s[i]= new employee(name,city,salary);
        }

        employee.findcity(s);
        employee.findsalary(s);
    }
}
## JAVA NOTES 3Aug
---
- runtime can change based on reqirement 
- compiletime doesnt chnage 
- if there is no calling in main then it isnt compile time polymorphysim i.e. method overloading
- method name and parameter are checked first while calling a function
> method of signature consists of :method name, number of argu, types of argu and order of argu.

- can we overload java main() method? NO because there is only one main
- compiler can compile the main 'any number of public static void main(string arg) with same name' but not with (string args[]);
- @ time of compile we check compile time not overloading 
- compile time polymor in java - static binding
------


## Constructor
- need of constructor : it is special member of the class becaue it is the only fn wich can have same name as classNAme, it is the only fn which never has return type of before its name 
- it inislize the obj at same time of creation 
- every time an obj is created using new() keyword atleast one constructor is called
- we can make const wit parameter as well 
- it cinst dont take any parameter it called default const
- default const is inbuild with compiler/ automatically inbuild 
- students(){
    roll= 110;
    name = "Ajay;
}.   it will make every student object as students
- const cna tbe inherited 
- a const cant be any of these : static, abstract, or final
- void  students(){
    roll= 110;
    name = "Ajay;
} it nows works like normal function, to call obj.objName()
- 



## 10Aug
- can we execute any program without main()
   ans- it depends upon the version of java
   
    * static block, variable, method

 we can make n time of static block  : it can excute the program; 
  we can write anywhere ststic block, it can execute anywhere;

- static blolck only calls once, instance block it will be called for every objects that are made (for const also);
  main method;

- ----

# this keyword

- refered as current class instant variable
- it helps in the calling of obj from one class to another
- calling the one constructor from another const
- used for calling another method from a normal method
> 'this' MUST be first statement in constructor because it can generate compile time error
-

## 11 Aug

# Object as an arugment & Object as return type 
---
- Object as an arugment - to communicate between two or more objects
- Object as return type - we can return multiple value through an object


## STRINGS & ARRAY
# 13 Aug
---- 
 - printf cant print any thing without memory allocation, it always take base address and starts print untill it find first null.

 - 
----
> in "c": 
#include <stdio.h>

int main() {
     
    // Write C code here
    printf("GHANSHYAM"); >take memory in rom
    char *p ="RAGHU"; >take memory in rom
    char c[]= "JAIPUR";
    char x[6]= {'J','A','I','P','U','R'}; >> it is wrong assignment, printf will give garbage value in last
    printf("%s", p-9); >> OUTPUT GHANSHYAM_HANSHYAM
    printf("%s", x);
    return 0;
> printf("%d" +1 ); will give 'd' as output because it treated as string [%,d,10] d= 1 idx;
}
----

- in java string is an obj that represent a sequence of characters.
- the "java.lang.String" class is used to create a string object (lang is a name of default package in java)
- obj of string are immutable which mean a consatant and cant be chnaged once created 
- string are type of obj that can store the chara of value and in java, every char is stored 16-bits i.e. UTF 16 bits encoding.
- String acts the same as an array of chara in java

- an array of char work smae as java string eg:
 * char[] ch ={'E'N'G'I'N'N'E'R'}
 * string s = new(String)

- String s1 = "Welcome"
  String s2 = "Welcome" >> it doesnt crate new instance (s2, s1 will point on welcome in heap)

- each time we create a string litral, the jvm checks the string constant pool first.
if the string already exists in the pool a reference to the pooled instance is returned.
if the stirng doesnt exist in the pool, a new string instance is created and placed in the pool.

- String s= "sachin";
s.contact("tendulkar"); >> it will make new string in string constant pool area in heap
system.out.println(s);
>JIR: Java instant reference

- in java this is how we write array in java
int arr [] = {1,2,2,2,,222,}
- array is a constant pointer, but pointer is variable

## 14 Aug
# Java string compare
 * there are 3 method 
 1- equal() method : boolean is return type
 2- using == operator : boolean is return type
 3- by compareTo() method

- string is a class not a variable, so we use equal() method
- compare the references (== operator)
- boolean takes only 1bits, so we use it in return type of T & F
- the string concatention operator can concatenate not only string but primitive value also

- in c :
  char c[3][30] = {"ram", "ajay", "ghanshyam singh raghuwansi"} //if name is small the space will waste;
  so we can use like this
  char * p [3] = {"ram", "ajay", "bhdUILKFAEWC BFBQHX LW"}; // p is an array of 3, pointer to char, we describe like this

## 17 Aug
# Arrays 
- 
int a[2][3]={10,20,30,40,50,60};
printf("%U", a[0]+1) - 1004

- Array is treated as object in java because it stores in heap

- in how many ways array can declear in java :
   * int[] a;
   * int []a;
   * int a[];
   * int[][] a;
   * int [][]a;
   * int a[][];
   * int[] a,b; // 1d array a & b
   * int []a,b[]; //1-D array a & 2D array b
   * int[] a[], b[];
   * int[], a, []b; //wrong way this, []b it is complie time error, we dont write array on second element

-  we never write size of array in java: arr[5] X
- we inilitisation like this :
  * int a[] = new int[5];   //LHS in statck and RHS in heap
  * int a [] = {1,2,2,3,4,5};
  * int a[] = new int[5] {1,2,3,4,5};

## 24 Aug
# String buffer and string builder
----
- to make imutable string in java
- string buffer is syncronised
- string builder isnt syncronised
- capacity : (old capacity * 2) + 2


# Nested class in java
----
- can we have ststic class : yes;
- syntax :
      class outer class{
        class inner class{
          void display();
          sout("hello from inner class);
        }
        psvm(){
          outerclass outer = new outerclass();
          innerclass inner = outer.new innerclass();
          inner.display();
        }
      }

- private data member can be accesed by inner class

# Inheritance
- it is the property in which one class inheritance the property of other class
- syntax:
      class Subclass-name extends Superclass-name{

      }
> extends keyword indicate that you are making a new class thats derives from existing class.
      
      * subclass -- derive class
      * superclass -- base class

- there is no multiple class in java but in cpp it is.
- Access specifier in inheritance:
        a- public
        b- deafult
        c- private - accessible in same class only, derive class and outside of the class isnt accessible
        d- protected- accessible to base class, outside the class of same package only and derive class in the same package and outside of package


# 25 Aug
# Inheritance
----

- Single, Multilevel, Hierarchical, Multiple, Hybrid : there are the type of Inheritance
- Multiple isnt supported thorugh classes in java but works in cpp due to 'virtual method' in cpp
- whenver we creat object of complete class, we select derive class because it contain all things

>supuer() transfer the controll from derive class 



# 26 Aug
----
# supuer keyword
- this keyword in java is reference variable which is used to refer immiedte parent class obj.
- super.super = a -- will give CTErroe
- obj which doesnt have reference in stack is called annoymous object/ unknown obj.


# Abstract class
----
- class which has atleast one abstract method
- abstract method - a method which has only decleration and not defination
- abstraction is the process of hiding the implementation details and showing only function to the user
- it use in case of inheritance
- ways to achive abstraction :
  * Abstract class(0 to 100%)
  * Interface(100)

- Instantiation in Java is the process of creating an object (or an instance) from a class blueprint. This process
  allocates memory on the heap for the new object and returns a reference that allows you to interact with it.

- student s = new student(); 
     here new student() is  initializtaion which is done by constructor
     s is Instantiation
     we cant Instantiation obj of reference class

- student s = new student(); 
    s.add();

    compiler will throw CTErroe because here its defination isnt present 

- it cant be inheritance
- it can have const and static method also
- it can have abstract and non abstract method
- an abstract class MUST be declear with an abstract keywords
- syntax :
  abstract class{.  }

# 7 sept
- Abstract class generally use Hierarchical inheritance.

- Shape s= new circle(); //this is called upcasting.

    s.draw(); //we have 3 void display function with draw
    this is called Run time, Dynamic method dispatch, late binding

- compiler cant see the address it only binds the method.(checking the type of refernce)
- we cant define final() in abstract class
> dynamic binding = method overriding + up casting

# 8 sept

class upcast {

    public static void main(String[] args) {

        student_basic s = new Academic(100, "ajay", 1); // upcasting

        s.showperformance();
        s.showdata();
        //System.out.println(s.name);
        //s.show_aca(); will giv error because "cant find the symbol", 
        //upcasting works only for overhidden methods. CTError
    }
}

# 14 sept
- finalize method use for cleaning the space from heap, it belong to objcet class

- Object{
  finalize();
  toString();
  equals();
  hashCode();
  system.gc();
}

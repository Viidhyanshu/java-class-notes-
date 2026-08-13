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

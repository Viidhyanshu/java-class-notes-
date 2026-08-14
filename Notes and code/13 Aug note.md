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

# Java string compare
 * there are 3 method 
 1- equal()
 2- using == operator
 3- by compareTo() method

- 

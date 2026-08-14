 class strcomp {
 public static void main(String[] args) {


     String s = 50+30+"vii"+40+40; // expression will solve left to right: 80vii4040
    
     //cpgemini question
     String arr[] = {"meow", "bark", "moo"};
     String v = "meow";
     System.out.println(arr[0]==v); //true CPA 

    //Company question
     String x = "meow";
     String xb = x + "deal";
     String xbc = "meowdeal";
     System.out.println(xb == xbc); // false

     

     //compare method
    String a = "Ajay"; //a and b are in stack and ajay in heap so both pointing to ajay : it will return true
    String b = "Ajay";
    String c = "Dev";
    String d = "Dev";
    String e = new String("Dev");
    String f = c.concat("raj");
    String g = "Ramesh";
    String h = "Rajesh";
    System.out.println(a==b);
    System.out.println(a.equals(c)); // it is false because containt is false 
    System.out.println(c==e); // false because different pool area
    System.out.println(c.equals(e)); //true
    System.out.println(f==d); //false because it isnt in heap, it is in constant pool area
    System.out.println(g.compareTo(h)); // will give 3, comparing letters
    System.out.println(s);

 }   
}

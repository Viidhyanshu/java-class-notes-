 class strbuff {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer();

        StringBuilder s2 = new StringBuilder();
        s2.append("hello");
        System.out.println(s2.capacity());
        System.out.println(s2.charAt(0)); //to check the first letter of string
        System.out.println(s2.reverse()); //to reverse string
        System.out.println(s1.substring(0));  // to fing substring 
        

        System.out.println(s1.capacity()); //to check capacity
        s1.append("hello i am a bad boy and coming late in OOPs class"); 
        System.out.println(s1.capacity());

        
    }    
}

class employee{
    int id;
    String name;
    static int count = 0;
    employee(){
        id = ++count;

    }employee(String name){
        this.name=name;
        id =++count;
    }
    public void show(){
        System.out.println("name of employee" +name);
        System.out.println("id of employee"+id);
    }
    public employee getobj(){
        employee e = new employee();
        return e;
    }
    public void finalize(){
        System.out.println("EMPLOYEE" + this + "has been kicked out");
    }
    public String toString(){
        System.out.println(super.toString());
        return name+ " ," + id;
    }
}

 class garbage {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1 = null; //garbage
        employee e2 = new employee("Ajay");
        e2=e2.getobj(); //Re-Assignment of the reference
        //employee e3 = e1.getobj(); //e1 is pointing to the null to e3, get the garbage not e1
        employee e3 = e2.getobj();
        System.gc();
        System.runFinalization();
        System.out.println("im the last line");
        System.out.println(e2);
    }
    
}



//using a reference variable of Super class to a Sub class

class BASE{
    int BASE_A;
    float BASE_B;
    void BASE_on(){
        System.out.println("In the Base Class");
    }
}

class SUB extends BASE{
    boolean SUB_C;
    void SUB_on(){
        System.out.println("In the Sub Class");
    }
}

class refMAIN{
    public static void main(String[] args) {
        BASE lol = new SUB();                                   //used a base reference variable to create a Subclass object
        //System.out.println("lol.SUB_C: " + lol.SUB_C);        //although it can ONLY access the inherited members of the subclass from the super class
        lol.BASE_on();                                          //or put simply, it cannot access any newly defined members of the subclass
        //lol.SUB_on();
    }
}
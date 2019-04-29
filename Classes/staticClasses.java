//nested classes
//static classes: static inner classes defined within another class
//they can access only the static members of the ooter class
//only nested classes can be static

class OuterTop{
    float outer_float;
    static int outer_int = 3000;                                            //static member
    static class InnerIn{
        boolean inner_bool;
        OuterTop outer_obj = new OuterTop();
        void inner_display(){
            System.out.println("In inner_display");
            //System.out.println("outer_float = " + outer_float);           //static classes cannot access the non-static members of enclosing class directly
            System.out.println("outer_float = " + outer_obj.outer_float);   //these members of enclosing class have to be referenced through an instance
            System.out.println("inner_bool = " + inner_bool);
            System.out.println("outer_int = " + outer_int);                 //accessing static member
        }
    }
}

class staticClassDemo{
    public static void main(String[] args) {
        OuterTop.InnerIn inner_obj = new OuterTop.InnerIn();                //to use static class members, no creation of instance of enclosing class is needed
        inner_obj.inner_display();                                          //using the member method of nested class directly
    }
}
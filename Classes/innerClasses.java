//nested classes
//inner classes: non-static classes defined within another class
//these classes can access both static and non-static members of the outer class

class Outer{
    private int outer_int;
    boolean outer_bool;
    Inner inner_obj2 = new Inner();
    Outer(){
        this.outer_int = 5;
        this.outer_bool = true;
    }
    void test(){
        Inner inner_obj = new Inner();                      //creates an instance of the Inner class
        inner_obj.inner_display();                          //the scope of the object is only in this method
    }
    // this is an inner class
    class Inner {
        private int inner_int;
        boolean inner_bool;
        Inner(){
            this.inner_int = 100;
            this.inner_bool = false;
        }
        void inner_display() {
            System.out.print("In inner_display: ");
            System.out.println("outer_int = " + outer_int + ", outer_bool = " + outer_bool);        //the data members, even the private data members, are accessible in the Inner class just like any member method
            System.out.println("inner_int = " + this.inner_int + ", inner_bool = " + inner_bool);
        }
    }
    void outer_display(){
        System.out.print("In outer_display: ");
        System.out.println("outer_int = " + outer_int + ", outer_bool = " + outer_bool);
        //System.out.println("inner_int = " + this.inner_int + ", inner_bool = " + inner_bool);     //data member of the Inner class cannot be accessed in the outer class
    }
}

class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer_obj = new Outer();
        outer_obj.test();
        outer_obj.outer_display();
        //outer_obj.inner_obj.inner_display();                                                      //Since the scope of inner_obj is within test() in Outer
        outer_obj.inner_obj2.inner_display();                                                       //inner class members need an outer class instance to use
    }
}
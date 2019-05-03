//dynamic method dispatch
//if any superclass reference holds an object of a subclass  which overrides any method
//defined by the superclass, the java interpreter determines which subclass' overriden method
//to call once it has been invoked at runtime

class A{
    void override(){
        System.out.println("In A");
    }
}

class B extends A{                          //hierarchical inheritance
    void override(){
        System.out.println("In B");
    }
}

class C extends A{
    void override(){
        System.out.println("In C");
    }
}

class dynamic{
    public static void main(String[] args) {
        A obj = new A();                    //superclass reference, to superclass object
        obj.override();                     //invokes superclass method
        obj = new B();                      //superclass reference to subclass object
        obj.override();                     //invokes subclass method
        obj = new C();
        obj.override();
    }
}
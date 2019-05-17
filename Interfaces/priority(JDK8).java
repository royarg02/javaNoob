//priority of interface members(JDK staticMethodsInInterfaces(JDK8)8)
//since interfaces can have default implementations and are inheritable, Java defines set of rules about overriding and visibility of
//the data members and functions of the interfaces

//The prioriry is as:   super-interface < sub-interface < implementing class
//the priority works ONLY if one entity overrides the data member/function of an entity lower in priority

interface Super{
    int data = 4;
    void display();
    default void function(){
        System.out.println("In the Super interface");
    }
}

interface Other{
    default void display(){
        System.out.println("In the Other interface");
    }
}

interface Sub extends Super{                            //this sub-interface does not overrides variable 'data' from 'Super'
    default void display(){                             //overriding display() from 'Super'
        System.out.println("In the Sub interface");
    }
    default void function() {                           //overriding function() from 'Super'
        System.out.println("Invoking function() in Super from Sub:");
        Super.super.function();                         //invoking function() of 'Super' interface
    }
}

//class Implement implements Sub,Other{                 //implementing two interfaces with same default method is not allowed if the class itself does not overrides it
class Implement implements Sub{
    public void display(){                              //overriding display() from 'Sub'
        System.out.println("data: " + data);
    }
}

class Example{
    public static void main(String[] args) {
        Implement obj = new Implement();
        obj.display();
        obj.function();
    }
}
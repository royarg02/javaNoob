//static interfaces methods (JDK8)
//static methods can be defined in interfaces to be invoked without implementation

interface MyInterface{
    int returnInt();
    static void showString(){                                   //this method is not inherited in the implementing class, or sub-interfaces
        System.out.println("Invoked without implementation");
    }
}

interface SubMy extends MyInterface{

}

class INT implements MyInterface{
    int var;
    INT(int x){
        this.var = x;
    }
    public int returnInt(){
        return this.var;
    }
}

class staticDemo{
    public static void main(String[] args) {
        INT obj = new INT(10);
        System.out.println("This obj contains: " + obj.returnInt());
        MyInterface.showString();                                       //static methods are invoked by the interface name
        //SubMy.showString();                                           //static method, not inheritable
    }
}
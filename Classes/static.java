//static
//static data members or methods require no object creation to use
//the static keyword can be used in three ways

class staticTest{
    static int Num;                                                 //data members as static: these data members are initialized with any provided value as the class is loaded
    static int Num2 = 56;
    static{                                                         //static block: the statements in this block are run as soon as the class is loaded
        Num = 3498;
        System.out.println("Inside Static Block");
        System.out.println("Num = " + Num + " Num2 = " + Num2);     //blocks defined as static cannot use the 'this'(and 'super') keyword
    }
    static int doubler(){                                           //static method: these functions can be used without creating any object, but must work only on 'static' data
        System.out.println("Hey! You are in a static method!!");
        justPrint();                                                //static methods can only call other static methods
        return Num*2;                                               //methods defined as static cannot use the 'this'(and 'super') keyword
    }
    static void justPrint(){
        System.out.println("Hey! You are in another static method!!");
    }
    void modify(int x){
        Num = x;
    }
}

class staticMain{
    public static void main(String[] args) {                        //static method as it is the first method to run before declaration of ant object
        System.out.println(staticTest.doubler());                   //static methods are called by the class name
        staticTest.justPrint();
        staticTest ob1 = new staticTest();
        staticTest ob2 = new staticTest();
        System.out.println(ob1.Num);                                //static data members(and methods) are shared across objects
        System.out.println(ob2.Num);                                //they although require the name the class instead, just like the static methods
    }
}
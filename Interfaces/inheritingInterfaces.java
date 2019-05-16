//Inheriting Interfaces
//Like classes, interfaces can also be interfaced. In that case all the methods and
//values of the parent interface become part of the inheriting interface

interface parent{
    String type = "Parent";                 //Defining a 'FINAL' variable
    void func1();
    void func2();
}

interface child extends parent{             //inherting 'parent'
    String type = "Child";                  //the child interface can still change the value of the data members, before implementation
    void func3();
}

class extendTest implements child{          //implementing 'child'
    public void func1(){
        System.out.println("From interface parent");
    }
    public void func2(){
        System.out.println("String type: " + type);
    }
    public void func3(){
        System.out.println("From interface child");
    }
}

class showResult{
    public static void main(String[] args) {
        extendTest obj = new extendTest();
        parent A = obj;
        A.func1();
        A.func2();
        //A.func3();                        //can't access as the method is not defined in the 'parent' interface
        child B = obj;
        B.func3();
    }
}

//interfaces, when compiled, CREATES A .class FILE, just like classes
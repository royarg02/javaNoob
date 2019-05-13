//dynamic method dispatch using interfaces
//like superclass references, any reference to an interface can be used to refer to any object of a class which
//implements the interface

interface display{
    int demo = 399;
    void print();
}

class one implements display{
    public void print(){
        System.out.println("this is one");
    }
}

class two implements display{
    public int dataTwo = 42;
    public void print(){
        System.out.println("this is two");
    }
}

//partial implementation
//any class that does not fully implement an interface must be declared as 'abstract'

abstract class three implements display{
    void show(){
        System.out.println("This is three: three.demo = " + demo);
    }
    //abstract public void print();               //any inheriting subclass must override this method
}

class interfaceDemo{
    public static void main(String[] args) {
        display ref;                            //defined a interface reference
        ref = new one();                        //object of class 'one'
        ref.print();
        ref = new two();                        //object of class 'two'
        ref.print();

        //System.out.println("two.dataTwo: " + ref.dataTwo);    //instance references cannot access members of the implementing class
                                                                //not defined by itself
        System.out.println("two.demo: " + display.demo);
    }
}
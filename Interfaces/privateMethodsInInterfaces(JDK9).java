//private interface methods(JDK 9)
//private interface methods work and behave similar to private methods in classes, i.e., they cannot be used outside the body of the interface
//they are used to provide similar functionality to 'default' methods

interface PRIVATE{
    private int getRemainder(int num, int div){
        return num % div;
    }
    default void showHigh(int num, int div){
        System.out.println("Highest multiple of " + div + " less than " + num + ": " + (num - getRemainder(num, div)));
    }
    default String check(int num){
        return (getRemainder(num, 2) == 0 ? "Even" : "Odd" );
    }
}

class Myclass implements PRIVATE{                                   //no overriding of implementations
}

class PriImplement{
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        //obj.getRemainder(89,12);                                  //illegal
        obj.showHigh(529, 14);
        System.out.println(123 + " is " + obj.check(123));
    }
}
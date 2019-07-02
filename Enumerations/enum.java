//Enumerations are collection of constant variables that can be ONLY contained in a reference object of the enum type
//Unlike in C/C++, each enumerated constant does not translate to integer values but have a value of its own
enum Test{
    VIOLET, INDIGO, BLUE, GREEN, YELLOW, ORANGE, RED;       //constants
}
class Enum{
    public static void main(String[] args) {
        Test Const;                                         //reference of enum type
        Const = Test.GREEN;                                 //constants of enums are refernced by the enum name
        //int a = Test.GREEN                                //not allowed
        //in switch case however, the constants are referenced without the enum name
        switch(Const){
            case YELLOW:    System.out.println("This is Yellow");
                            break;
            default:        System.out.println("This is not yellow");
        }
        //the enum name (or more accurately, the type) is obtained from the test object
        try{
            System.out.println("Value of BLACK: " + Test.valueOf("BLACK"));         //valueOf() returns the enum type constant of the argument string
        }
        catch(Exception e){
            System.out.println("The earlier statement throws an exception as there is no \"BLACK\" constant of Test\nValue of RED: " + Test.valueOf("RED"));
        }
        for(Test tmp : Test.values()){                  //values() returns an enum array of the constant values
            System.out.println(tmp.toString());
        }
    }
}
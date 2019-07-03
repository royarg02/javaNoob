//autoboxing
//the Java compliler automatically converts the primitive values to the objects whenever required
//same for vice-versa (auto-unboxing)
class Box{
    public static void main(String[] args) {
        Integer in = 123;                       //Wraps '123' into an object, assigns reference to 'in'
        int getBack = in;                       //returns the int value of 'in', stores in 'getBack'

        //this also occurs in function calls
        Demo(999);

        //Autoboxing can also be used in expressions
        Double Area = (22/7) * 6.9 * 6.9;
        System.out.println("Area = " + Area);
        System.out.println("++in = " + ++in);
        
        //Autoboxing can also be used in control statements like
        Boolean check = true;
        while(check){
            System.out.println("in is now: " + in++);
            if(in == 130){
                break;
            }
        }
    }
    static void Demo(Integer obj){
        System.out.println("Demo() got: " + obj.intValue());
    }
}
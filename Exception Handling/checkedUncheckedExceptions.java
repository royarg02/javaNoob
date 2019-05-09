//unchecked exceptions
//exceptions which do not required to be mentioned in the throws list
//checked exceptions MUST be mentioned in the throws list when required

class throwClass{
    static void ex1(){
        try{
            throw new NumberFormatException("Mentioning in throws not required");
        }
        catch(ArithmeticException e){
            System.out.println("This exception will not be caught");
        }
    }
    static void ex2()throws NoSuchMethodException{                                  //checked exception mentioned here
        try{
            throw new NoSuchMethodException("Must mention in the throws list");
        }
        catch(IllegalStateException e){
            System.out.println("Useless catch clause");
        }
    }
}

class types{
    public static void main(String[] args) {
        try{
            try{
                throwClass.ex1();
            }
            catch(NumberFormatException e){
                System.out.println("Caught exception in ex1() here: " + e);
                throwClass.ex2();
            }
        }
        catch(NoSuchMethodException e){
            System.out.println("Caught exception in ex2() here: " + e);
        }
        finally{
            System.out.println("After try-catch");
        }
    }
}
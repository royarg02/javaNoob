//throw
//deliberately throw an exception in program
//throws
//if any block of a method does not have a exception handler for the type of exception it is going to throw
//then it is declared in the definition of the method to inform any code that calls this method

class dummy{
    static void function()throws ClassNotFoundException{                    //this function does not have any catch for ClassNotFoundException
        try{
            throw new ClassNotFoundException("Caught first Exception!!");   //the argument is the additional message to display at exception
        }
        catch(ArithmeticException error){
            System.out.println("Exception: " + error);                      //this exception will not be thrown
        }
    }
}

class THROW{
    public static void main(String[] args) {
        try{
            try{
                dummy.function();                                               //nested try
            }
            catch(ClassNotFoundException e){
                System.out.println("Exception: " + e);
                throw new NullPointerException("Null pointer this time!!");
            }
        }
        catch(NullPointerException e){
            System.out.println("Exception: " + e);
            System.out.println("The Message of the exception is: " + e.getMessage());
        }
    }
}
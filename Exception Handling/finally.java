//finally
//a block of code which must execute after a try statement, regardless of whether an exception is raised or not

class fin{
    static void funcA(){
        try{
            throw new ArithmeticException("Inside funcA");
        }
        catch(ArithmeticException e){
            System.out.println("Caught Exception from funcA: " + e);
        }
        finally{
            System.out.println("After throw of funcA");
        }
    }
    static void funcB()throws InterruptedException{
        try{
            throw new InterruptedException("Inside funcB");
        }
        catch(NullPointerException e){
            System.out.println("This exception will not be caught");
        }
        finally{
            System.out.println("After throw of funcB");                         //this statement will be executed before returning back to main function
        }
    }
}

class finDemo{
    public static void main(String[] args) {
        fin.funcA();
        try{
            fin.funcB();                                                        //nested try
        }
        catch(InterruptedException e){
            System.out.println("Caught exception from funcB: " + e);
        }
    }
}
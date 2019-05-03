//try-catch statement
//this statements are used to handle any execption raised without any termination of the program
//if no try-catch statements are defined at the time of exception, the control passes to the default
//run-time handler, which stops the executoion of the program

class divideZero{
    static int A;
    static int Q;
    static void function(){
        A = 1234;
        Q = 0;
        try{                                                            //see this block for any execeptions
            System.out.println("A/Q = " + (A/Q));                       //deliberately causing Divide by zero error
            System.out.println("Control jumps to catch block");         //thus this statement is not executed
        }
        catch(ArithmeticException e){                                   //'catches' the said execption; the exception object contains the description of the exception
            System.out.println("Divide by Zero is not allowed!!!");
            System.out.println("Exception: " + e);                      //displaying the raised exception
        }
        System.out.println("After try-catch");                          //execution resumes after try-catch
    }
}

class tcMain{
    public static void main(String[] args) {
        divideZero test = new divideZero();
        test.function();
    }
}
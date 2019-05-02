// WAP to simulate DIVDE BY ZERO excpetion
class Excep{
    public static void main(String args[]){
        try{
            int num = 10;
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("There is an Exception==> " + e.toString());
        }
    }
    
}

// OUTPUT:
// There is an Exception==> java.lang.ArithmeticException: / by zer
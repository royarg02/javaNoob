//nested try-catch statements
//any exception raised in a nested try statement will make the run time to search for any matching catch clauses
//beginning from the inner try statement to the catch clause of outer try statements

import java.util.Scanner;

class nestTry{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        int[] A = new int[5];
        try{
            A[2] = 20;
            try{
                System.out.print((23/x));                       //x = 0 raises an exception                                   
                try{
                    System.out.print(x / (x % 5));              //divide by zero if x is a multiple of 5
                    tryMethod(A);                               //any function call which has its self try-catch statement acts as another nested try-catch statement
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Exception: " + e);
                } 
            }
            catch(ArithmeticException e){
                System.out.println("Execption: " + e);
            }
        }
        catch(Exception e){
            System.out.print("Some other exception");
        }
    }
    static void tryMethod(int[] arr){
        try{
            arr[15] = 50;                                         //out of bounds exception
        }
        catch(NumberFormatException e){
            System.out.println("This exception will not be thrown");
        }
    }
}
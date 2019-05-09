//multiple catch clauses
//giving multiple catch clauses makes the checking of EACH of the exceptions provided

import java.util.Scanner;

class multCatch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number, say x: ");
        int x = input.nextInt();
        try{
            System.out.println("42/x results to " + (42/x));                //x = 0 results to an exception thrown
            System.out.println("if x = 0, this and the following statements will be skipped to the catch clause");
            int parse = Integer.parseInt("qwerty");                         //"qwerty" in not an integer
        }
        /*catch(Exception e){
            System.out.println("This will be executed everytime an exception is raised, ignoring the specific catch clauses");
        }*/
        catch(ArithmeticException error){
            System.out.println("Exception raised: " + error);
        }
        catch(NumberFormatException parseError){
            System.out.println("Exception raised: " + parseError);
        }
        catch(Exception e){                                                 //since all the exceptions are subclasses of 'Exception', catch clauses
            System.out.println("Some other exception raised.");             //for specific exceptions have to be declared BEFORE the catch handling
        }                                                                   //the general Exception clause, as it will be executed for any exception
        System.out.println("After exception.");
    }
}
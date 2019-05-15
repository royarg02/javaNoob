/*WAP to handle "DIVIDE BY ZERO" exception with the following message in finally block: "Exception occurred" if the quotient
is -1, otherwise print the result in finally block. Set quotient initially -1 as default*/

import java.util.Scanner;

class Excep{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num, div, quotient = -1;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Enter another number: ");
        div = input.nextInt();
        try{
            quotient = num/div;
        }
        catch(Exception e){
            System.out.println("There is an Exception==> " + e.toString());
        }
        finally{
            if(quotient == -1){
                System.out.println("Exception Occurred");
            }
            else{
                System.out.println("The quotient is: " + quotient);
            }
        }
    }
    
}

/*OUTPUT:
Enter a number: 12
Enter another number: 3
The quotient is: 4

Enter a number: 13
Enter another number: 0
There is an Exception==> java.lang.ArithmeticException: / by zero
Exception Occurred
*/
import java.util.Scanner;
//Scanner class is mainly used for parsing of primitive types,
//but can be also used to get input from console
class scan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //define scanner object, bind with standard input
        System.out.println("Type something: ");
        String text = input.nextLine();             //returns the input in the form of String
        System.out.println("The number of characters entered is " + text.length());
        System.out.println("Enter a number: ");
        int integer = input.nextInt();              //returns the input in the form of integer
        System.out.printf("The number you entered is %s\n",(integer % 2 == 0)? "Even" : "Odd");
        System.out.println("Enter a float: ");
        float fraction = input.nextFloat();         //returns the input in the form of float
        System.out.printf("The float rounded to two places after decimal is: %.2f",fraction);
        input.close();                              //closing the scanner class
    }
}
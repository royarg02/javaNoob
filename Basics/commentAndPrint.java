//comments and print
//single line comment

/*Multi-line
comment*/

class print{
    public static void main(String args[]) {
        //there are two ways to print (unformatted) in java
        System.out.print("This is printed using print() function ");
        System.out.print("this function prints the arguments supplied to it ");
        System.out.print("and continues to print in the same line ");
        System.out.print("without any newline character.\n");
        
        System.out.println("This is printed using println() function");
        System.out.println("this funtion automatically inserts a newline character");
        System.out.println("at the end.");

        //formatted output
        String text = "formatted text";
        System.out.printf("The printf() function prints %s with more than %s arguments\n",text,"one");
        System.out.printf("%d is the leap year after %d\n",2020,2016);
        System.out.printf("PI upto 8 decimals: %.8f\n",Math.PI);
    }
}

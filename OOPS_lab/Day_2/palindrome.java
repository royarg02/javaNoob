/*Write a program in Java where you have to take a string as input using 
command line argument and check whether it is palindrome or not*/

class palindrome{
    public static void main(String args[]) {
        int i=0,j=args[0].length()-1;
        while(j>=i){
            if(args[0].charAt(i)!=args[0].charAt(j))
                break;
            ++i;
            --j;
        }
        if(i>j)
        System.out.print("The argument "+args[0]+" is palindrome");
        else
        System.out.print("The argument "+args[0]+" is not palindrome");
    }
}

/*
Output:
java palindrome racecar
The argument racecar is palindrome

java palindrome hello
The argument hello is not palindrome
*/
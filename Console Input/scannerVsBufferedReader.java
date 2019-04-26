import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

//Advantages of BufferedReader over Scanner
//although the syntax of BufferedReader is clumsy as compared to Scanner, it is very useful for taking inputs one after the other

class input{
    public static void main(String[] args) throws IOException{
        scannerTest.MAIN();
        bufferTest.MAIN();
        System.out.print("\nNotice the scanner simply skips over the second input");
        //this only happens when a STRING is read after reading any other type of datatype function
        //the problem with scanner class is analogous to having multiple scanf() functions in C
    }
}

class bufferTest{
    static void MAIN() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nIn the BufferedReader Class");
        System.out.print("Enter a number: ");
        int aNum = Integer.parseInt(br.readLine());                             //taking a input(parsing it to integer from string)
        System.out.print("Enter a name: ");
        String aName = br.readLine();                                           //taking the next input
        System.out.printf("Number: %d, Name: %s",aNum,aName);
        br.close();
    }
}

class scannerTest{
    static void MAIN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("In the Scanner Class");
        System.out.print("Enter a number: ");
        int aNum = sc.nextInt();                                                //taking an input
        System.out.print("Enter a name: ");
        String aName = sc.nextLine();                                           //taking the next input
        System.out.printf("Number: %d, Name: %s",aNum,aName);
    }
}
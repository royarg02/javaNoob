import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//buffered reader is another type of taking console input from the user, which is buffered(the input will not pass to the system unless the 
//user enters the 'new line' key)
class buffer{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));    //create BufferedReader object, bind to InputStreamReader which is binded to System.in
        System.out.println("Enter some text: ");
        String line = input.readLine();                                                 //read string from input character sequence
        System.out.println("You entered: " + line);
        input.close();                                                                  //closing the buffered reader class
    }
}
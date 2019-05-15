/*Define an execption "NoMatchFoundExecption" that is thrown when "Kolkat" is not found from the following list of String
cityname = {"Kolkata","Chennai","Delhi","Goa"}*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class search{
    public static void main(String[] args) throws IOException {
        String[] cityname = {"Kolkata","Chennai","Delhi","Goa"};
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a city name: ");
        String query = input.readLine();
        for(int i = 0 ; ; ++i){
            try{
                if(i == cityname.length){
                    throw new NoMatchFoundExecption();
                }
            }
            catch(NoMatchFoundExecption e){
                System.out.println("Exception raised: " + e.toString());
                break;
            }
            if(query.equals(cityname[i])){
                System.out.println("Found");
                break;
            }
        }
    }
}

class NoMatchFoundExecption extends Throwable{
    public String toString(){
        return "Search query not found!!!";
    }
}

/*
Output:
Enter a city name: Kolkat
Exception raised: Search query not found!!!
*/
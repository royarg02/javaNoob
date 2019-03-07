/*Write a program to print the days of a month using two static arrays*/

class dayMonth{
    public static void main(String args[]) {
        int i;
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String month[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(i = 0 ; i < month.length ; ++i){
            if(month[i].equals(args[0])){
                System.out.println("Number of Days: " + days[i]);
                break;
            }
        }
        if(i == month.length)
        System.out.println("Invalid month");
    }
}

/*
Output:
java dayMonth Feb
Number of Days: 28

java dayMonth Aug
Number of Days: 31

java dayMonth Nov
Number of Days: 30
*/
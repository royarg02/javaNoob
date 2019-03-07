/*Write a program to accept the following city names as arguments in the
command line and sort them in alphabetic order:
    city_name={ Kolkata, Chennai, Mumbai, Kanpur, Delhi, ...}*/

class sort_city{
    public static void main(String args[]) {
        String temp;
        for (int i = 0 ; i < args.length ; ++i){
            for (int j = 0 ; j < (args.length - 1 - i) ; ++j){
                if(args[j].compareTo(args[j+1]) > 0){
                    temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Cities:");
        for(int i=0 ; i < args.length ; ++i){
            System.out.print(args[i] + " ");
        }
    }
}

/*
Output:
java sort_city Kolkata Chennai Mumbai Kanpur Delhi Jaipur Dehradun Bengaluru
Sorted Cities:
Bengaluru Chennai Dehradun Delhi Jaipur Kanpur Kolkata Mumbai
*/
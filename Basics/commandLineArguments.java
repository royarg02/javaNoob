//command line arguments
//arguments which can be supplied to the program at runtime

class arguments{
    public static void main(String args[]) {
        /*arguments to th program reside in the 'args' 
        array beginning from the first element
        */
        for(int i = 0 ; i < args.length ; ++i){
            System.out.println("Argument " + i + ": -> " + args[i]);
        }
    }
}
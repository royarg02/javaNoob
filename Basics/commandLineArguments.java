//command line arguments
//arguments which can be supplied to the program at runtime

class arguments{
    public static void main(String args[]) {
        /*arguments to th program reside in the 'args' 
        array beginning from the first element
        */
        
        /*a little notion on the arguments, if nothing is specified 
        in the argument section while running the .class file
        we can check that by arg.length Remeber args can never be *null*
        they just do not exist if not given.
        */
        if(args.length == 0){
            System.out.println("There are no command line arguments");
            System.exit(0);
        }
        for(int i = 0 ; i < args.length ; ++i){
            System.out.println("Argument " + i + ": -> " + args[i]);
        }
    }
}
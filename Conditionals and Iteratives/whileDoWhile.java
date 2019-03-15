class whileDo{
    public static void main(String[] args) {
        //while loop: for statements which need to be executed
        //as long as a condition is true
        int i = 0;                      //initializing control variable
        while(i < 10){                  //while(condition) 
            System.out.println("i is now " + i);    //syntactically similar to C/C++
            ++i;                        //changing control variable
        }
        System.out.println("Exited while loop");

        //infinite loop(uncomment)
        /*
        while(true){
            System.out.println("Infinite");
        }
        */

        //do-while loop: same as while loop, but statement executes once
        //even if the condition is false
        i=15;
        do{
            i-=1;
            System.out.println("i is now " + i);
        }while(i>4);
        System.out.println("Exited do-while");
    }
}
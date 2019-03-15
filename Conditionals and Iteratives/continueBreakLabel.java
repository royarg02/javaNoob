class label{
    public static void main(String[] args) {
        //break statement: skips any block of statements usually 
        //used in loops with if(condition) and in switch
        for (int i = 0 ; i < 10 ; ++i){
            if(i==6){
                break;       //skips and exits loop
            }
            System.out.print(i + " ");
        }
        System.out.println("Exited loop");

        //continue statement: skips block of statement for ONLY
        //THAT ITERATION which satisfies the condition used with the statement
        for (int i = 0 ; i < 10 ; ++i){
            if(i==4){
                continue;   //skips to next iteration
            }
            System.out.print(i + " ");
        }
        System.out.println("Exited loop\n");
        
        //labels are identifiers given to blocks/ loops
        //they can be easily refered to in iterative statements for
        //transfer the control to some other block/loop
        outer: for(int i = 7 ; i > 0 ; --i){
            inner: for(int j = 0 ; j < 10 ; ++j){
                if(j == i){
                    System.out.println("i is " + i + " and j is " + j + " =>Breaking out of outer...");
                    break outer;        //exits outer
                }
                else if(j % 2 == 0){
                    System.out.println("i is " + i + " and j is " + j + " =>Skipping this iteration of inner...");
                    continue inner;     //skips current iteration of inner
                }
                System.out.println("Inner j is " + j);
            }
        }
    }
}
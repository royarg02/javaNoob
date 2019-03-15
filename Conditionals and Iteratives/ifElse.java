class IFELSE{
    public static void main(String[] args) {
        //if-else introduces some logic to the program
        /*if(<condition>){
            <statements if condition is true>
        }
        else{
            <statements if condition is false>
        }
        */
        byte someVar = 20;
        if(someVar % 2 != 0){
            System.out.print("someVar is odd\n");
        }
        else{
            System.out.print("someVar is even\n");
        }
        
        //yet another level of logic can be applied by using 'else if':
        /*if(<condition1>){
            <statements if condition1 is true>
        }
        else if(<condition2>){
            <statements if condition1 is false but condition2 is true>   
        }
        else if(<condition3>)
        .
        .
        .
        else{
            <statements if all conditions are false>
        }
        */
        someVar = 0;
        if(someVar % 2 != 0){
            System.out.print("someVar is odd\n");
        }
        else if(someVar == 0){
            System.out.print("someVar is zero\n");
        }
        else{
            System.out.print("someVar is even\n");
        }
    }
}
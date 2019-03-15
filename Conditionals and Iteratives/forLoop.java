class forLoop{
    public static void main(String[] args) {
        //for loop: executes some statements a certain number of time
        for(int i = 0 ; i < 10 ; ++i){  
            //for(control variable initialization ; condition ; control variable change)
            System.out.println("i is now " + i);    //syntactically similar to C/C++
        }
        System.out.println("Exited for loop");

        //for-each loop: iterates over an array
        String array[] = {"A","Hello","there","Java","is","Fun","!"};
        for(String control : array){    //control takes each element of array
            System.out.println("control is now " + control);
        }
        System.out.println("Exited for-each loop");
    }
}
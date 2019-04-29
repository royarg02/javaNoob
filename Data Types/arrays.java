//arrays
//collection of variables having the same data type. Can have one or more dimensions

class arrayInt{
    public static void main(String[] args) {
        //just like class objects declaration of arrays need the 'new' operator
        int arr[];                          //defined a reference to an array
        arr = new int[5];                   //arr now points to a continuous memory location
        //initializing the array
        for(int i = 0 ; i < 5 ; ++i){
            arr[i] = i*i;                   //the elements of an array start from index 0
        }
        //the arrays can also be initialized directly, in which the size of the array can be omitted
        char cString[] = {'N','o','t',' ','a',' ','S','t','r','i','n','g','\n'};     //String is actually used as an object
        //arrays can also be declared as
        double[] values = new double[3];

        //traversing the array
        for(int i = 0 ; i < 5 ; ++i){
            System.out.println("Element " + i + " contains: " + arr[i]);
        }
        for(int i = 0 ; i < cString.length ; ++i){              //array.length returns the size of the array
            System.out.print(cString[i]);
        }

        //multidimensional arrays: arrays of arrays
        int mult[][] = new int[3][4];                          //creating a multidimensional array
        int k = 0;
        for(int i=0 ; i < 3; i++){
            for(int j=0 ; j < 4 ; j++){
                mult[i][j] = k;
                k++;
            }
        }
        //directly initializing a multidimensional array
        int[][] dir = {{2,4,6},
                       {10,7,1}};
        //traversing the created array
        for(int i=0 ; i < 2; i++){
            for(int j=0 ; j < 3 ; j++){
                System.out.print(dir[i][j] + " ");
            }
            System.out.println();
        }
        //if the new operator is used in creating a multidimensional array, the indices other than the leftmost index can be
        //omitted. In that case the array at every leftmost index can be defined separately
        char[][] item= new char[3][];
        item[0] = new char[3];
        item[1] = new char[5];
        item[2] = new char[4];
    }
}
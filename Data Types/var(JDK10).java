//var type
//the var type is defined as 'local variable type inference', which means that the data type of the variable is
//determined by the compiler from the initialization expression

class varSample{
    static void display(){
        System.out.println("Nothin to see here");
    }
}

class testVar{
    public static void main(String[] args) {
        var anything = 98;                      //in this case anything is int
        var something = 'W' ;                   //in this case something is char
        var nothing = (23+18)/19;               //in this case nothing is double(not float)
        var aText = "Enter Text here";          //used var in declaring a string type
        var object = new varSample();           //used var to define an instance of a class

        //although it is absolutely required for the variable to be initialized at the same statement
        //var avg;                              //illegal

        //var can be also used to declare an array, but not directly
        var array = new float[6];               //no [] in LHS
        //var lol[] = new char[3];              //not allowed
        //var other = {23.0 , 2 , 89};          //illegal
        
        //var cannot be also used as the name of a class, as a return type, as a parameter, or as an instance variable
        //(everything except local variables)

        //although var can be used as an identifier
        var var = 5;
        int count = -var;
        System.out.print("var = " + var + "\ncount: " + count);
    }
}
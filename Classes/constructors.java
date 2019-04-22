//constructors
//functions which initialize the value of the data members automatically upon declaration

class MyClass{
    int num1;
    long var2;
    double divider;
    MyClass(){                                          //default constructor
        this.num1 = 0xFF;                               //initializes the data members with these predefined values
        this.var2 = 980665;                             //incase the default constructor is not explicitly defined, java automatically
        this.divider = 32.58;                           //creates one where it initializes all data members to zero
    }
    MyClass(int num1, long var2, double divider){       //parameterized constructor
        this.num1 = num1;                               //takes the values to be initialized with as parameters
        this.var2 = var2;                               //the 'this' keyword helps to differentiate between the object data
        this.divider = divider;                         //members and the formal parameters
    }
    double calculate(){
        return (this.num1 * this.var2) / this.divider;
    }
}

class conMAIN{
    public static void main(String[] args) {
        MyClass user = new MyClass();                           //calls default constructor
        MyClass para = new MyClass(255 , 314159 , 50.41);       //calls parameterized constructor
        System.out.println("'user: '" + user.calculate());
        System.out.println("'para: '" + para.calculate());
    }
}
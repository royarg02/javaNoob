//inheritance
//creating a new class from an existing class by inheriting the properties and methods
//MULTIPLE INHERITANCE IS NOT SUPPORTED IN JAVA
class Base{
    int dataA, dataB;
    private int dataP;
    Base(int X, int Y){                                     //Base constructor
        this.dataA=X;                                       //Base properties
        this.dataB=Y;
        this.dataP = 527;
    }
    void showData(){                                        //base method
        System.out.println("Data A:" + this.dataA + "\nData B:" + this.dataB);
    }
    int showP(){
        return this.dataP;
    }
}
class Sub extends Base{                                     //inherited Base to Sub
    int dataC;
    Sub(int X, int Y, int Z){                               //Sub Constructor
        super(X,Y);                                         //Unlike other base methods, constructors are not inherited
                                                            //but invoked from the sub constructor using super()
        this.dataC = Z;                                     //one can still use the inherited data members directly for initialization using 'this' 
    }
    void avgData(){                                         //Sub Method
        System.out.println("Average data:" + (this.dataA + this.dataB + this.dataC)/3);
    }
}
class inherit{
    public static void main(String[] args) {
        Sub height = new Sub(100,107,105);
        height.showData();                                  //using inherited method
        height.avgData();
        //System.out.println(height.dataP);                 //as 'dataP' is private in Base, it is not inherited to Sub and thus cannot be accessed directly
        System.out.println(height.showP());                 //they have to be accessed using the interfacing methods
    }
}
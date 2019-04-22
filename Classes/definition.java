//classes can be thought of as the blue print of an user defined data type which exhibit properties for OOP

import java.util.Scanner;

class Example{                  //definition begins with 'class' keyword
    int aNum;                   //instance variables
    float aFloat;               //or data members defined for each object
    boolean aBool;
    Scanner input = new Scanner(System.in);                              //for taking console input
    void getData(){                                             //object methods meant to use data members
                                                                //avoiding any outside interference
        System.out.println("Enter a int and a float:");
        this.aNum = input.nextInt();                            //the 'this' keyword is used mainly to refer to
        this.aFloat = input.nextFloat();                        //the data members of the object itself
        this.aBool = (this.aNum > this.aFloat) ? true : false;
    }
    void showData(){                                            //object method
        System.out.println("You Entered:");
        System.out.println(this.aNum + " , " + this.aFloat + ".");                  //although referring data members of the object COULD be done
        System.out.println(this.aNum + " > " + this.aFloat + " is " + this.aBool);  //by only the member name itself, using 'this' gives many
    }                                                                               //advantages
}

class MAIN{
    public static void main(String[] args) {
        Example user = new Example();                   //defining a new object
                                                        //the 'new' operator returns some dynamically created space and attaches it to
                                                        //the object reference
        user.getData();                                 //using object method
        user.showData();
        user.aNum = 25;                                 //modifying a data member using the object(not recommended for good practice)
        user.showData();
        Example copy = user;                            //as object variables are merely 'references' to some space, assigning as such
        copy.showData();                                //creates another 'reference' of the same object
    }
}
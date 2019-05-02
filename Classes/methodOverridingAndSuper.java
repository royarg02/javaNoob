//method overriding
/*defining a function with the same name, arguments and return type in a sub class overrides the function
inherited from the base class*/

class parent{
    String str;
    parent(String input){
        this.str = input;
    }
    void show(){
        System.out.println("From parent: ");
        System.out.printf("The no. of characters in %s is %d",this.str,this.str.length());
    }
}
    
class child extends parent{
    int index;
    child(String input, int index){
        super(input);                                                               //to invoke the base constructor
        this.index = index;
    }
    void show(){                                                                    //overriding
        System.out.println("From child: ");
        System.out.println("The object has: " + this.str);
        System.out.printf("The string after first %d characters is: %s\n", this.index, this.str.substring(this.index));
        super.show();                                                               //the 'super' keyword is also used to call the overriden superclass method
    }
}

class superDemo{
    public static void main(String[] args) {
        child anObj = new child("Java is fun!", 5);
        anObj.show();                                                               //the child function is invoked       
    }
}
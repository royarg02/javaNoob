//abstract classes
//classes which implement methods that require a subclass to override them

abstract class shape{                                           //a abstract class is defined by the 'abstract' keyword
    float A;
    float B;
    float res;
    shape(float A, float B){                                    //class constructors cannot be made abstract, same for static methods
        this.A = A;
        this.B = B;
    }
    abstract void area();                                       //the abstract method; the definition is left out for the subclasses to override and fill
    void result(){                                              //an abstract class can still implement nornal methods
        System.out.println(this.res);
    }
}

class Triangle extends shape{
    Triangle(float A, float B){
        super(A,B);
    }
    void area(){                                                //overriding abstract method
        this.res = 0.5F * this.A * this.B;
        System.out.print("The area of the triangle is: ");
        this.result();
    }
}

class Rectangle extends shape{
    Rectangle(float A, float B){
        super(A,B);
    }
    void area(){                                                //overriding abstract method
        this.res = this.A * this.B;
        System.out.print("The area of the rectangle is: ");
        this.result();
    }
}

class ABSTRACT{
    public static void main(String[] args) {
        Triangle tri = new Triangle(2.5F, 1.1F);
        //shape sha = new shape(10.0F, 5.5F);                   //abstract classes cannot have objects
        shape sha = new Rectangle(10.0F, 5.5F);                 //however, they can have references, which can be used for subclass objects
        tri.area();
        sha.area();
    }
}
/*Create a class complex with data members as real and imaginary. Overload 3 constructors to initialize the data members i.e.,
default, parameterized and using object as arguments.
Provide methods which returns object of complex class as result for addition, subtraction, multiplication of two numbers.*/

class arithmetic{
    public static void main(String[] args) {
        complex obj1 = new complex(2F,3.2F);
        complex obj2 = new complex();
        complex obj3 = new complex(obj1);
        System.out.println("Adding:");
        obj1.show();
        obj2.show();
        complex res = obj1.add(obj2);
        res.show();
        System.out.println("Subtracting:");
        obj3.show();
        obj1.show();
        res = obj3.sub(obj1);
        res.show();
        System.out.println("Multiplying:");
        obj2.show();
        obj3.show();
        res = obj2.mult(obj3);
        res.show();
    }
}

class complex{
    float real;
    float imag;
    complex(){
        this.real = 0.0F;
        this.imag = 1.0F;
    }
    complex(float x, float y){
        this.real = x;
        this.imag = y;
    }
    complex(complex other){
        this.real = other.real * 2.0F;
        this.imag = other.imag - 2.0F;
    }
    complex add(complex other){
        return new complex(this.real + other.real , this.imag + other.imag);
    }
    complex sub(complex other){
        return new complex(this.real - other.real , this.imag - other.imag);
    }
    complex mult(complex other){
        return new complex((this.real * other.real) - this.imag * other.imag , this.real * other.imag - this.imag * other.real);
    }
    void show(){
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

/*
Output:
Adding:
2.0 + 3.2i
0.0 + 1.0i
2.0 + 4.2i
Subtracting:
4.0 + 1.2i
2.0 + 3.2i
2.0 + -2.0i
Multiplying:
0.0 + 1.0i
4.0 + 1.2i
-1.2 + -4.0i
*/
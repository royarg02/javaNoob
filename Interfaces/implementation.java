//interfaces
//interfaces are kind-of abstract classes, but has some key differences
//That is, it is used to implement "what are the interfaces" instead of "how are they implemented"

interface area{                     //access modifiers can also be specified
    float getArea();                //access modifiers are omitted from methods and other members as they implicitly 'public' in the implementing classes
}

interface peri{
    float getPeri();
    float PI = 3.1415F;             //interfaces can also have variables which are implicitly 'FINAL', 'CONSTANT', and 'STATIC'
}

class rect implements area,peri{    //implementing interface 'area', 'peri'. Unlike static classes, a class can implement multiple interfaces
    int x;
    int y;
    rect(int a, int b){
        this.x = a;
        this.y = b;
    }
    public float getArea(){         //using interface methods (must be declared as public when using)
        return this.x * this.y;
    }
    public float getPeri(){
        return 2*(this.x + this.y);
    }
}

class circ implements area,peri{
    int r;
    circ(int r){
        this.r = r;
    }
    public float getArea(){
        return 3.14F*r*r;
    }
    public float getPeri(){
        //PI = 3.1;                 //cannot change the value of 'final' variable
        return 2*PI*r;
    }
}

class Main{
    public static void main(String[] args) {
        rect rect = new rect(30,15);
        System.out.println("The area of the rect is: " + rect.getArea());
        circ circ = new circ(14);
        System.out.println("The area of the circ is: " + circ.getArea());
    }
}
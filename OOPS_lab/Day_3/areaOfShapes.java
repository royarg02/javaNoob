/*WAP to calculate area of Rectangle, Circle, Square, with parameterised constructor using BufferedReader class object*/
//multi class
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MAIN{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double input1;
        double input2;
        System.out.println("1->Rectangle\n2->Circle\n3->Square");
        byte choice = Byte.parseByte(input.readLine());
        switch(choice){
            case 1:
                System.out.print("Enter Length and Breadth: ");
                input1 = Double.parseDouble(input.readLine());
                input2 = Double.parseDouble(input.readLine());
                Rect rect = new Rect(input1,input2);
                rect.show();
                break;
            case 2:
                System.out.print("Enter Radius: ");
                input1 = Double.parseDouble(input.readLine());
                Circ circ = new Circ(input1);
                circ.show();
                break;
            case 3:
                System.out.print("Enter Length: ");
                input1 = Double.parseDouble(input.readLine());
                Squ squ = new Squ(input1);
                squ.show();
                break;
            default:
                System.out.print("Invalid Input!!");
        }
    }
}

class Rect{
    double area;
    Rect(double x, double y){
        this.area = x*y;
    }
    void show(){
        System.out.print("Area: " + this.area);
    }
}

class Circ{
    double area;
    Circ(double x){
        this.area = 3.14*x*x;
    }
    void show(){
        System.out.print("Area: " + this.area);
    }
}

class Squ{
    double area;
    Squ(double x){
        this.area = x*x;
    }
    void show(){
        System.out.print("Area: " + this.area);
    }
}

/*
Output:
1->Rectangle
2->Circle
3->Square
2
Enter Dimensions: 6
Area: 113.03999999999999
*/
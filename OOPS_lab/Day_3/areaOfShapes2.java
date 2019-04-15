/*WAP to calculate area of Rectangle, Circle, Square, with parameterised constructor using BufferedReader class object*/
//muethod overloading
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MAIN2{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double input1;
        double input2;
        area user = new area();
        System.out.println("1->Rectangle\n2->Circle\n3->Square");
        byte choice = Byte.parseByte(input.readLine());
        switch(choice){
            case 1:
                System.out.print("Enter Length and Breadth: ");
                input1 = Double.parseDouble(input.readLine());
                input2 = Double.parseDouble(input.readLine());
                user = new area(input1,input2);
                break;
            case 2:
            case 3:
                System.out.print("Enter Dimensions: ");
                input1 = Double.parseDouble(input.readLine());
                user = new area(input1,choice);
                break;
            default:
                System.out.print("Invalid Input!!");
        }
        user.show();
    }
}

class area{
    double res;
    area(){
        ;   //nothing
    }
    area(double x, double y){
        this.res = x*y;
    }
    area(double x, byte y){
        switch(y){
            case 2:
                this.res = 3.14*x*x;
            break;
            case 3:
                this.res = x*x;
        }
    }
    void show(){
        System.out.print("Area: " + this.res);
    }
}

/*
Output:
1->Rectangle
2->Circle
3->Square
3
Enter Length: 6
Area: 36.0
*/
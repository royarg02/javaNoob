/*WAP to design a class volume and then find out the volume of a cube, cylinder, and ellipsoid using method overloading*/
//Buffered Reader

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class findVol{
    public static void main(String[] args) throws IOException{
        vol user = new vol();
        double input1,input2,input3;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1->Cube\n2->Cylinder\n3->Ellipsoid");
        byte choice = Byte.parseByte(input.readLine());
        switch(choice){
            case 1:
                System.out.print("Enter side length: ");
                input1 = Double.parseDouble(input.readLine());
                user = new vol(input1);
                break;
            case 2:
                System.out.print("Enter radius and height: ");
                input1 = Double.parseDouble(input.readLine());
                input2 = Double.parseDouble(input.readLine());
                user = new vol(input1, input2);
                break;
            case 3:
                System.out.print("Enter dimensions: ");
                input1 = Double.parseDouble(input.readLine());
                input2 = Double.parseDouble(input.readLine());
                input3 = Double.parseDouble(input.readLine());
                user = new vol(input1,input2,input3);
                break;
            default:
                System.out.print("Invalid Input!!");
        }
        user.show();
    }
}

class vol{
    double volume;
    vol(){
        ;   //nothing
    }
    vol(double a){
        this.volume = a*a*a;
    }
    vol(double x, double y, double z){
        this.volume = (4*3.14*x*y*z)/3;
    }
    vol(double r, double h){
        this.volume = 3.14*r*r*h;
    }
    void show(){
        System.out.print("Area: " + this.volume);
    }
}

/*
Output:
1->Cube
2->Cylinder
3->Ellipsoid
1
Enter side length: 4
Area: 64.0
*/
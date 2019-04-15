/*WAP to design a class volume and then find out the volume of a cube, cylinder, and ellipsoid using method overloading*/
//Command Line Input

class findVolCmd{
    public static void main(String[] args){
        vol user = new vol();
        switch(args.length){
            case 1:
                user = new vol(Double.parseDouble(args[0]));
                break;
            case 2:
                user = new vol(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
                break;
            case 3:
                user = new vol(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
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
java findVolCmd 4
Area: 64.0

java findVolCmd 2 3 8
Area: 200.96
*/
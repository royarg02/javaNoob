package shape;

import java.math.*;

public class Figure{
    public double vol(double a){
        return Math.pow(a, 3.0); 
    }
    public double vol(double a, double b){
        return (2*(Math.PI)*a*b);
    }
    public double vol(double a, double b, double c){
        return (a*b*c);
    }
}
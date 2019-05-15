import java.math.*;

interface Volume{
    double involume();
    double outvolume();
}

class LOL implements Volume{
    double s1,s2,s3;
    LOL(){
        s1 = 10.10;
        s2 = 20.20;
        s3 = 30.30;
    }
    public double involume(){
        return (1/3.0*Math.PI*s2*s3*s1);
    }
    public double outvolume(){
        return (4/3.0*Math.PI*s2*s3*s1);
    }
}

class TESTING{
    public static void main(String args[]){
        LOL obj = new LOL();
        System.out.println(obj.involume());
        System.out.println(obj.outvolume());
    }
}
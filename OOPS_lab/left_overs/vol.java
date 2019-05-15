// WAP using an interface volume.

interface volume{
    public double v();
}

class cuboid implements volume{
    double l;
    cuboid(double l){
        this.l = l;
    }
    public double v(){
        return this.l*this.l*this.l; 
    }
}

class sphere implements volume{
    double r;
    sphere(double r){
        this.r = r;
    }
    public double v(){
        return (4/3)* 3.14 * this.r * this.r * this.r;
    }
}

class Test{
    public static void main(String args[]){
        cuboid obj = new cuboid(2.3);
        sphere a = new sphere(17.9);
        System.out.println("obj.v: " + obj.v());
        System.out.println("a.v: " + a.v());
    }
}

/*OUTPUT:
obj.v: 12.166999999999996
a.v: 18008.964459999996
*/
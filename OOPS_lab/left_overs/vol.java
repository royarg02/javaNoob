// WAP to implement interface

interface volume{
    public double v();
}

class Vol implements volume{
    double l;
    Vol(double l){
        this.l = l;
    }
    public double v(){
        return this.l*this.l*this.l; 
    }
}

class Test{
    public static void main(String args[]){
        Vol obj = new Vol(2.3);
        System.out.println(obj.v());
    }
}

// OUTPUT:
// 12.166999999999996
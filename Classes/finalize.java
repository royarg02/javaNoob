//finalize
//functions which execute before the garbage collector removes the objects from memory
//deprecated from SE 9(won't work with above JDK 9)

class ExClass{
    int someValue;
    boolean TF;
    ExClass(){
        this.someValue = 100;
        this.TF = false;
    }
    void show(){
        System.out.println("This object has " + this.someValue + this.TF);
    }
    protected void finalize(){
        System.out.println("Removing object from memeory...Press F");
    }
}

class finMAIN{
    public static void main(String[] args) {
        ExClass obj = new ExClass();
        obj.show();
        obj = null;                             //made the reference null to remove the created object from memory
        System.gc();                            //running the garbage collector to invoke finalize()
    }
}
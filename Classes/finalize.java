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
        {
            ExClass obj = new ExClass();
            obj.show();
        }
        //although the function was supposed to be called as such
        //there is no assurance that the finalize method will be executed before the space is reclaimed
        //<I guess deprecation was done for good :P>
    }
}
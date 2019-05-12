package access1;

public class Dummy{                                //creating a dummy class to implement abstraction. Defined as public to be made available in non-package classes
    int def_one = 1;
    private int pri_one = 2;
    protected int pro_one = 3;
    public int pub_one = 4;
    public Dummy(){
        System.out.println("In Dummy");
        System.out.println("def_one: " + this.def_one);
        System.out.println("pri_one: " + this.pri_one);
        System.out.println("pro_one: " + this.pro_one);
        System.out.println("pub_one: " + this.pub_one);
    }
}
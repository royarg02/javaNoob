package access2;
import access1.*;                                                   //imported Dummy from here

class DerivedDiff extends Dummy{                                    //Subclass of Dummy in different package
    DerivedDiff(){
        System.out.println("In DerivedDiff");
        //System.out.println("def_one: " + this.def_one);           //default members are not accessible in other packages
        //System.out.println("pri_one: " + this.pri_one);
        System.out.println("pro_one: " + this.pro_one);
        System.out.println("pub_one: " + this.pub_one);
    }
}
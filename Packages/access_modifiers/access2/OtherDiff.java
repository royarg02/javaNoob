package access2;
import access1.*;                                                   //imported dummy from here

class OtherDiff{
    OtherDiff(){                                                    //Non-subclass of Dummy in different package
        Dummy obj = new Dummy();
        System.out.println("In OtherDiff");
        //System.out.println("def_one: " + this.def_one);           //default members are not accessible in other packages
        //System.out.println("pri_one: " + this.pri_one);           //private data member
        //System.out.println("pro_one: " + this.pro_one);           //protected members cannot be accessed in other packages unless they are inherited
        System.out.println("pub_one: " + obj.pub_one);
    }
}
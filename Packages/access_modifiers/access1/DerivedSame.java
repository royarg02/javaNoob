package access1;

class DerivedSame extends Dummy{                                //Subclass of Dummy in the same package
    DerivedSame(){
        System.out.println("In DerivedSame");
        System.out.println("def_one: " + this.def_one);
        //System.out.println("pri_one: " + this.pri_one);       //private data members are not inherited
        System.out.println("pro_one: " + this.pro_one);
        System.out.println("pub_one: " + this.pub_one);
    }

}
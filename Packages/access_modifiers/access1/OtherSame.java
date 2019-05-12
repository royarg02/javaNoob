package access1;

class OtherSame{                                                                //non-subclass of Dummy in same package
    OtherSame(){
        Dummy obj = new Dummy();
        System.out.println("In OtherSame");
        System.out.println("def_one: " + obj.def_one);
        //System.out.println("pri_one: " + obj.pri_one);                        //private data member
        System.out.println("pro_one: " + obj.pro_one);
        System.out.println("pub_one: " + obj.pub_one);
    }
}
package pack;

class packMain{
    public static void main(String[] args) {
        System.out.println("In packMain");
        enclPri pri = new enclPri();
        //ob.in.show();                     //the difference between any inner class and private nested class is that private class members cannot
                                            //be accessed through enclosing class object anywhere outside the enclosing class
        pri.showPri();

        packDef def = new packDef();        //default classes can be easily accessed in the same package
        def.show(); 

        enclPro pro = new enclPro();        //In case of same package, the function of protected and inner classes are the same
        pro.in.show();

        packPub pub = new packPub();        //public classes can be used anywhere
        pub.show();
    }
}
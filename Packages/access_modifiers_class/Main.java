import pack.*;

class subPro extends enclPro{               //inheriting enclosing class to get access to protected class
    class inner extends packPro{            //inheriting protected class
        ;
    }
    inner tmp = new inner();
}

public class Main{
    public static void main(String[] args) {
        System.out.println("In Main");
        enclPri pri = new enclPri();
        //ob.in.show();                     //the difference between any inner class and private nested class is that private class members cannot
                                            //be accessed through enclosing class object anywhere outside the enclosing class
        pri.showPri();

        //packDef def = new packDef();        //default classes cannot be accessed outside the package it belongs to
        //def.show(); 

        //enclPro pro = new enclPro();        //Accessing protected class in different package requires inheriting it
        //pro.in.show();
        subPro pro = new subPro();
        pro.tmp.show();

        packPub pub = new packPub();        //public classes can be used anywhere
        pub.show();
    }
}
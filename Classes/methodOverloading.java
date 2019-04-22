//method overloading
//an appropriate call to a method of a class is done based on the parameters supplied

class overloadTest{
    int a;
    int x;
    overloadTest(){                                                 //constructor functions are frequently overloaded
        System.out.println("Constructing object with no parameters");
    }
    overloadTest(int i, int j){
        System.out.println("Constructing object with two parameters");
        this.a = i;
        this.x = j;
    }
    void change(){                                                  //function with no parameter
        System.out.println("change() is called");
        this.a = 1;
        this.x = 100;
    }
    void change(double m){                                          //function with single int parameter
        System.out.println("change(double m) is called");
        this.a = this.x = (int)m;
    }
    void change(int m, int n){                                      //function with two int parameters
        System.out.println("change(int m, int n) is called");
        this.a = m;
        this.x = n;
    }
    /*
    overloadTest change(int m, int n){                              //overloading functions on the basis of return type
                                                                    //alone, is not allowed
        return new overloadTest(m,n);
    }
    */
    void show(){
        System.out.println("a = " + this.a + "\nx = " + this.x);
    }
}

class ovMAIN{
    public static void main(String[] args) {
        overloadTest test = new overloadTest();
        test.change(2,3);
        overloadTest test2 = new overloadTest(4,10);
        test2.change(5);                                            //in case the compliler does not find an appropriate method to handle the call,
                                                                    //it will implicit cast the argumments to match with any one of defined method
        test.change();
        test.show();
        test2.show();
    }
}
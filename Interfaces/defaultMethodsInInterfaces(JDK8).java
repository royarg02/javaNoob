//default interface methods(JDK 8)
//An interface can have a method which doesn't require any implementation(overriding) in the implementing class
//In that case the 'default' implementation from the interface itself is used

interface A{
    void showData();                                        //this method MUST BE implemented
    default void showString(){                              //'default' keyword signifies that this method COULD BE implemented(overriden)
                                                            //in the implementing class
        System.out.println("This is the default string.");
    }
}

class Imp implements A{                                     //this class does not overrides showString()
    int val;
    Imp(int val){
        this.val = val;
    }
    public void showData(){
        System.out.println("Imp.val: " + this.val);
    }
}

class Imp2 implements A{                                    //this class overrides showString()
    String str;
    int val;
    Imp2(String str, int val){
        this.val = val;
        this.str = str;
    }
    public void showData(){
        System.out.println("Imp2.val^2: " + this.val * this.val);
    }
    public void showString(){                               //overriding default implementation
        System.out.println("Imp2.str: " + this.str);
    }
}

class DEFAULT{
    public static void main(String[] args) {
        Imp obj1 = new Imp(399);
        Imp2 obj2 = new Imp2("QWERTY", 420);
        obj1.showData();
        obj1.showString();                                  //invokes 'default' implementation from interface
        obj2.showData();
        obj2.showString();
    }
}
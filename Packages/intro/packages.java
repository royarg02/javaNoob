//packages are contained class spaces
//classes having same name but in different packages are treated as different and thus do not cause a conflict

package intro;                              //specifies the package name where the classes defined in this file will belong to
                                            //if this line is omitted, the classes belong to the DEFAULT package
class sample{                               //resides as ...intro\sample.class
    int dataA;
    int dataB;
    static boolean dataC;
    static{
        dataC = true;
    }
    sample(int x, int y){
        this.dataA = x;
        this.dataB = y;
    }
    void check(){
        dataC = (dataA < dataB);
    }
    static void showGreater(){
        System.out.println(dataC);
    }
}

class checkGreaterIntro{                    //resides as ...intro\checkGreaterIntro.class
    public static void main(String[] args) {
        sample obj1 = new sample(23, 12);
        obj1.check();
        sample obj2 = new sample(11,56);
        obj2.check();
        sample obj3 = new sample(67, 22);
        obj3.check();
        sample.showGreater();
    }
}

/*Compilation is done from the same directory as usual
However, execution through JVM is done UP ONE LEVEL from the package as
java <package_name>.<class_name>

For example, for this program, it would be java intro.checkGreaterIntro
*/
//enums as a variation of class
//apart from enums compiling as ".class" files, they can also have constructors, data variables, and methods
enum ClassLike{
    RASPBERRY(3), BLACKBERRY(7), BLUEBERRY(8), STRAWBERRY(1), SOMEBERRY;    //values in the brackets can be thought of as parameters to the constructor defined below
    int MapNo;
    ClassLike(){                                                        //default constructor for no custom value given
        this.MapNo = 0;
    }
    ClassLike(int x){                                                   //constructor assigns the custom constant values to another 'data member'
        this.MapNo = x;
    }
    public String toString(){                                           //overriding method
        return super.toString() + " of Mapped Number: " + this.MapNo;
    }
}
class Analogy{
    public static void main(String[] args) {
        for(ClassLike tmp : ClassLike.values()){
            System.out.println(tmp.toString());
        }
    }
}
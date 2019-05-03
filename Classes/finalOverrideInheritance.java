//preventing overrides
//to prevent override by any subclass, 'final' is used before the method's definition

class methodFinal{
    final void overrideThis(){
        System.out.print("You can't override me!!");
    }
}

class trymethod extends methodFinal{
    /*void overrideThis(){                                  //cannot override method
        System.out.print("Overriden!!");
    }*/
}

//preventing subclasses
//to prevent any further subclass creation, 'final' is used before the class' definition

final class FINAL{
    public static void main(String[] args) {
        methodFinal ex = new methodFinal();
        ex.overrideThis();
    }
}

/*class tryclass extends FINAL{                             //cannot create subclass
    void tried(){
        System.out.print("In the Subclass!!");
    }
}*/
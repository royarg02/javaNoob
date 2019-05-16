//nested interfaces
//interfaces can be a member of a class or an interface which can be implemented by using the proper full name
//interfaces in that case can be declared as public, private, protected, like other members of the class

class nestTest{
    public interface greater{
        boolean check(int a, int b);
    }
    char aChar = 'W';
}

class another implements nestTest.greater{                      //using the '.' operator to give full name similar to any static member of a class
    public boolean check(int a, int b){
        if(a < b){
            return true;
        }
        else{
            return false;
        }
    }
}

class derived extends nestTest implements nestTest.greater{     //even derived classes need the full name of the interface
    public boolean check(int a, int b){
        if((a-b) < 0){
            return false;
        }
        else{
            return true;
        }
    }
}

class comValue{
    public static void main(String[] args) {
        nestTest.greater A = new derived();          //used an interface reference
        System.out.println(A.check(-12,9));
        A = new another();                          //'another' implements nestTest.greater
        System.out.println(A.check(12,90));
    }
}
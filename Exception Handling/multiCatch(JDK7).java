//multi catch
//starting from JDK 7, multiple exceptions can be referenced in a single catch clause by using the OR operator

class mulThrow{
    static void func1()throws ArithmeticException{
        throw new ArithmeticException();
    }
    static void func2()throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}

class mulCatch{
    public static void main(String[] args) {
        try{
            mulThrow.func1();
            mulThrow.func2();
        }
        catch(ArithmeticException | ClassNotFoundException e){          //catches both the exceptions mentioned
            System.out.println("Exception: " + e);
        }
    }
}
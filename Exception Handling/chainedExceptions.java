//chained exceptions
//exceptions can be used as the cause of invoking another exception

class chain{
    public static void main(String[] args) {
        try{
            throwException();
        }
        catch(NumberFormatException e){
            System.out.println("Exception: " + e);
            System.out.println("Cause: " + e.getCause());                               //returns the cause
        }
    }
    static void throwException()throws NumberFormatException{
        NullPointerException cause = new NullPointerException("Description goes here"); //exceptions have to be created first to assigned a cause
        NumberFormatException e = new NumberFormatException();
        e.initCause(cause);                                                             //in this case, exception 'cause' is the reason for exception
        throw e;
    }
}
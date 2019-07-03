//type wrappers are the 'objectified' primitive data types
//in other words, they are objects made for the primitive data types to extend funtionality in OOP
class Wrapper{
    public static void main(String[] args) {
        //Type wrappers exist for all primitive data types
        Byte by = new Byte((byte)76);
        Short sh = new Short((short)3);
        Integer in = new Integer("666");                    //used a String Literal
        //from JDK9, the above constructors are deprecated. To create new objects use valueOf()
        Long lo = Long.valueOf("1200000");

        //not using the appropriate String literal would cause an exception
        try{
            in = Integer.valueOf("abc");
        }
        catch(Exception e){
            System.out.println("Exception: " + e.toString());
        }

        //for Booleans, using 'true' only, as boolean or as String(in any case) will make the object as true
        Boolean This_is_true = Boolean.valueOf(true);
        Boolean This_is_also_true = Boolean.valueOf("tRuE");
        Boolean This_is_false = Boolean.valueOf("This is true");
        System.out.println("This_is_also_true: " + This_is_also_true);          //uses the toString() function here
        System.out.println("This_is_false: " + This_is_false);

        //to get the primitive value back from the object, use the appropriate function
        float getBackF = Float.valueOf(128.2F).floatValue();
        double getBack = Double.valueOf("77.23").doubleValue();         //similarly for byteValue(), shortValue(), intValue(), longValue()
    }
}
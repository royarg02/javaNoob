/*A little Over Head
Data Type of a variable is to give a overhead to the compiler
about the size of the variable specified and the particular 
operations it can do.
*/
class numeric {
    public static void main(String args[]) {
        // there are four integer data types
        // signed number

        byte small; // 1 Byte
        System.out.println("Max vale of byte= " + Byte.MAX_VALUE);
        System.out.println("Min vale of byte= " + Byte.MIN_VALUE);
        short medium; // 2 Bytes
        System.out.println("Max vale of short= " + Short.MAX_VALUE);
        System.out.println("Min vale of short= " + Short.MIN_VALUE);
        int large; // 4 Bytes
        System.out.println("Max vale of int= " + Integer.MAX_VALUE);
        System.out.println("Min vale of int= " + Integer.MIN_VALUE);
        long xtralarge; // 8 Bytes
        System.out.println("Max vale of long= " + Long.MAX_VALUE);
        System.out.println("Min vale of long= " + Long.MIN_VALUE);

        // any integer an be converted to a long by appending 'L' or 'l' at end
        xtralarge = 1729L;

        // there are two floating-point data types
        float less; // 4 bytes, single precision
        System.out.println("Max vale of float= " + Float.MAX_VALUE);
        System.out.println("Min vale of float= " + Float.MIN_VALUE);
        double more; // 8 bytes, double precision
        System.out.println("Max vale of double= " + Double.MAX_VALUE);
        System.out.println("Min vale of double= " + Double.MIN_VALUE);
        // java assumes any floating number as double, thus to assign it to float
        // 'F' is appended at end
        less = 123.456F;
        // java doesn't have any 'unsigned' data type
    }
}
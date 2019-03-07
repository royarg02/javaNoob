class numeric{
    public static void main(String args[]) {
        //there are four integer data types
        byte small; // 1 Byte
        short medium; //2 Bytes
        int large; //4 Bytes
        long xtralarge; //8 Bytes

        //any integer an be converted to a long by appending 'L' or 'l' at end
        xtralarge = 1729L;
        System.out.println(xtralarge);

        //there are two floating-point data types
        float less;     //4 bytes, single precision
        double more;    //8 bytes, double precision

        //java assumes any floating number as double, thus to assign it to float
        //'F' is appended at end
        less = 234.671F;
        System.out.println(less);
        //java doesn't have any 'unsigned' data type
    }
}
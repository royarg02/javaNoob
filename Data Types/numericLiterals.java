//numeric literals
//numeric, or integer literals are basically the whole numbers with negative numbers

class numLiteral{
    public static void main(String[] args) {
        //representing a decimal number
        int dec = 230;
        //representing a long (very large) number
        long large = 9993L;                         //'L' is appended at the end to signify 'long' value
        //representing a octal number
        int oct = 037;                              //the digit '0' is appended at the beginning to signify octal value
        //representing a hexadecimal number
        int hex = 0xA47C;                           //'0x' or '0X' is appended at the beginning to signify hexadecimal number
        System.out.println("dec = " + dec);
        System.out.println("large = " + large);
        System.out.println("oct = " + oct);         //dec(37) = 31
        System.out.println("hex = " + hex);         //dec(A47C) = 42108
    }
}
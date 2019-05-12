class charBoolean {
    public static void main(String args[]) {
        // char data type: 2 Bytes, holds single character
        System.out.println("Size of char: " + Character.SIZE / 8 + " bytes");
        System.out.println("Max vale of char= " + (int) Character.MAX_VALUE);
        System.out.println("Min vale of char= " + (int) Character.MIN_VALUE);

        /*
         * Using quotes denotes we want a character. Using integers, the variable parses
         * the integer to the specified charcter
         */
        char a = 'a';
        char A = 'A';
        char digit9 = '9';
        char digit0 = '0';
        char z = 'z';
        char Z = 'Z';
        System.out.println("0 = " + (int) digit0);
        System.out.println("9 = " + (int) digit9);
        System.out.println("A = " + (int) A);
        System.out.println("Z = " + (int) Z);
        System.out.println("a = " + (int) a);
        System.out.println("z = " + (int) z);
        // boolean data type: 1 bit, holds either 'true' or 'false'
        boolean isIt = true;

        // boolean variables are generally used in conditional statements
        if (isIt)
            System.out.printf("It is %b\n", isIt);
    }
}
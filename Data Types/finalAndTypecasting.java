class cast{
    public static void main(String args[]) {
        //symbolic constants in java is defined by 'final'
        final int value = 50;
        final float pi = 3.14159265F;
        //variables defined by 'final' cannot change their value
        //value = 100;    //doesn't work

        //type casting: converting data of one data type to other data type
        //explicit: forcing type casting in code
        int number = 100;
        byte small = (byte)number;  //type casted to byte
        long count = (long)small;   //type casted to long

        //implicit/automatic: automatic casting of data by upgradation
        int someValue = small;      //data in small is upgraded to 'int'
        double precisePi = pi;      //data in pi is upgraded to 'double'

        //type casting is also done to results from expressions
        someValue = (byte)(14/3);
        System.out.println("someValue = " + someValue);
    }
}
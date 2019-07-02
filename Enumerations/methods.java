//some enum methods
enum Sample{
    JAN(1), SEP(9), NOV(11), FEB(2), APR(4), MAY(5), JUN(6), MAR(3), JUL(7), AUG(8), OCT(10), DEC(12);
    int Month_no;
    Sample(int A){
        this.Month_no = A;
    }
    public String getName(){
        return super.toString() + ": Month_no -> " + this.Month_no;
    }
}
class Methods{
    public static void main(String[] args) {
        System.out.println("Values:");
        for(Sample A : Sample.values()){
            System.out.println("Enum: " + A.getName() + " Value: " + A.toString());
        }
        System.out.println("Ordinal");
        for(Sample A : Sample.values()){
            System.out.println("Enum: " + A.getName() + " Ordinal: " + A.ordinal() + " compareTo(\"JUN\")" + A.compareTo(Sample.JUN));
            //ordinal() returns the order of the constants which are assigned sequentially from the beginning of the list
            //ordinal can be compared to the way C/C++ assigns integer values to enumerations
            //compareTo() compares enums based on the ordinal by the same logic compareTo() works in Strings
        }
        Sample B = Sample.JAN;
        Sample C = Sample.NOV;
        Sample D = Sample.valueOf("NOV");
        System.out.println("B.equals(C): " + B.equals(C));              //equality
        System.out.println("C.equals(D): " + C.equals(D));
    }
}
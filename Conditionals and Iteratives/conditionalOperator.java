class conOperator{
    public static void main(String[] args) {
        //conditional expression (if-else in compact/ one line form)
        //assigns some value depending on some condition
        //(condition)? (value if TRUE) : (value if FALSE)
        byte number = 9;
        String digit = (number < 10)? "Single digit" : "Not single digit";
        System.out.println(digit);
    }
}
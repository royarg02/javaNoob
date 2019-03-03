class operators{
    public static void main(String args[]) {
        //operators: unary
        //works on single operand
        System.out.println(+5);   //operand: '5'
        int b=10;
        System.out.println(-b);   //operand: 'b'
        ++b;                      //increments by 1 (or b++)
        System.out.println(b);
        b--;                      //decrements by 1 (or --b)
        System.out.println(b);

        //operators: arithmetic
        System.out.println(4+6);  //addition
        System.out.println(2-8);  //subtraction
        System.out.println(3*9);  //multiplication
        System.out.println(16/7); //division

        System.out.println(5%2);  //remainder
        System.out.println(14.7 % 3.2); //remainder also works for decimals

        //operators: relational(evaluates to true or false)
        System.out.println(0>14); //greater than
        System.out.println(3<5);  //less than
        System.out.println(4==(16/4));    //equals
        System.out.println(10<=11);   //less than or equal to
        System.out.println(1>=6); //greater than or equal to
        System.out.println(2!=3); //not equals

        //operators: logical(evaluates to true or false)
        System.out.println(!true);    //logical not
        System.out.println((2>3)&&(6<10));  //logical and
        System.out.println((0!=1)||(4>10));   //logical or

        //operators: assignment
        int a=2; //assigns 2 to 'a'
        a=a+5;   //computes 'a+5', and assigns result to 'a'
        //assignment 'shorthands':
        //the above statement can also be written as
        a=2;
        a+=5;
        System.out.println(a);

        b=10;
        b*=3;    //b=b*3
        System.out.println(b);

        //operators:conditional
        //does some assignment based on some condition
        a = (a > b)? 1 : 0 ;
        System.out.println(a);
    }
}
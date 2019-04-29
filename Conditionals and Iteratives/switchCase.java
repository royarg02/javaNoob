class Switch{
    public static void main(String[] args) {
        //switch-case is kind of similar to if else
        //instead it can only check for equality and only at ONE variable
        //can also be nested like if statement
        char test = 'A';
        switch(test){   //provide the variable here
            case 'a':   //similar to if(test == 'a')
            System.out.println("This is a");
            break;      //NOTICE break here
            case 'e':   //similar to else if(test == 'e')
            System.out.println("This is e");
            break;      //NOTICE break here
            case 'i':   //similar to else if(test == 'i')
            System.out.println("This is i");
            break;      //NOTICE break here
            case 'o':   //similar to else if(test == 'o')
            System.out.println("This is o");
            break;      //NOTICE break here
            case 'u':   //similar to else if(test == 'u')
            System.out.println("This is u");
            break;      //NOTICE break here
            default:    //similar to else
            System.out.println("This is upper case");
        }               ////NOTICE no break here

        //when a case matches, it ignores any futher cases and executes all
        //statements that follows the case in the switch block, causing 'fall-through'
        switch(test){
            case 'A':
            System.out.println("This is A");
            case 'E':
            System.out.println("This is not E but fall-through");
            case 'I':
            System.out.println("This is not I but fall-through");
            default:
            System.out.println("Fall-through");
        }
        /*the break statement is thus necessary to get out of the switch block
        once the required case matching statements are done executing

        due to similar reason, 'break' statement is not included in 'default'
        case, as the control goes out of the switch block after it anyway
        */

        //from JDK 7, String values can be used as case expresssions
        String str = "two";
        switch(str){
            case "one":
            System.out.println("This is one");
            break;
            case "two":
            System.out.println("This is two");
            break;
            default:
            System.out.println("Neither one nor two");
        }
    }
}
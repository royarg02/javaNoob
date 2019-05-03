//string objects
//string in Java is implemented as objects. Unlike C/C++, char arrays are not considered strings in Java

class STRING{
    public static void main(String[] args) {
        String example = "This is a String";
        //String cannot be modified without the help of some functions

        //Conversion from primitive datatypes
        int a = 12;
        boolean b = false;
        System.out.println("String.valueOf(a): " + String.valueOf(a));
        System.out.println("String.valueOf(b): " + String.valueOf(b));
        System.out.println("String.valueOf(a) + String.valueOf(b): " + String.valueOf(a) + String.valueOf(b));

        //string concatenation operator: joins two strings
        String example2 = " and also an object";
        System.out.println("example + example2: " + example + example2);

        //string comparision: compares two string by the unicode value of their chartacters
        //considering the function is invoked as s1.compareTo(s2):
        //if s1 > s2, returns > 0
        //if s1 < s2, returns < 0
        //if s1 == s2, returns 0
        System.out.println("example.compareTo(example2): " + example.compareTo(example2));

        //Checking two strings for equality
        String copy = "This is a String";
        System.out.println("example.equals(example2): " + example.equals(example2));
        System.out.println(example.equals(copy));

        //Case insensitive comparision for equality
        String reCopy = "ThIs Is A sTrInG";
        System.out.println("example.equalsIgnorecase(reCopy): " + example.equalsIgnoreCase(reCopy));

        //Getting the length of a string
        System.out.println("example.length(): " + example.length());                //length of String 'example'
        System.out.println("example2.length(): " + example2.length());

        //Getting the character at a Specified index
        System.out.println("copy.charAt(3): " + copy.charAt(3));                    //character at '3rd', or '4th' position from left
        System.out.println("example2.charAt(6): " + example2.charAt(6));            //character at '6rd', or '7th' position from left

        //Getting the index of first occurrence of a character
        System.out.println("example.indexOf('s'): " + example.indexOf('s'));
        
        //Getting substring
        System.out.println("example.substring(8,15): " + example.substring(8,15));
        //1st argument is the beginning index of the string from which the substring is obtained
        //2nd argument is the ending index of the string at which the substring ends(till the end of the string if left empty)

        //conversion to char array
        System.out.println("example.toCharArray(): ");
        for(char A : example.toCharArray()){
            System.out.print("'" + A + "', ");
        }

        //all lowercase letters
        System.out.println("reCopy.toLowerCase(): " + reCopy.toLowerCase());

        //all uppercase letters
        System.out.println("reCopy.toUpperCase(): " + reCopy.toUpperCase());

        //removing trailing and leading spaces
        String space = "       " + example2 + "   ";
        System.out.println("space: " + space);
        System.out.println("space.trim(): " + space.trim());

        //Split string into an array of Strings
        String[] list = reCopy.split(" ");
        System.out.print("\nreCopy.Split(\" \"): ");
        for(String x : list){
            System.out.print(x + ", ");
        }
    }
}
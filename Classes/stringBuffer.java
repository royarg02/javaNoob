//String Buffer
//String Buffer are similar to String but are MODIFIABLE
class STRINGBUFFER{
    public static void main(String[] args) {
        //StringBuffer Allocates 16 more characters than the SPECIFIED STRING OR CHARSEQUENCES
        //in case no arguments are supplied, it allocates 16 charcter spaces anyway
        StringBuffer another = new StringBuffer();
        StringBuffer example2 = new StringBuffer("Modifiable String");
        //StringBuffer constructor DOES NOT allocate extra characters when the LENGTH is explicitly specified in int
        StringBuffer example = new StringBuffer(20);

        //finding length of string literal stored in StringBuffer
        System.out.println("example2.length(): " + example2.length());

        //finding size of allocated memory of the StringBuffer
        System.out.println("example2.capacity(): " + example2.capacity());
        System.out.println("example.capacity(): " + example.capacity());
        
        //ensureCapacity: gives a minimum capacity for the stringBuffer
        //if 2*(old_capacity) + 2 > min_capacity then new_capacity = 2*(old_capacity) + 2
        //else new_capacity = min_capacity
        System.out.println("another.capacity(): " + another.capacity());
        another.ensureCapacity(25);
        System.out.println("another.capacity() is now: " + another.capacity());
        another.ensureCapacity(100);
        System.out.println("another.capacity() is now: " + another.capacity());

        //setLength: sets the new length of the string literal
        //if the new length is greater than the current length, null characters are added
        //if the new length is less than the current length, remaining characters are lost
        example = new StringBuffer("Me and the Boys trying to figure out how setLength() works");
        System.out.println("example.length(): " + example.length());
        example.setLength(70);
        System.out.println("example of length 70: " + example);
        example.setLength(15);
        System.out.println("example of length 15: " + example);

        //chatAt: works similar to String
        System.out.println("example.charAt(10): " + example.charAt(10));

        //setCharAt: replaces a character in the literal by another literal at the specified index
        example.setCharAt(13, 'h');
        example.setCharAt(12, 'r');
        System.out.println("example after changes by setCharAt(): " + example);

        //substring: returns a substring
        System.out.println("example.substring(2,12): " + example.substring(2,12)); //arguments: beginning index of the substring, ending index BEFORE which the substring is ended

        //getChars: copies a substring of the StringBuffer into a character array
        char seq[] = new char[20];
        example2.getChars(3, 12, seq, 5);
        //arguments: beginning index of the substring, ending index BEFORE which the substring is ended, char array, index of the char array from which the substring is to be placed
        System.out.println("seq[]: " + String.valueOf(seq));

        //append: concatenates StringBuffer types
        example = example.append("counting to ");
        example = example.append(10);
        System.out.println("After appending: " + example);

        //insert: inserts at specified index
        example2.insert(2,"qwerty");                        //arguments: the index from where the next argument would be inserted
        example2.insert(7,'P');
        System.out.println("After Inserting: " + example2);

        //reverse: reverses the StringBuffer
        System.out.println("example.reverse(): " + example.reverse());
    }
}
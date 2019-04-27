//numeric literals in binary form
//Starting from Java SE 7, integer literals can also be defined in binary form

class moreNum{
    public static void main(String[] args) {
        int binNum = 0B110010;                          //dec(110010) = 50 (0B or 0b is placed at the front)
        System.out.println("binNum = " + binNum);
        
        //also starting from SE 7, underscores (one or more than one) can be put between digits of large numbers for readability
        long subCount = 94____974_869;                  //to 100 million!!!
        System.out.println("subCount = " + subCount);
        
        //these features can be also used together
        int another = 0b1011_0101_0010_1000;            //dec(1011 0101 0010 1000) = 46376
        System.out.println("another = " + another);
    }
}
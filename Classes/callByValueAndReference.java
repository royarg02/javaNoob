//there are two ways to pass arguments to functions in java
//call by value copies the arguments passed to the method used, and so, the values in the method and in the calling statement are
//completely different
//whereas in call by reference, the reference of the parameters in the calling statement is passed, thus making the exact variables appear
//in the called method

class callBy{
    public static void main(String[] args) {
        int value1 = 15, value2 = 50;
        Sample test = new Sample(value1,value2);                //call by reference is achieved through objects as they are basically defined as a reference
        System.out.println("Using int variables:");
        System.out.println("Values before swapping: value1 = " + value1 + ", value2 = " + value2);
        swap(value1, value2);                                   //call by value
        System.out.println("Values after swapping: value1 = " + value1 + ", value2 = " + value2);
        System.out.println("Using object:");
        System.out.println("Values before swapping: value1 = " + test.a + ", value2 = " + test.b);
        swap(test);                                             //call by reference
        System.out.println("Values after swapping: value1 = " + test.a + ", value2 = " + test.b);
    }
    static void swap(int m, int n){                             //copy of the parameters is obtained
        m = m + n;                                              //any change made will only affect the copy, not the calling parameters
        n = m - n;
        m -= n;
    }
    static void swap(Sample obj){                               //exact variables are obtained
        int temp = obj.a;                                       //any change made will be reflected in the calling parameters
        obj.a = obj.b;
        obj.b = temp;
    }
}

class Sample{
    int a;
    int b;
    Sample(int x, int y){
        this.a = x;
        this.b = y;
    }
}
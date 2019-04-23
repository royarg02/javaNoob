//access specifiers: public and private
//pubilc: any data member or method defined as public is visible(can be accessed) outside the class
//private: any data members or method defined as private is not visible anywhere outside the class

class pubpri{
    public static void main(String[] args) {
        visibility1 lol = new visibility1();
        lol.ch = 'A';                                           //lol.ch is default, thus can be accessed and used outside the class
        //lol.a = 20;                                           //lol.a is public, thus cannot be used as such
        lol.changeValue(4, 'H');                                //using public method
        lol.changea(97);                                        //it is a good practice to provide public members(as interfaces) to interact
                                                                //with the private variables
        lol.show();
    }
}

class visibility1{
    private int a;                                              //any data member or method can be defined as public or private can be
    public int x;                                               //defined by plcing the appropriate access specifier before the definition
    char ch;                                                    //this member has the 'default' access specifier
    public void changea(int m){
        this.a = m;   
    }
    void changeValue(int n, char c){                            //this member has the 'default' access specifier: it enables it to be visible to
        this.x = n;                                             //all derived classes and the classes in the same package
        this.ch = c;
    }
    void show(){
        System.out.println("lol.a: " + this.a + ",lol.x: " + this.x + ",lol.ch: " + this.ch);
    }
}
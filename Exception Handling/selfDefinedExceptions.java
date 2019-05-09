//self defined exceptions
//new exceptions can be created by extending the throwable class

class NotEnoughGFuel extends Throwable{
    private static final long serialVersionUID = 1L;                    //quick fix from VSCode :P
    String desc;
    NotEnoughGFuel(){                                                   //throwable class constructor
        this.desc = "No description provided";
    }
    NotEnoughGFuel(String desc){
        this.desc = desc;
    }
    public String toString(){                                           //functions inherited from Throwable can be overriden
        return "Exception:" + this.desc;
    }
    public String getMessage(){
        return "No purposeful Brand Placement";
    }
}

class GFuelCount{
    public static void main(String[] args) {
        try{
            checkCount(25);
            checkCount(15);
        }
        catch(NotEnoughGFuel e){
            System.out.println(e + "\n" + e.getMessage());
        }
    }
    static void checkCount(int x)throws NotEnoughGFuel{
        if(x < 20){
            throw new NotEnoughGFuel("GFuel should be more than 20 not " + String.valueOf(x));
        }
    }
}
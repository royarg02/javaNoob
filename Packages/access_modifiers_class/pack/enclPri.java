package pack;

public class enclPri{
    packPri in = new packPri();
    private class packPri{                      //only nested classes can be called private
        void show(){
            System.out.println("In packPri");
        }
    }
    public void showPri(){
        in.show();
    }
}
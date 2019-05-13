package pack;

public class enclPro{
    protected class packPro{                    //only nested classes can be called protected
        public packPro(){
            ;
        }
        public void show(){
            System.out.println("In PackPro");
        }
    }
    packPro in = new packPro();
}
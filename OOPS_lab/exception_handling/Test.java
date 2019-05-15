import java.util.Arrays;
import java.util.List;

class NotFound extends Throwable{
    public String toString(){
        return "Not Found";
    }
}
class Test{
    public static void main(String[] args){
        String arr[] = {"lol","haha","huhu"};
        try{
            check(arr);
        }catch(NotFound e){
            System.out.println("Exception e="+e.toString());
        }
    }
    static void check(String[] arr)throws NotFound{
        List<String> a = Arrays.asList(arr);
        if(!a.contains("KOLKATA")){
            throw new NotFound();
        }
    }
}
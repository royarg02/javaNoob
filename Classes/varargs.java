//Variable Argumnets
/*variable(extra) arguments to a function becomes
an element of an array signified with a '...' symbol*/

class variable{
    static float avg(int x, int y, int ... var){
        System.out.println("Variable Arguments:");
        for(int i : var){
            System.out.println(i);
        }
        if(var.length==0){
            return (x+y)/2;
        }
        else{
            int varSum=0;
            for(int i : var){
                varSum+=i;
            }
            return (x+y+varSum)/(var.length+2);
        }
    }
    static float avg(int x){                            //like other methods vararg methods can be overloaded
        return x;
    }
    static float avg(int x, float y, int z){            //in terms of type and number of formal parameters
        return (x+y+z)/3;
    }
    static float avg(float ... varFloat){               //in terms of type of the vararg array
        float varSum = 0;
        for(float i : varFloat){
            varSum += i;
        }
        return (varSum)/varFloat.length;
    }
}

class varMAIN{
    public static void main(String[] args) {       
        System.out.println("avg(15,17): " + variable.avg(15,17));
        System.out.println("avg(1,2,3,4,5,6,7,8): " + variable.avg(1,2,3,4,5,6,7,8));
        System.out.println("avg(12,88,57,32): " + variable.avg(12,88,57,32));
        System.out.println("avg(12.4,35.56,0.97): " + variable.avg(12.4F,35.56F,0.97F));
        System.out.println("avg(69): " + variable.avg(69));
    }
}
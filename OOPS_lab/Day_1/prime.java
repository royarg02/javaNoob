/*WAP to show the nos. which are prime in a given range using
command argument*/

class primeRange{
    public static void main(String args[]) {
        int i;
        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);
        System.out.println();
        for( ; low<=high ; ++low){
            for(i=2 ; i <= (low/2) ; ++i){
                if(low%i == 0)
                break;
            }
            if(i > (low/2) && low > 1)
            System.out.print(low + " ");
        }
    }
}

/*
Output:
java primeRange 0 20
2 3 5 7 11 13 17 19
*/
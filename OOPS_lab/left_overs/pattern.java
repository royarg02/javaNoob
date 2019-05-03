// WAP to print a patter
// 1
// 1 0 
// 1 0 1 
// 1 0 1 0 
class pattern{
    public static void main(String args[]){
        int s = 1;
        int a[][]=new int[4][];
        for(int i=0;i<4;i++){
            s = 1;
            a[i] = new int[i+1];
            for(int j=0;j<=i;j++){
                if(s == 0){
                    a[i][j] = s;
                    s = 1;
                }
                else{
                    a[i][j] = s;
                    s = 0;
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// OUTPUT:
// 1 
// 1 0 
// 1 0 1 
// 1 0 1 0 
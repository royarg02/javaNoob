/* WAP to print a pattern using 2D array
 *
 * *
 * * *
 * * * *
*/

class patternStar{
    public static void main(String args[]){
        char a[][]=new char[4][];
        for(int i = 0 ; i < 4 ; i++){
            a[i] = new char[i+1];
            for(int j = 0 ; j <= i ; j++){
                a[i][j] = '*';
            }
        }
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// OUTPUT:
// *
// * *
// * * *
// * * * *

/*
drow this pattern
pattern :-

3 3 3 3 3 3 3 
3 2 2 2 2 2 3    
3 2 1 1 1 2 3
3 2 1 0 1 2 3 
3 2 1 1 1 2 3
3 2 2 2 2 2 3
3 3 3 3 3 3 3 

*/

package pattern;

public class num_center {
    public static void main(String[] args) {
        int number = 3;
        int dubNumber = number * 2;
        for (int i = 0; i <= number * 2; i++) {
            System.out.println();
            for (int j = 0; j <= number * 2; j++) {
                int tmp = getNumber(i, j, number);
                // if(i == 0 || i== dubNumber-1){
                // System.out.print(" " +tmp+ "");
                // }else if (j == 0 || j == dubNumber -1){
                // System.out.print(" " +tmp+ "");
                // }else{
                // System.out.print(" " +" "+ "");
                // }
                System.out.print(" " + tmp + "");
            }
        }

    }

    public static int getNumber(int i, int j, int number) {
        i = (i <= number) ? i : number * 2 - i;
        j = (j <= number) ? j : number * 2 - j;
        if (j >= i) {
            return number - i;
        } else if (i > j) {
            return number - j;
        }
        return 0;
    }

}

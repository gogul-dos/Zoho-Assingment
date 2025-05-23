import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Value Of N: " );
        int n = scan.nextInt();
        int rStart=0, rEnd=n-1, cStart=0,cEnd=n-1;
        int[][] result = new int[n][n];
        int k=1;
        while(rStart<=rEnd && cStart<=cEnd){
            for(int col = cStart; col<=cEnd; col++){
                result[rStart][col] = k++;
            }
            rStart++;
            for(int row=rStart; row<=rEnd; row++){
                result[row][cEnd] = k++;
            }
            cEnd--;

            if(rStart<=rEnd){
                for(int col = cEnd; col>=cStart; col--){
                    result[rEnd][col] = k++;
                }
            }
            rEnd--;
            if(rStart<=rEnd){
                for(int row=rEnd; row>=rStart; row--){
                    result[row][cStart] = k++;
                }
            }
            cStart++;
        }
        System.out.println("The Result Matrix formed is: ");
        for(int[] row: result){
            System.out.println(Arrays.toString(row));
        }
    }
}

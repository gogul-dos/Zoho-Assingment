import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the m and n value: ");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int [][] arr = new int[m][n];
        int [][] tArray = new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter the value of arr["+i+"]["+j+"]");
                int temp = scan.nextInt();
                arr[i][j] = temp;
                tArray[j][i] = temp;
            }
        }
        System.out.println("The Original Matrix is: ");
        for(int[] row: arr){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("The Transpose Matrix is: ");
        for(int[]col: tArray){
            System.out.println(Arrays.toString(col));
        }
    }
}

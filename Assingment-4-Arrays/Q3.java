import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the m and n value for first matrix: ");
        int m1 = scan.nextInt();
        int n1 = scan.nextInt();
        int [][] arr = new int[m1][n1];
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                System.out.print("Enter the value of arr["+i+"]["+j+"]");
                int temp = scan.nextInt();
                arr[i][j] = temp;
            }
        }
        System.out.print("Enter the m and n value for Second matrix: ");
        int m2 = scan.nextInt();
        int n2 = scan.nextInt();
        int [][] arr2 = new int[m2][n2];
        if(n1 != m2) {
            System.out.println("Matrix multiplication can't be dont, as the column in first matrix and row in second matrix is different");
        }else{
            for(int i=0; i<m2; i++){
                for(int j=0; j<n2; j++){
                    System.out.print("Enter the value of arr2["+i+"]["+j+"]");
                    int temp = scan.nextInt();
                    arr2[i][j] = temp;
                }
            }
            int[][] resultantArr = new int[m1][n2];
            for(int i=0; i<m1; i++){
                for(int j=0; j<n2; j++){
                    for(int k=0; k<n1; k++){
                        resultantArr[i][j]+= arr[i][k] * arr2[k][j];
                    }
                }
            }
            System.out.println("The multiplied resultant matrix is: ");
            for(int[] row : resultantArr){
                System.out.println(Arrays.toString(row));
            }
        }
        

    }
}

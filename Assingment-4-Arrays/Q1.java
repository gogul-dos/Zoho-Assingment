import java.util.*;

public class Q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter The "+i+"th Value: ");
            arr[i] = scan.nextInt();
            
        }
        System.out.print("Enter the number of positions need to be rotated: ");
        System.out.println("The Initial Array Before rotation is: "+Arrays.toString(arr));
        int rotate = scan.nextInt();
        for(int i=0; i<rotate; i++){
            int temp = arr[0];
            int j=1;
            while(j<n){
                arr[j-1] = arr[j];
                j++;
            }
            arr[n-1] = temp;
        }
        System.out.println("The final Array After "+ rotate+ "rotations is: "+Arrays.toString(arr));
    }
}
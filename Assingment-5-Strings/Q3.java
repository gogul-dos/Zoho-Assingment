import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        int n=arr.length;
        String[] rev = new String[n];
        for(int i=0; i<n;i++){
            rev[n-i-1] = arr[i];
        }
        String res = String.join(" ", rev);
        System.out.println("The reversed String is: "+ res);
    }
}

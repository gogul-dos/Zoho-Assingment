import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] arr = scan.nextLine().split(" ");
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
        }

        System.out.println("The altered String is: "+ String.join(" ",arr));
    }
}

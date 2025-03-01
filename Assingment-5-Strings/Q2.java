import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String str=scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println("The Reversed String is: "+sb.toString()); 
    }
}

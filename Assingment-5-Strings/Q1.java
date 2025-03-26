import java.util.Scanner;

public class Q1{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scan.nextLine().toLowerCase();
        String vowels = "aeiou";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            String chr = str.substring(i, i+1);
            if(vowels.contains(chr)) count++;
        }
        System.out.println("The vowels count in "+vowels+" is: "+ count);
    }
}
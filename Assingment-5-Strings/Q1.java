import java.util.Scanner;

public class Q1{
    public static boolean contains(String vowels, char chr){
        for(char ch: vowels.toCharArray()){
            if(ch==chr) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scan.nextLine().toLowerCase();
        String vowels = "aeiou";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char chr = str.charAt(i);
            if(contains(vowels,chr)) count++;
        }
        System.out.println("The vowels count in "+vowels+" is: "+ count);
    }
}
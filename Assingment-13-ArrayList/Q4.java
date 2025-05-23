import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
	static ArrayList<Character> ch=new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j'));
	private static int search(char letter){
		if(ch.contains(letter)){
			return ch.indexOf(letter);
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.print(search('m'));
	}

}
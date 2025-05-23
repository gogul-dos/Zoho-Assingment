import java.util.ArrayList;
import java.util.Collections;

public class Q5 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(50);
		list.add(88);
		list.add(40);
		list.add(34);
		list.add(10);
		list.add(45);
		list.add(39);
		list.add(95);
		list.add(43);
		list.add(56);
		list.add(77);
		Collections.sort(list);
		System.out.println(list);
	}

}
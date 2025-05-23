import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		Iterator<Integer> res=arr.iterator();
		while(res.hasNext()){
			int value=res.next();
			if(value>30){
				res.remove();
			}
		}
		System.out.print(arr);
		
	}

}
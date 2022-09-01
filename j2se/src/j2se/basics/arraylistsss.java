package j2se.basics;
import java.util.ArrayList;
public class arraylistsss {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(123);
		num.add(234);
		num.add(345);
		num.add(456);
		for(int i=0;i<4;i++) {
			System.out.println(num.get(i));
		}
		
	}

}

package j2se.basics.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		int x=5 , y=7 , z=13;
		int sum1 = add(x,y);
		int sum2 = add(x,y,z);
		System.out.println("Sum 1: "+sum1+" Sum 2: "+sum2);
	}

	private static int add(int x, int y, int z) {
		
		return x+y+z;
	}

	private static int add(int x, int y) {
		
		return x+y;
	}
}

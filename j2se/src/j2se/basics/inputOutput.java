package j2se.basics;
import java.util.Scanner;

public class inputOutput {

	public static void main(String[] args) {
//		int age;
//		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
//		age = sc.nextInt();
//		System.out.println(age);
		/*
		 * System.out.println("What is your name? "); String name; name =sc.nextLine();
		 * System.out.println("Your name is "+name);
		 */
		char ch;
		System.out.println("Enter a character: ");
		ch = sc.next().charAt(0);
		System.out.println(ch);
	}

}

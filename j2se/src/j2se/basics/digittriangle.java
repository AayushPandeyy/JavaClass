package j2se.basics;

public class digittriangle {
	public static void main(String[] args) {
		System.out.println("Rectangle: ");
		int i,j,k;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Triangle: ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println("Reverse Triangle: ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=6-i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println("Triangle 3: ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				System.out.print("   ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println("Triangle 4: ");
		for(i=1;i<=5;i++) {
			for(j=1;j<i;j++) {
				System.out.print("   ");
			}
			for(j=1;j<=6-i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println("Diamond: ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5-i;j++) {
				System.out.print("   ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*  ");
			}
			for(j=1;j<i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("   ");
			}
			for(j=1;j<=5-i;j++) {
				System.out.print("*  ");
			}
			for(j=1;j<=4-i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}		
	}
}

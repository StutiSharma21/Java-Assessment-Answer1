import java.util.Scanner;

public class TwoPoints { 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position of X (1-12) :");
		int x = sc.nextInt();
		System.out.println("Enter position of Y (1-12) :");
		int y = sc.nextInt();
		
		System.out.println("x"+ "  " + "y");
		int ans = computePointOfInterception(x, y);
		System.out.println("Point at which X and Y meet is: " +  ans);
	}
	
	public static int computePointOfInterception(int x, int y) {
		while (x != y) {
			x += 2;
			y += 1;
			
			if(x > 12) {
				x %= 12;
			}
			
			if(y > 12) {
				y %= 12;
			}
			
			System.out.print(x);
			System.out.print(" " + y);
			System.out.println("\n");
		}
		
		return x;
}
}
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		System.out.println("Hello Data");
		System.out.print("Enter a radius to calculate its area: ");
		Scanner input = new Scanner(System.in);
		Double r = input.nextDouble();
		input.close();
		System.out.println("The area of a circle with radius "+r+" is "+(3.14*r*r));
	}
}

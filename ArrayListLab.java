import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLab {
	public static void main(String args[]) {
		menu();
	}

	static ArrayList<Integer> list = new ArrayList<Integer>();
	static Scanner input = new Scanner(System.in);

	private static void menu() {
		int choice = 0;
		while (choice != 4) {
			System.out.println("1. Add integer at end of list");
			System.out.println("2. Remove all instances of integer from list");
			System.out.println("3. Display size of list");
			System.out.println("4. End");
			System.out.print("Choose an option: ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter integer to add: ");
				list.add(input.nextInt());
				System.out.println("\nCurrent list "+list.toString());
				break;
			case 2:
				System.out.print("Enter integer to remove: ");
				int element = input.nextInt();
				while (list.indexOf(element) != -1) {
					list.remove(list.indexOf(element));
				}
				System.out.println("\nCurrent list "+list.toString());
				break;
			case 3:
				System.out.println("\nList size: "+list.size());
				break;
			case 4:
				break;
			default:
				System.out.println("Option not available");
			}
		}
	}
}

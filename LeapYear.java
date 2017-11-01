//Justin Yeh
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter any year after 1582 to check if it is a leap year: ");
		if (kb.hasNextInt()) {
			int year = kb.nextInt();
			
			if (year > 1582) {
			boolean leapYear = isLeapYear(year);
			System.out.println(leapYear);
			
			} else {
				System.out.println("Sorry, that year is not after 1582. I cannot give you an answer.");
			}
			
		} else {
			System.out.println("Sorry, that is not an integer. I cannot give you an answer.");
		}
	}

	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		
		if (year % 400 == 0) {
			isLeapYear = true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		} 
		
		return isLeapYear;
		
	}
}

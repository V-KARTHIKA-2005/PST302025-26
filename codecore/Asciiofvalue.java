package pst;
import java.util.Scanner;
public class Asciiofvalue {
	public class AsciiValueFinder {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character to find its ASCII value: ");
	        char character = scanner.next().charAt(0);
	        int asciiValue = character;
	        System.out.println("The ASCII value of '" + character+ "' is: " + asciiValue);
	        scanner.close();
	    }
	}
	}
package pst;
import java.util.Scanner;
public class AsciiofCharacter {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an ascii value:");
	        int ascii =sc.nextInt();
	        char ch = (char) ascii;
	        System.out.println("Character  of ASCII value " + ascii + " is: " +ch);
	    }
	}
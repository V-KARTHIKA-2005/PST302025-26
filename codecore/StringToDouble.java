package pst;
	import java.util.Scanner;
	public class StringToDouble {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        String input = sc.nextLine();
	        try {
	            double number = Double.parseDouble(input);
	            System.out.println("Converted double value: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input! Please enter a valid number.");
	        }
	        sc.close();
	    }
	}



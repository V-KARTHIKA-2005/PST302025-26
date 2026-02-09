package pst;
public class Asciisum {
	    public static void main(String[] args) {
	        String s = "Hello";
	        int sum = 0;
	        for (int i = 0; i < s.length(); i++) {
	            sum += (int)s.charAt(i); 
	        }
	        System.out.println("Sum of all characters: " + sum);
	    }
	}




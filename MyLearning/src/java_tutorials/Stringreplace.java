package java_tutorials;

public class Stringreplace {
    
	   public static void main(String[] args)
	    {
	        String str = "The quick brown fox jumps over the lazy dog.";

	        // Replace all the 'd' characters with 'f' characters.
	        String new_str = str.replace("la", "bba");

	        // Display the strings for comparison.
	        System.out.println("Original string: " + str);
	        System.out.println("New String: " + new_str);
	    }
	}

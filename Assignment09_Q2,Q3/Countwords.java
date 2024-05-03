import java.util.StringTokenizer;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name = "The class String includes methods for examining individual characters of the sequence,\r\n"
		 		+ "for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string\r\n"
		 		+ "with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode\r\n"
		 		+ "Standard version specified by the Character class.";
		 		
		 String arr[] = name.split("\\s+");
		 
		 System.out.println(arr.length);
		 
		 StringTokenizer stk = new StringTokenizer(name);
		 System.out.println(stk.countTokens());
 
	}

}


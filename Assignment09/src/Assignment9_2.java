import java.util.Scanner;

public class Assignment9_2 {

	public static String reverseString(String s1) {
		System.out.println("inside reverse");
     	if(s1 == null || s1.isEmpty()) {
     		return s1;
     	}
     	String str2 = "";
     	 for(int i =0; i<s1.length(); i++) {
        	  char ch = s1.charAt(i);
        	  str2 = ch + str2;
          }
     	 return str2;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using stringbuffer
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String s1 = sc.nextLine();
        System.out.println(s1);
        
        String s2 = reverseString(s1);
        
        System.out.println(s2);
      //  System.out.println(s1.equals(s2));
        
        if(s1.equals(s2)) {
        	//System.out.println("inside if");
        	System.out.println("String is palindrome");
        }
        else {
        	System.out.println("String is not palindrome");
        }
        
       

	}

}

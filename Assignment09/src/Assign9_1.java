import java.util.Scanner;

public class Assign9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
          String str = "Sneha";
          String str2 = " ";
          System.out.println("string before reversing");
          System.out.println(str);
          
          for(int i =0; i<str.length(); i++) {
        	  char ch = str.charAt(i);
        	  str2 = ch + str2;
          }
          System.out.println("string after reverse");
          System.out.println(str2);
          
          System.out.println("Enter String : ");
          String s1 = sc.nextLine();
          
          StringBuffer sb1 = new StringBuffer(s1);
          sb1.reverse();
          
          System.out.println(sb1);
          
	}

}

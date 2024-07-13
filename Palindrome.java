package corejava;

public class Palindrome {

	public static void main(String[] args) {

		String s ="madam";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	
	/*
	 * String s=args[0];
	 * StringBuffer sb =new StringBuffer(s);
	 * sb.reverse();
	 * 
	 * String s1=sb.toString();
	 * if(s.equals(s1)){
	 * s.o.p("Palindrome");
	 * }else{
	 * s.o.p("Not Palindrome");
	 * }
	 * 
	 */

}

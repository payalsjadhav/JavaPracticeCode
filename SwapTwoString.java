package corejava;

public class SwapTwoString {

	public static void main(String[] args) {

		String a="Java";
		String b="Program";
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}

}

package corejava;

public class CharOccu {

	public static void main(String[] args) {

		String s ="Javabyashokit";
		
		char ch='a';
		 int count=0;
		 for(int i = 0; i<s.length();i++) {
			 if(s.charAt(i)=='a') {
				 count++;
			 }
		 }
		 System.out.println(count);
	}

}

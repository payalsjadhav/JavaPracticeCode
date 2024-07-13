package corejava;

public class StringReverse {

	public static void main(String[] args) {

		String s="java";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
		/*
		 * String s="java";
		 * String rev="";
		 * for(int i=s.length()-1;i>=0;i--){
		 * rev=rev=s.charAt(i);
		 * }
		 * s.o.p(rev);
		 */
	}

}

package CoreJava;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 56784, reverse = 0;
		
		for(; number!=0; number = number/10) {
			int reminder = number%10;
			reverse = reverse * 10 + reminder;
			
		}
		System.out.println("The reverse number from For Loop is :" +reverse);
		
		while(number!=0) {
			int reminder1 = number %10;
			reverse =reverse%10+reminder1;
			number = number/10;
			
		}
		
		System.out.println("The reverse number form while loop is :"+reverse);
	}

}

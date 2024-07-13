package com.practice;

abstract class anony{
	
	public abstract void show();
	public abstract void config();
	
}
public class anonymousClassForAbstractMethod {

	public static void main(String[] args) {

		anony obj = new anony()
				{
			
			public void show() 
			{
				System.out.println("In new Show");
			}

			public void config() 
			{
				System.out.println("In Config");
			}
			
				};
				obj.show();
				obj.config();
		
	}

}

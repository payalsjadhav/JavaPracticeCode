package com.practice;

class Computer{
	
	public void playMusic() {
		System.out.println("Music Playing...");
	}
	
	public String getMePen(int cost) {
		if(cost>=10) 
			return "Pen";
		else 
			return "Nothing";
		
	}
}
public class Meth1 {

	public static void main(String[] args) {

		Computer m=new Computer();
		m.playMusic();
		String str = m.getMePen(2);
		System.out.println(str);
	}

}

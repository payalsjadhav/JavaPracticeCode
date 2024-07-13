package corejava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Shoes {

	public static void main(String[] args) throws Exception{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Brand Name: ");
		String brand = br.readLine();
		
		switch (brand){
		case "Nike":
			System.out.println("Just do it");
			break;
		case "Adidas":
			System.out.println("Imposible is Nothing");
			break;
		case "Puma":
			System.out.println("Forever Faster");
			break;
		case "Reebok":
			System.out.println("I am what I am");
			break;
		default:
				System.out.println("Brand Not Found");
				break;
	}

}
}

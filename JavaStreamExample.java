package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1{
	
	int id;
	String name;
	float price;
	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
public class JavaStreamExample {

	public static void main(String[] args) {

		List<Product1> list = new ArrayList<Product1>();
		list.add(new Product1(1,"Hp",25000f));
		list.add(new Product1(2,"Apple",90000f));
		list.add(new Product1(3,"Lenevo",28000f));
		list.add(new Product1(4,"Dell",35000f));
		
		List<Float> ProductPrice = list.stream()
				.filter(p->p.price>30000)
				.map(p->p.price)
				.collect(Collectors.toList());

		System.out.println(ProductPrice);
		
		Product1 ProductA = list.stream().max((Product1,Product2)->Product1.price>Product2.price?1:-1).get();
		System.out.println(ProductA.price);
		
//		Product1 ProductB = list.stream().min((product1,product2)->Product1.price>product2.price?1:-1).get();
//		System.out.println(ProductB.price);
	}

}

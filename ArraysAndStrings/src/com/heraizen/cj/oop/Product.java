package com.heraizen.cj.oop;

import java.util.Arrays;

public class Product {
	private int pid;
	private String pname;
	private int price;

	public Product(int pid, String pname, int price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	

	public static Product[] getProduct() {
		Product p1=new Product(15, "laptop", 45000);
		Product p2=new Product(25, "cpu", 3000);
		Product p3=new Product(34, "ups", 5000);
		Product p4=new Product(47, "Tv", 5040);
		Product p5=new Product(87, "Monitor", 35000);
		Product p6=new Product(98, "mouse", 350);
		Product p7=new Product(89, "keyboard", 700);
		Product p8=new Product(56, "table", 750);
		Product p9=new Product(59, "chair", 350);
		Product p10=new Product(59, "Ac", 50000);
		
		
		return new Product[] {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
		
		
	}
	void display() {
		System.out.println("pid = "+pid);
		System.out.println("pname = "+pname);
		System.out.println("price = "+price);
		System.out.println("************************");
	}
	
	public static void main(String[] args) {

		Product[] prod=getProduct();
		
		System.out.println("Product Details"+Arrays.toString(prod));
	

	}
	@Override
	public String toString() {
//		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
		return "\npid= " +pid +"\npname= "+pname+"\nprice = "+price;
	}
}

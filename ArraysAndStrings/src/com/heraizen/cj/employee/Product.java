package com.heraizen.cj.employee;

public class Product {

	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void swap(Product laptop, Product desktop) {
		double temp = laptop.price;
		laptop.price = desktop.price;
		desktop.price = temp;

	}

	public static void main(String[] args) {

		Product laptop = new Product(100, "sony", 8500);
		Product desktop = new Product(100, "sony", 35000);
		swap(laptop, desktop);
		System.out.println("Laptop Price " + laptop.price);
		System.out.println("Desktop price " + desktop.price);

	}

}

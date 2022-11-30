package com.basic.lambda;

interface Manufecturing
{
	void made();
}

interface Sales
{
	void sold();
}
public class Product implements Sales, Manufecturing {
	
	public static void main(String[] args) {
		Product soap = new Product();
		soap.made();
		soap.sold();
	}

	@Override
	public void made() {
		// TODO Auto-generated method stub
		System.out.println("the product has been made");
		
	}

	@Override
	public void sold() {
		// TODO Auto-generated method stub
		System.out.println("the product has been Sold");
	}

}

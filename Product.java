package ex7;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	List<String> productsNames = new ArrayList<>();
	List<Integer> productsQuants = new ArrayList<>();
	List<Double> productsPrices = new ArrayList<>();
	private int diffProductsInTotal;
	private int totalPrice = 0;
	
	public Product(){
		
	}

	public List<String> getName() {
		return productsNames;
	}

	public void setName(String name) {
		this.productsNames.add(name);
	}

	public List<Integer> getQuant() {
		return productsQuants;
	}

	public void setQuant(int quant) {
		this.productsQuants.add(quant);
	}

	public List<Double> getPrice() {
		return productsPrices;
	}

	public void setPrice(double price) {
		this.productsPrices.add(price);
	}
	
	public void setDiffProductsInTotal(int diffProductsInTotal) {
		this.diffProductsInTotal = diffProductsInTotal;
	}
	
	public double totalPrice(){
		for(int i = 0; i<diffProductsInTotal; ++i) {
			totalPrice += productsQuants.get(i) * productsPrices.get(i);		     
		}
		return totalPrice;
	}

}

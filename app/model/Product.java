package model;

public class Product {
	public String ean;
	public String name;
	public String description;

	public Product() {

	}

	public Product(String ean, String name, String descripton) {
		this.ean = ean;
		this.name = name;
		this.description = descripton;
	}

	public String toString() {
		return String.format("%s-%s", ean, name);
	}
}

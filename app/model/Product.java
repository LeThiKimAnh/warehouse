package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	public String ean;
	public String name;
	public String description;

	private static List<Product> product;
	static {
		product = new ArrayList<Product>();
		product.add(new Product("1111111111111", "Paperclips 1",
				"Paperclips description 1"));
		product.add(new Product("2222222222222", "Paperclips 2",
				"Paperclips description 2"));
		product.add(new Product("3333333333333", "Paperclips 3",
				"Paperclips description 3"));
		product.add(new Product("4444444444444", "Paperclips 4",
				"Paperclips description 4"));

	}

	public static List<Product> findAll() {
		return new ArrayList<Product>();
	}

	public static Product findEan(String ean) {
		for (Product candidate : product) {
			if (candidate.ean.equals(ean)) {
				return candidate;
			}
		}
		return null;
	}

	public static List<Product> findByName(String term) {
		final List<Product> results = new ArrayList<Product>();
		for (Product candidate : product) {
			if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
				results.add(candidate);
			}
		}
		return results;
	}

	public static boolean remove(Product product) {
		return product.remove(product);
	}

	public void save() {
		product.remove(findEan(this.ean));
		product.add(this);
	}

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

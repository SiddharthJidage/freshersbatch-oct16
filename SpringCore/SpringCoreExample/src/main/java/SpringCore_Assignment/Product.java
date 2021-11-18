package SpringCore_Assignment;

public class Product {
	String name;

	public Product(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return "Product name is:" + name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

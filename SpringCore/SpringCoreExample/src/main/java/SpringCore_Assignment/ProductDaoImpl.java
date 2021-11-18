package SpringCore_Assignment;


import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Named
public class ProductDaoImpl implements ProductDao {
	private Map<String, Product> products;

	public ProductDaoImpl() {
		products = new HashMap<String, Product>();
		products.put("P1", new Product("Product1"));
		products.put("P2", new Product("Product2"));
		products.put("P3", new Product("Product3"));

	}

	public Product getProduct(String id) {
		return products.get(id);
	}

}

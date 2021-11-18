package SpringCore_Assignment;


	import javax.inject.Inject;
	import javax.inject.Named;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	@SuppressWarnings("unused")
	@Named
	public class ProductService {
		@Inject
		private ProductDao productDao;

		public Product getProductDetail(String productId) {
			Product product = productDao.getProduct(productId);
			return product;
		}
	}
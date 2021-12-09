package OnlineShopping.service;

import java.util.List;

import OnlineShopping.model.Product;

public interface ProductService {

	
public void addProduct(Product product);
	
	public List<Product> getAllProducts();

	public void deleteProduct(Integer productId);

	public Product updateProduct(Product product);

	public Product getProduct(int productid);
}

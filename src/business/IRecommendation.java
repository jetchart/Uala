package business;

import java.util.List;

import entites.Product;

public interface IRecommendation {
	
	List<Product> getProductsRecommended(List<Product> productsToRecommend, List<Product> productsExisting);

}

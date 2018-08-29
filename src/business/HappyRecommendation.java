package business;

import java.util.ArrayList;
import java.util.List;

import entites.Product;

public class HappyRecommendation implements IRecommendation {
	@Override
	public List<Product> getProductsRecommended(List<Product> productsToRecommend, List<Product> productsExisting) {
		List<Product> productsReturn = new ArrayList<Product>();
		for (Product product : productsToRecommend) {
			if (!productsExisting.contains(product)) {
				productsReturn.add(product);
			}
		}
		return productsReturn;
	}

}

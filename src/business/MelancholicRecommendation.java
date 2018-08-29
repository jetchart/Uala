package business;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.Product;

public class MelancholicRecommendation implements IRecommendation {

	@Override
	public List<Product> getProductsRecommended(List<Product> productsToRecommend, List<Product> productsExisting) {
		List<Product> productsReturn = new ArrayList<Product>();
		Calendar cal= Calendar.getInstance();
		Integer year= cal.get(Calendar.YEAR);
		for (Product product : productsToRecommend) {
			if ((!productsExisting.contains(product) && year - product.getReleaseYear() > 10)) {
				productsReturn.add(product);
			}
		}
		return productsReturn;
	}

}

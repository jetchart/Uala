package services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Main.Main;
import business.IRecommendation;
import entites.Product;
import entites.User;
import entites.UserChannel;
import entites.UserProduct;

public class MainService {

	public static Boolean isWatchingSomethingInteresting(User user) {
		List<Product> products = getProductsByUser(user);
		for (Product product : products) {
			if (product.isInteresting()) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	public static Boolean isOldUser(User user) {
		List<Product> products = getProductsByUser(user);
		Calendar cal= Calendar.getInstance();
		Integer year= cal.get(Calendar.YEAR);
		for (Product product : products) {
			if (year - product.getReleaseYear() > 2) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	private static List<Product> getProductsByUser(User user) {
		List<Product> products = new ArrayList<Product>();
		for (UserProduct userProduct : Main.usersProduct) {
			if (user.getId().equals(userProduct.getUser().getId())) {
				products.add(userProduct.getProduct());
			}
		}
		return products;
	}
	
	public List<Product> getRecommendation(User user, IRecommendation recommendation){
		List<Product> productsByUser = getProductsByUser(user);
		return recommendation.getProductsRecommended(Main.products, productsByUser);
	}
	
	public static Boolean buyMovie(User user, Product product) {
		if (user.getCredits() >= product.getCreditsToBuy()) {
			addProductToUser(user, product);
			user.setCredits(user.getCredits() - product.getCreditsToBuy());
			notifyPurchase(user, product);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private static void notifyPurchase(User user, Product product) {
		for (UserChannel userChannel : Main.usersChannel) {
			if (userChannel.getEnabled()) {
				userChannel.getChannel().notify(user, product);
			}
		}
	}
	
	private static void addProductToUser(User user, Product product) {
		UserProduct userProduct = new UserProduct();
		userProduct.setProduct(product);
		userProduct.setUser(user);
		userProduct.setCreateAt(new Date());
		Main.usersProduct.add(userProduct);
		
	}
	
}

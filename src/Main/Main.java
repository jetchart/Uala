package Main;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entites.Channel;
import entites.Documentary;
import entites.Film;
import entites.MailChannel;
import entites.MobileChannel;
import entites.Product;
import entites.SMSChannel;
import entites.Serie;
import entites.User;
import entites.UserChannel;
import entites.UserProduct;

public class Main {

	public static List<User> users = new ArrayList<User>();
	public static List<Product> products = new ArrayList<Product>();
	public static List<UserProduct> usersProduct = new ArrayList<UserProduct>();
	public static List<Channel> channels = new ArrayList<Channel>();
	public static List<UserChannel> usersChannel = new ArrayList<UserChannel>();
	
	
	public static void main(String[] args) {
		init();
		
		//MainService.isOldUser(user);
		//MainService.buyMovie(user, product);
		//MainService.isWatchingSomethingInteresting(user);
	}


	private static void init() {
		
		/* Users */
		User user1 = new User();
		user1.setId(1L);
		user1.setName("Juan");
		user1.setSurname("Perez");
		user1.setCredits(1000L);
		users.add(user1);
		
		User user2 = new User();
		user2.setId(2L);
		user2.setName("Roberto");
		user2.setSurname("Garcia");
		user2.setCredits(10L);
		users.add(user2);
		
		/* Products */
		Film film1 = new Film();
		film1.setLenght(100);
		film1.setCreditsToBuy(6L);
		film1.setReleaseYear(2010);
		film1.setTitle("Titanic");
		film1.setOscars(2);
		products.add(film1);
		
		Film film2 = new Film();
		film2.setLenght(100);
		film2.setCreditsToBuy(6L);
		film2.setReleaseYear(2012);
		film2.setTitle("Madagascar");
		film2.setOscars(0);
		products.add(film2);
		
		Documentary documentary = new Documentary();
		documentary.setLenght(100);
		documentary.setCreditsToBuy(6L);
		documentary.setReleaseYear(2012);
		documentary.setTitle("Messi");
		products.add(documentary);
		
		Serie serie1 = new Serie();
		serie1.setLenght(2320);
		serie1.setCreditsToBuy(6L);
		serie1.setReleaseYear(2008);
		serie1.setTitle("Prison Break");
		serie1.setSeasons(5);
		products.add(serie1);
		
		Serie serie2 = new Serie();
		serie2.setLenght(1322);
		serie2.setCreditsToBuy(6L);
		serie2.setReleaseYear(2009);
		serie2.setTitle("Breaking Bad");
		serie2.setSeasons(3);
		products.add(serie2);
		
		/* Channel */
		MailChannel mail = new MailChannel();
		channels.add(mail);
		
		MobileChannel mobile = new MobileChannel();
		channels.add(mobile);
		
		SMSChannel sms = new SMSChannel();
		channels.add(sms);
		
		/* UsersChannel */
		UserChannel userChannel1 = new UserChannel();
		userChannel1.setChannel(mail);
		userChannel1.setUser(user1);
		userChannel1.setEnabled(Boolean.TRUE);
		usersChannel.add(userChannel1);
		
		UserChannel userChannel2 = new UserChannel();
		userChannel2.setChannel(sms);
		userChannel2.setUser(user2);
		userChannel2.setEnabled(Boolean.TRUE);
		usersChannel.add(userChannel2);
		
		/* UsersProduct */
		UserProduct userProduct1 = new UserProduct();
		userProduct1.setUser(user1);
		userProduct1.setCreateAt(new Date());
		userProduct1.setProduct(serie2);
		usersProduct.add(userProduct1);
		
		UserProduct userProduct2 = new UserProduct();
		userProduct2.setUser(user1);
		userProduct2.setCreateAt(new Date());
		userProduct2.setProduct(serie2);
		usersProduct.add(userProduct2);

	}

}

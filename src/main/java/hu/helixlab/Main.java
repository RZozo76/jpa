package hu.helixlab;

import hu.helixlab.domain.User;
import hu.helixlab.service.UserService;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserService();

		for(int i = 0; i < 10; ++i){
			User user = new User();
			user.setEmail("example" + i + "@gmail.com");

			userService.save(user);
		}

		for(User u : userService.findAll()){
			System.out.println(u.toString());
		}

		User user = userService.findById(2);
	}
}


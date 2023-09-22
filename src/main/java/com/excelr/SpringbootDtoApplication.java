package com.excelr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excelr.entity.Location;
import com.excelr.entity.User;
import com.excelr.repository.LocationRepository;
import com.excelr.repository.UserRepository;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {
		
		Location location = new Location();
		location.setPalce("pune");
		location.setDescription("pune is great to live");
		location.setLongitude(40.5);
		location.setLatitude(30.4);
		locationRepository.save(location);
		
		
		User user = new User();
		user.setFirstName("chetan");
		user.setLastName("yadav");
		user.setEmail("chetan@gmail.com");
		user.setPassword("secte");
		user.setLocation(location);
		userRepository.save(user);
		
		User user2 = new User();
		user2.setFirstName("john");
		user2.setLastName("cema");
		user2.setEmail("john@gmail.com");
		user2.setPassword("secte1");
		user2.setLocation(location);
		userRepository.save(user2);
		
		

		
	}

}

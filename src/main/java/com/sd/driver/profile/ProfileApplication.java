package com.sd.driver.profile;

import java.util.Optional;
import java.util.Random;

import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sd.driver.profile.dao.ProfileRepository;
import com.sd.driver.profile.model.DriverProfile;

@SpringBootApplication
public class ProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(ProfileRepository domainRepository) {
		DriverProfile obj = domainRepository.findByMobileNo(918472711617L);
		System.out.println(obj);

		// if (obj==null) {
		// 	Profile domain =new Profile();
		// 	domain.setFirstName("bidhu");
		// 	domain.set_id(new ObjectId("5b79a336ef910d0e9a2c6fe3") );
		// 	domainRepository.save(domain);
		// }
		return null;
	}
}

package com.sd.driver.profile.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.sd.driver.profile.model.DriverProfile;

public interface ProfileRepository extends MongoRepository<DriverProfile, ObjectId>{
	public DriverProfile findByMobileNo(long mobileNo);
}

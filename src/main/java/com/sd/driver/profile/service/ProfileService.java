package com.sd.driver.profile.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.driver.profile.dao.ProfileRepository;
import com.sd.driver.profile.model.DriverProfile;
//import com.sd.util.exception.DriverNotFoundException;
//import com.sd.util.common.SDCommon;

import org.springframework.hateoas.Resource;



@Service
public class ProfileService {
	
		
	@Autowired
	  private ProfileRepository profileRepository;
	

	public void insertDriverProfile(DriverProfile profile){
		//generate id for this profile
		//profile.set_id(SDCommon.generateProfileId(profile.getMobileNo(), profile.getCountryCode()));
		profileRepository.insert(profile);
	}
	
	public Resource<DriverProfile> findDriverProfile(ObjectId id){
		Optional<DriverProfile> profile = profileRepository.findById(id);
//		if (!profile.isPresent())
//			throw new DriverNotFoundException("id-" + id);
		Resource<DriverProfile> resource = new Resource<DriverProfile>(profile.get());
		return resource;
	}
	
	public List<DriverProfile> findAll(){
		return profileRepository.findAll();
	}
	
	public void updateDriverProfile(DriverProfile updateProfile) {
//		Optional<Profile> profile = profileRepository.findById(updateProfile.get_id());
//		if (!profile.isPresent())
//			throw new DriverNotFoundException("id-" + updateProfile.get_id());
		profileRepository.save(updateProfile);
	}
	
	public void deleteById(ObjectId id) {
		profileRepository.deleteById(id);
	}
	
	public DriverProfile findByMobileNo(Long mobileNo){
		return profileRepository.findByMobileNo(mobileNo);
	}
}

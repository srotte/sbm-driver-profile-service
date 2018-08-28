package com.sd.driver.profile.model;

import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@ApiModel(description="All details about the customer. ")
public class DriverProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private ObjectId  _id;
	@ApiModelProperty(notes="First Name should have atleast 3 characters")
	@Size(min=3, message="Name should have atleast 3 characters")
	private String firstName;
	
	@ApiModelProperty(notes="Last Name should have atleast 3 characters")
	@Size(min=2, message="Last Name should have atleast 3 characters")
	private String lastName;
	private Long driverProfileId;
	private String middleName;	
	private Long mobileNo;
	private Integer countryCode;
	private Long landPhoneNo;
	private String emailId;
	private String homeName;
	private String streetName;
	private String cityName;
	private String state;
	private Long pinCode;
	private String country;
	private String prefLanguage;
	private String aadharCardNo;
	private String passportNo;
	private Boolean uberDriver;
	private Boolean olaDriver;
	private String photoUrl;
	private String lisencePhotoUrl;
	private String uberIdPhotoUrl;
	private String olaIdPhotoUrl;

	public Long getDriverProfileId() {
		return this.driverProfileId;
	}

	public void setDriverProfileId(Long driverProfileId) {
		this.driverProfileId = driverProfileId;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Long getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public Long getLandPhoneNo() {
		return this.landPhoneNo;
	}

	public void setLandPhoneNo(Long landPhoneNo) {
		this.landPhoneNo = landPhoneNo;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getHomeName() {
		return this.homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPrefLanguage() {
		return this.prefLanguage;
	}

	public void setPrefLanguage(String prefLanguage) {
		this.prefLanguage = prefLanguage;
	}
		
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getAadharCardNo() {
		return this.aadharCardNo;
	}

	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}

	public String getPassportNo() {
		return this.passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public Boolean getUberDriver() {
		return this.uberDriver;
	}

	public void isUberDriver(Boolean uberDriver) {
		this.uberDriver = uberDriver;
	}

	public Boolean getOlaDriver() {
		return this.olaDriver;
	}

	public void isOlaDriver(Boolean olaDriver) {
		this.olaDriver = olaDriver;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getLisencePhotoUrl() {
		return this.lisencePhotoUrl;
	}

	public void setLisencePhotoUrl(String lisencePhotoUrl) {
		this.lisencePhotoUrl = lisencePhotoUrl;
	}

	public String getUberIdPhotoUrl() {
		return this.uberIdPhotoUrl;
	}

	public void setUberIdPhotoUrl(String uberIdPhotoUrl) {
		this.uberIdPhotoUrl = uberIdPhotoUrl;
	}

	public String getOlaIdPhotoUrl() {
		return this.olaIdPhotoUrl;
	}

	public void setOlaIdPhotoUrl(String olaIdPhotoUrl) {
		this.olaIdPhotoUrl = olaIdPhotoUrl;
	}
}

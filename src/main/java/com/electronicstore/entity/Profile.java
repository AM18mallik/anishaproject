package com.electronicstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "profiles")
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Size(min = 2,message = "Username is not valid, should have more than 2 characters")
	private String fullName;
	@PositiveOrZero(message = "Invalid Phone Number")
	private long phoneNo;
	@Email(message = "Not a valid email")
    private String email;
	private int flatNo;
	private String streetName;
	private String landMark;
	private String city;
	private String state;
	private String country;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
//	public Profile(String fullName, long phoneNo, String email, int flatNo, String streetName, String landMark,
//			String city, String state, String country) {
//		super();
//		this.fullName = fullName;
//		this.phoneNo = phoneNo;
//		this.email = email;
//		this.flatNo = flatNo;
//		this.streetName = streetName;
//		this.landMark = landMark;
//		this.city = city;
//		this.state = state;
//		this.country = country;
//	}
	
	
	
}

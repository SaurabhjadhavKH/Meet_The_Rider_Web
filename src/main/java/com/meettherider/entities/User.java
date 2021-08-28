package com.meettherider.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String user_name;
	private String user_email;
	private long user_mobile;
	private String user_dob;
	private String  user_gender;
	private String user_address;
	private String uesr_licence_no;
	private String user_bike_no;
	private String user_password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String user_name, String user_email, long user_mobile, String user_dob, String user_gender,
			String user_address, String uesr_licence_no, String user_bike_no, String user_password) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_mobile = user_mobile;
		this.user_dob = user_dob;
		this.user_gender = user_gender;
		this.user_address = user_address;
		this.uesr_licence_no = uesr_licence_no;
		this.user_bike_no = user_bike_no;
		this.user_password = user_password;
	}
	public User(String user_name, String user_email, long user_mobile, String user_dob, String user_gender,
			String user_address, String uesr_licence_no, String user_bike_no, String user_password) {
		super();
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_mobile = user_mobile;
		this.user_dob = user_dob;
		this.user_gender = user_gender;
		this.user_address = user_address;
		this.uesr_licence_no = uesr_licence_no;
		this.user_bike_no = user_bike_no;
		this.user_password = user_password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public long getUser_mobile() {
		return user_mobile;
	}
	public void setUser_mobile(long user_mobile) {
		this.user_mobile = user_mobile;
	}
	public String getUser_dob() {
		return user_dob;
	}
	public void setUser_dob(String user_dob) {
		this.user_dob = user_dob;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUesr_licence_no() {
		return uesr_licence_no;
	}
	public void setUesr_licence_no(String uesr_licence_no) {
		this.uesr_licence_no = uesr_licence_no;
	}
	public String getUser_bike_no() {
		return user_bike_no;
	}
	public void setUser_bike_no(String user_bike_no) {
		this.user_bike_no = user_bike_no;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", user_email=" + user_email + ", user_mobile="
				+ user_mobile + ", user_dob=" + user_dob + ", user_gender=" + user_gender + ", user_address="
				+ user_address + ", uesr_licence_no=" + uesr_licence_no + ", user_bike_no=" + user_bike_no
				+ ", user_password=" + user_password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

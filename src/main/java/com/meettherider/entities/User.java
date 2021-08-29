package com.meettherider.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;

	@NotBlank(message = "User Name can not be Empty !!")
	@Size(min = 2, max = 25, message = "User name must be between 2 - 25 characters !!")
	private String user_name;

	private String user_email;
	private long user_mobile;
	private String user_dob;
	private String user_gender;
	private String user_address;
	private String user_licence_no;
	private String user_bike_no;
	private String user_password;
	private String user_aadhar;
	private String role;
	private boolean status;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String user_name, String user_email, long user_mobile, String user_dob, String user_gender,
			String user_address, String uesr_licence_no, String user_bike_no, String user_password, String user_aadhar,
			String role, boolean status) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_mobile = user_mobile;
		this.user_dob = user_dob;
		this.user_gender = user_gender;
		this.user_address = user_address;
		this.user_licence_no = uesr_licence_no;
		this.user_bike_no = user_bike_no;
		this.user_password = user_password;
		this.user_aadhar = user_aadhar;
		this.role = role;
		this.status = status;
	}

	public User(int user_id, String user_name, String user_email, long user_mobile, String user_dob, String user_gender,
			String user_address, String uesr_licence_no, String user_bike_no, String user_password,
			String user_aadhar) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_mobile = user_mobile;
		this.user_dob = user_dob;
		this.user_gender = user_gender;
		this.user_address = user_address;
		this.user_licence_no = uesr_licence_no;
		this.user_bike_no = user_bike_no;
		this.user_password = user_password;
		this.user_aadhar = user_aadhar;
	}

	public User(String user_name, String user_email, long user_mobile, String user_dob, String user_gender,
			String user_address, String uesr_licence_no, String user_bike_no, String user_password,
			String user_aadhar) {
		super();
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_mobile = user_mobile;
		this.user_dob = user_dob;
		this.user_gender = user_gender;
		this.user_address = user_address;
		this.user_licence_no = uesr_licence_no;
		this.user_bike_no = user_bike_no;
		this.user_password = user_password;
		this.user_aadhar = user_aadhar;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public String getUser_licence_no() {
		return user_licence_no;
	}

	public void setUser_licence_no(String user_licence_no) {
		this.user_licence_no = user_licence_no;
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

	public String getUser_aadhar() {
		return user_aadhar;
	}

	public void setUser_aadhar(String user_aadhar) {
		this.user_aadhar = user_aadhar;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email + ", user_mobile="
				+ user_mobile + ", user_dob=" + user_dob + ", user_gender=" + user_gender + ", user_address="
				+ user_address + ", uesr_licence_no=" + user_licence_no + ", user_bike_no=" + user_bike_no
				+ ", user_password=" + user_password + ", user_aadhar=" + user_aadhar + ", role=" + role + ", status="
				+ status + "]";
	}

}

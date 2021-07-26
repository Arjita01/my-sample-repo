package com.amdocs.training.model;

public class User {
	private Long user_id;
	private String name;
	private String password;
	private String email;
	private String address;
	private String reg_date;
	private Long phone_no;
	private String upload_photo;
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", address=" + address + ", reg_date=" + reg_date + ", phone_no=" + phone_no + ", upload_photo="
				+ upload_photo + "]";
	}
	public User(Long user_id, String name,Long phone_no, String email, String address, String reg_date,
			String password, String upload_photo) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.reg_date = reg_date;
		this.phone_no = phone_no;
		this.upload_photo = upload_photo;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public String getUpload_photo() {
		return upload_photo;
	}
	public void setUpload_photo(String upload_photo) {
		this.upload_photo = upload_photo;
	}

}

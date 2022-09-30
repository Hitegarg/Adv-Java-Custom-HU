package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_gen")
	@SequenceGenerator(name = "user_id_gen", sequenceName = "user_id_seq")
	private Long id;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	//	@Column(nullable = false)
//	@NotEmpty(message = "Name can't be empty")
	private Date dob;
	
//	@Column(nullable = false, unique = true)
//	@NotEmpty(message = "Email can't be empty")
//	@Email(message = "Invalid Email")
	private String email;
	
//	@Column(nullable = false)
//	@NotEmpty(message = "Url can't be empty")
//	@Size(min = 4)
	private String gender;
	
}

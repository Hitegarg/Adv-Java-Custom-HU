package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.example.demo.validators.constraints.DateOfBirthValidator;
import com.example.demo.validators.constraints.SalaryValidator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@JsonIgnore
	private Long id;
	
	@Column(length = 100, nullable = false)
    private String name;
	
	@Column(length = 100, nullable = false)
//	@SalaryValidator
    private Double salary;
	
	@Column(unique = true, nullable = false)
//	@NotEmpty(message = "Email can't be empty")
//	@Email(message = "Invalid Email")
    private String email;
	
	@Column(nullable = false)
//	@DateOfBirthValidator
//	 @Temporal(TemporalType.DATE)
    private Date birthDate;
	
	@Column(length = 10, nullable = false)
//	@NotEmpty(message = "Gender can't be empty")
    private String gender;
	
//	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
}

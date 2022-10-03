package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.demo.validators.constraints.DateOfBirthValidator;
import com.example.demo.validators.constraints.SalaryValidator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @Column(length = 100, nullable = false)
    private String name;

//    @Column(unique = true, nullable = false)
    private String email;

    @DateOfBirthValidator
    private Date dateOfBirth;

//    @Column(length = 10, nullable = false)
    private String gender;

//    @Column(nullable=false)
    @SalaryValidator
    private Long salary;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}






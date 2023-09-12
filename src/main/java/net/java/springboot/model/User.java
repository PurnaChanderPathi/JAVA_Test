package net.java.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	@Column(name = "userName", nullable = false)
	// userName Should not be Empty or not null
	//userName Should have atleast 2 digits
	@NotEmpty
	@Size(min =2, message = "userName Should have atleast 2 digits")
	private String name;
	
	// Email Should not be Empty or not null
	// Email Should be a valid email format
	@NotEmpty
	@Email
	private String email;
	
	// Password Should not be Empty or not null
	// Password Should have atleast 8 digits
	@NotEmpty
	@Size(min = 8,message = "Password Should have atleast 8 digits")
	private String password;
	
	public User() {
		super();
	}
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}

package com.example.Entity;






import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	
	@OneToOne(fetch =FetchType.LAZY,cascade = CascadeType.ALL )
	@JoinColumn(name="UserData")
	UserData UserData;

	public User() {
		
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

	public UserData getUserData() {
		return UserData;
	}

	public void setUserData(UserData userData) {
		UserData = userData;
	}

	public User(Long id, String name, com.example.Entity.UserData userData) {
		super();
		this.id = id;
		this.name = name;
		UserData = userData;
	}
	

	
	
	
	
	
	

}

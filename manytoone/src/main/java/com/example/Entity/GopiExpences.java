package com.example.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "gopiExpences")
public class GopiExpences {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "country")
	private String Country;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "GopiExpences")
	List<Gopi> gopi = new ArrayList<>();
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	public List<Gopi> getGopi() {
		return gopi;
	}
	public void setGopi(List<Gopi> gopi) {
		this.gopi = gopi;
	}
	public GopiExpences() {}
	public GopiExpences(Long id, String country,List<Gopi> gopi ) {
		super();
		this.id = id;
		Country = country;
		this.gopi = gopi;
	
	}
	
	
	@Override
	public String toString() {
		return "GopiExpences [id=" + id + ", Country=" + Country + ", gopi=" + gopi + "]";
	}
 
	
}

package com.example.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="gopi")
public class Gopi {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
     @Column(name = "name")
	private String name;
      
     @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
     GopiExpences GopiExpences;

	public Gopi() {
		super();
	}

	public Gopi(Long id, String name, com.example.Entity.GopiExpences gopiExpences) {
		super();
		this.id = id;
		this.name = name;
		GopiExpences = gopiExpences;
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

	public GopiExpences getGopiExpences() {
		return GopiExpences;
	}

	public void setGopiExpences(GopiExpences gopiExpences) {
		GopiExpences = gopiExpences;
	}

	@Override
	public String toString() {
		return "Gopi [id=" + id + ", name=" + name + ", GopiExpences=" + GopiExpences + "]";
	}
     
     
}

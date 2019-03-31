package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="type")
	private String type;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="personphone",
		joinColumns=@JoinColumn(name="phoneid"),
		inverseJoinColumns=@JoinColumn(name="personid"))
	private Set<Person> persons;
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
}

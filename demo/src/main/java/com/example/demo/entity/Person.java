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
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Entity
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name", nullable=false)
	private String name;

	@Column(name="fid", nullable=false)
	private Integer fid;

	@OneToOne(cascade= {}, fetch=FetchType.LAZY)
	@JoinColumn(name="fid", insertable=false, updatable=false)
	private Family family;
	
	@ManyToMany(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="personphone",
		joinColumns=@JoinColumn(name="personid"),
		inverseJoinColumns=@JoinColumn(name="phoneid"))
	private Set<Phone> phones;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	
}

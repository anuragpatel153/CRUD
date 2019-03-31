package com.example.demo.entity;

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
@Table(name="personphone")
public class PersonPhone {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="personid")
	private String personid;
	
	@Column(name="phoneid")
	private Integer phoneid;
	
	@OneToOne(cascade= {},fetch=FetchType.LAZY)
	@JoinColumn(name="personid",insertable=false,updatable=false)
	private Person person;
	
	@OneToOne(cascade= {}, fetch=FetchType.LAZY)
	@JoinColumn(name="phoneid",insertable=false,updatable=false)
	private Phone phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonid() {
		return personid;
	}

	public void setPersonid(String personid) {
		this.personid = personid;
	}

	public Integer getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(Integer phoneid) {
		this.phoneid = phoneid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	

}

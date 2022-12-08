package com.cache2;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity

@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Table (name="Stud")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		
private int id;
 @Column(name= "name")
private String name;
private String city;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
} 
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}

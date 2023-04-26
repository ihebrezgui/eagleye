package net.javaguides.springboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")

public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Role() {
		
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}
	@GetMapping
	public Long getId() {
		return id;
	}
	@GetMapping
	public void setId(Long id) {
		this.id = id;
	}
	@GetMapping
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

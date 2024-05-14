package com.shahbaz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="sasha_tab")
public class Sasha {
	@Id
	@GeneratedValue
	@Column(name="sasha_id")
	private Integer id;
	
	@Column(name="sasha_name")
	private String name;
	
	@Column(name="sasha_userId")
	private String userId;
	
	@Column(name="sasha_phone")
	private Long phone;
	
	@Column(name="sasha_email")
	private String email;
	
	@Column(name="sasha_password")
	private String password;
	
	@Column(name="sasha_panNo")
	private String panNo;
	
	@Column(name="sasha_sponsor")
	private String sponsor;
}

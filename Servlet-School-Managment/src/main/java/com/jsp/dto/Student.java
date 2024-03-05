package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String s_first_name;
	private String s_middle_name;
	private String s_family_name;
	private String s_address;
	private String s_city;
	private String s_dist;
	private String s_state;
	private String s_parent_mob;
	private String s_mob;
	private String s_email;
	private String s_password;
	
	public String getS_first_name() {
		return s_first_name;
	}
	public void setS_first_name(String s_first_name) {
		this.s_first_name = s_first_name;
	}
	public String getS_middle_name() {
		return s_middle_name;
	}
	public void setS_middle_name(String s_middle_name) {
		this.s_middle_name = s_middle_name;
	}
	public String getS_family_name() {
		return s_family_name;
	}
	public void setS_family_name(String s_family_name) {
		this.s_family_name = s_family_name;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public String getS_city() {
		return s_city;
	}
	public void setS_city(String s_city) {
		this.s_city = s_city;
	}
	public String getS_dist() {
		return s_dist;
	}
	public void setS_dist(String s_dist) {
		this.s_dist = s_dist;
	}
	public String getS_state() {
		return s_state;
	}
	public void setS_state(String s_state) {
		this.s_state = s_state;
	}
	public String getS_parent_mob() {
		return s_parent_mob;
	}
	public void setS_parent_mob(String s_parent_mob) {
		this.s_parent_mob = s_parent_mob;
	}
	public String getS_mob() {
		return s_mob;
	}
	public void setS_mob(String s_mob) {
		this.s_mob = s_mob;
	}
	
	public String getS_password() {
		return s_password;
	}
	public void setS_password(String s_password) {
		this.s_password = s_password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	
	
}

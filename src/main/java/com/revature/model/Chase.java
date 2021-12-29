package com.revature.model;

import java.util.Objects;

public class Chase{
	
	private int id;
	private String specialty;
	private String name;
	public Chase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, specialty);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chase other = (Chase) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(specialty, other.specialty);
	}
	@Override
	public String toString() {
		return "Chase [id=" + id + ", specialty=" + specialty + ", name=" + name + "]";
	}

}

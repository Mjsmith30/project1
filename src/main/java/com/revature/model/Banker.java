package com.revature.model;

import java.util.Objects;

public class Banker {
	
	private int id;
	private String name;
	private int account;
	public Banker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Banker(int id, String name, int account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}
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
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	@Override
	public int hashCode() {
		return Objects.hash(account, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banker other = (Banker) obj;
		return account == other.account && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Banker [id=" + id + ", name=" + name + ", account=" + account + "]";
	}

}

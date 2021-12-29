package com.revature.model;

import java.util.Objects;

public class OneFinancialBank {
	private int id;
	private String name;
	private int amountInAccount;
	
	
	public OneFinancialBank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OneFinancialBank(int id, String name, int amountInAccount) {
		super();
		this.id = id;
		this.name = name;
		this.amountInAccount = amountInAccount;
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
	public int getAmountInAccount() {
		return amountInAccount;
	}
	public void setAmountInAccount(int amountInAccount) {
		this.amountInAccount = amountInAccount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amountInAccount, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OneFinancialBank other = (OneFinancialBank) obj;
		return amountInAccount == other.amountInAccount && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "OneFinancialBank [id=" + id + ", name=" + name + ", amountInAccount=" + amountInAccount + "]";
	}

}

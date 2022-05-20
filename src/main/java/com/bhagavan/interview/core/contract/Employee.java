package com.bhagavan.interview.core.contract;

import java.util.Objects;

public class Employee {
	public String RegNumber;
	public String state;
	
	Employee(String number,String state)
	{
		RegNumber=number;
		this.state=state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRegNumber() {
		return RegNumber;
	}


	

	@Override
	public int hashCode() {
		return Objects.hash(RegNumber, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(RegNumber, other.RegNumber) && Objects.equals(state, other.state);
	}

	public void setRegNumber(String regNumber) {
		RegNumber = regNumber;
	}

}

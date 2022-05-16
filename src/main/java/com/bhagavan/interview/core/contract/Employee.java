package com.bhagavan.interview.core.contract;

import java.util.Objects;

public class Employee {
	public String RegNumber;
	
	Employee(String number)
	{
		RegNumber=number;
	}

	public String getRegNumber() {
		return RegNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(RegNumber);
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
		return Objects.equals(RegNumber, other.RegNumber);
	}

	public void setRegNumber(String regNumber) {
		RegNumber = regNumber;
	}

}

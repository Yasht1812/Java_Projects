package com.thinkitive.day6;

import java.util.Comparator;

public class EmployeeAddress implements Comparator<EmployeeAddress> {
int pincode ; 
String cityString;

public EmployeeAddress(int pincode, String cityString) {
	super();
	this.pincode = pincode;
	this.cityString = cityString;
	
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public String getCityString() {
	return cityString;
}

public void setCityString(String cityString) {
	this.cityString = cityString;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cityString == null) ? 0 : cityString.hashCode());
	result = prime * result + pincode;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeAddress other = (EmployeeAddress) obj;
	if (cityString == null) {
		if (other.cityString != null)
			return false;
	} else if (!cityString.equals(other.cityString))
		return false;
	if (pincode != other.pincode)
		return false;
	return true;
}

@Override
public String toString() {
	return "EmployeeAddress [pincode=" + pincode + ", cityString=" + cityString + "]";
}

@Override
public int compare(EmployeeAddress o1, EmployeeAddress o2) {
	// TODO Auto-generated method stub
	return this.cityString.compareTo(o2.cityString);
}


}

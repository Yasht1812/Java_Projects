package com.thinkitive.day1.hibernate.onetomany;

public class Address {
private int pincode;
private String city;
public Address() {
	// TODO Auto-generated constructor stub
}
public Address(int pincode, String city) {
	super();
	this.pincode = pincode;
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
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
	Address other = (Address) obj;
	if (pincode != other.pincode)
		return false;
	return true;
}
@Override
public String toString() {
	return "Address [pincode=" + pincode + ", city=" + city + "]";
}
}
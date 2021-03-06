package com.example.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class AuditLog {
	
	
	@Id
	@GeneratedValue
	private int ID;
	private String ehr; 
	private String method;
	private String request_Body;
	private String request_Url;
	private String response_Body;
	private String response_Status;
	private String timestamp;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getEhr() {
		return ehr;
	}
	public void setEhr(String ehr) {
		this.ehr = ehr;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getRequest_Body() {
		return request_Body;
	}
	public void setRequest_Body(String request_Body) {
		this.request_Body = request_Body;
	}
	public String getRequest_Url() {
		return request_Url;
	}
	public void setRequest_Url(String request_Url) {
		this.request_Url = request_Url;
	}
	public String getResponse_Body() {
		return response_Body;
	}
	public void setResponse_Body(String response_Body) {
		this.response_Body = response_Body;
	}
	public String getResponse_Status() {
		return response_Status;
	}
	public void setResponse_Status(String response_Status) {
		this.response_Status = response_Status;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "AuditLog [ID=" + ID + ", ehr=" + ehr + ", method=" + method + ", request_Body=" + request_Body
				+ ", request_Url=" + request_Url + ", response_Body=" + response_Body + ", response_Status="
				+ response_Status + ", timestamp=" + timestamp + "]";
	}
}

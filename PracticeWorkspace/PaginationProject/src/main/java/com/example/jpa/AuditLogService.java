package com.example.jpa;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AuditLogService {

	@Autowired
	AuditLogDTO auditLogDTO;
	String line = "";

	public void saveAuditLog() {
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader("src/main/resources/audit_log_202103251936.csv"));
			while ((line = bufferedReader.readLine()) != null) {
				String[] data = line.split(",");
				AuditLog auditLog = new AuditLog();
				auditLog.setEhr(data[1]);
				auditLog.setMethod(data[2]);
				auditLog.setRequest_Body(data[3]);
				auditLog.setRequest_Url(data[4]);
				auditLog.setResponse_Body(data[5]);
				auditLog.setResponse_Status(data[6]);
				auditLog.setTimestamp(data[7]);
				auditLogDTO.save(auditLog);
				
			}
			bufferedReader.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

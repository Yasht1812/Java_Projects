package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditLogController {

	@Autowired
	private AuditLogService auditLogService;
	
	@RequestMapping("/auditlogdata")
	public void setAuditData() {
		auditLogService.saveAuditLog();
	}
}

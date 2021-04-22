package com.cg.entities;

import java.time.LocalDate;

public class BusOperatorRequest {
	
	private int caseNumber;
	private String busOperatorUsername;
	private Bus bus;
	private String requestMsg;
	private String requestFor; // Possible values deleteBus,update Fare,Change Route , Change Time
	private boolean status; // approved = true , unapproved = false
	private LocalDate requestDate;
	
	
}

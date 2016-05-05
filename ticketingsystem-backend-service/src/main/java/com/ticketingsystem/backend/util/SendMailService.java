package com.ticketingsystem.backend.util;

public interface SendMailService {
	
	void sendMail(String from, String to, String subject, String message);
	
}

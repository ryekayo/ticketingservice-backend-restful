package com.ticketingsystem.backend.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("sendMailService")
public class SendMailServiceImpl implements SendMailService {

	@Autowired
	private MailSender mailSend;
	
	public MailSender getMailSender()
	{
		return mailSend;
	}
	public void setMailSender(MailSender mailSend)
	{
		this.mailSend = mailSend;
	}
	@Override
	public void sendMail(String from, String to, String subject, String message)
	{
		SimpleMailMessage messageSent = new SimpleMailMessage();
		
		messageSent.setFrom(from);
		messageSent.setTo(to);
		messageSent.setSubject(subject);
		messageSent.setText(message);
		mailSend.send(messageSent);
	}
}

package com.example.demo;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMailWithAttachment(String toEmail, String body, String subject, String attachment) {
		
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
			
			mimeMessageHelper.setFrom("akashchand1703@gmail.com");
			mimeMessageHelper.setTo(toEmail);
			mimeMessageHelper.setText(body);
			mimeMessageHelper.setSubject(subject);
			
			FileSystemResource fileSystemResouce = new FileSystemResource(new File(attachment));
			mimeMessageHelper.addAttachment(fileSystemResouce.getFilename(),fileSystemResouce);
			javaMailSender.send(mimeMessage);
			
			System.out.println("file is send successfully using JavaMailSender");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		
	}
}

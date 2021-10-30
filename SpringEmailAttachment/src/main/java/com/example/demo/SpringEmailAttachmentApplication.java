package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailAttachmentApplication {

	@Autowired
	private EmailSenderService emailSenderService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailAttachmentApplication.class, args);
		System.out.println("akash chand starting spring boot project");
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail() {
		emailSenderService.sendMailWithAttachment("udhavanand12@gmail.com",
				"Please find the attachment send throught springBoot project don't you dare to call after receiving this we will talk after 11:30 PM",
				"SpringBoot JavaEmailSender Project",
				"D:\\Nannu.txt");
	}

}

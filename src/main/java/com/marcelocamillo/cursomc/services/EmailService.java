package com.marcelocamillo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.marcelocamillo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}

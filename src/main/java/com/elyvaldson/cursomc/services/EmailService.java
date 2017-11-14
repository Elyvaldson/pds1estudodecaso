package com.elyvaldson.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.elyvaldson.cursomc.domain.Cliente;
import com.elyvaldson.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}

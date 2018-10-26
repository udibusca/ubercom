package com.projeto.ubercom.services;

import org.springframework.mail.SimpleMailMessage;
import com.projeto.ubercom.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
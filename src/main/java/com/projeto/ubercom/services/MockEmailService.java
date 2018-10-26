package com.projeto.ubercom.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import javax.mail.internet.MimeMessage;

public class MockEmailService extends AbstractEmailService {
	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	/* (non-Javadoc)
	 * @see com.projeto.ubercom.services.EmailService#sendEmail(org.springframework.mail.SimpleMailMessage)
	 */
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOG.info("Simulando envio email");
		LOG.info(msg.toString());
		LOG.info("Email enviado com sucesso!");
	}

	/* (non-Javadoc)
	 * @see com.projeto.ubercom.services.EmailService#sendHtmlEmail(javax.mail.internet.MimeMessage)
	 */
	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("Simulando envio de email HTML...");
		LOG.info(msg.toString());
		LOG.info("Email enviado");
	}
}

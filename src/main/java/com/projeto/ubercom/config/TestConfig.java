package com.projeto.ubercom.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.ubercom.services.DBService;
import com.projeto.ubercom.services.EmailService;
import com.projeto.ubercom.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	@Autowired
	private DBService dbService;

	/**
	 * @return
	 * @throws ParseException
	 */
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}

	/**
	 * @return
	 */
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}

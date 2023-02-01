package com.amqp.client.ocp4.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;

@EnableJms
@SpringBootApplication
public class AmqpClientSslOpc4DemoApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(AmqpClientSslOpc4DemoApplication.class, args);
	}

	@JmsListener(destination = "TEST")
	public void receiveMessage(String text) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(String.format("Received '%s'", text));
	}

}

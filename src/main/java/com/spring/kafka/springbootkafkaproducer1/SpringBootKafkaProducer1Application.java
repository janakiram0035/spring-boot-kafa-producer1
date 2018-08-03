package com.spring.kafka.springbootkafkaproducer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.java")
public class SpringBootKafkaProducer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaProducer1Application.class, args);
	}
}

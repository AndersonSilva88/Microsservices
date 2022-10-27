package com.anderson.ClienteServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SuppressWarnings("ALL")
@SpringBootApplication
@RefreshScope
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ClienteServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteServerApplication.class, args);
	}

}

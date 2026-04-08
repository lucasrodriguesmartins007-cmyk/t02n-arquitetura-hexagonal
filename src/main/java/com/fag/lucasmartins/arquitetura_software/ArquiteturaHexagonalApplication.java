package com.fag.lucasmartins.arquitetura_software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.http")
public class ArquiteturaHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquiteturaHexagonalApplication.class, args);
	}

}

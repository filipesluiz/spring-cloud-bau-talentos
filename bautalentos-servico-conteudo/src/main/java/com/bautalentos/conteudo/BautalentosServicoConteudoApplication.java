package com.bautalentos.conteudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BautalentosServicoConteudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BautalentosServicoConteudoApplication.class, args);
	}

}

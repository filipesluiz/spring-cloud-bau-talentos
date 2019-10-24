package com.bautalentos.conteudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/** Ribbon faz o banlanço de carga (Load Balancer! **/
@RibbonClient(name = "servico-categoria")
@EnableFeignClients
@SpringBootApplication
public class BautalentosServicoConteudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BautalentosServicoConteudoApplication.class, args);
	}

}

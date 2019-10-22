package com.bautalentos.conteudo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringConfig {

	@Bean("cliente")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}

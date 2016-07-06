package br.arquitetura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("br.arquitetura.service")
@EnableJpaRepositories(basePackages = {"br.arquitetura.dao"})
@EntityScan(basePackages = {"br.arquitetura.dominio"})
public class SpringBootArquiteturaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootArquiteturaApplication.class, args);	
	}
	
}

package com.will.loja;

import com.will.loja.entity.Funcionario;
import com.will.loja.service.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LojaApplication {
	private static final Logger log = LoggerFactory.getLogger(LojaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(FuncionarioService funcionarioService){
		return (args) -> {
//			Funcionario f1 = new Funcionario("Will", "042.378.069-79", 37, "Desenvolvedor");
//			funcionarioService.salvar(f1);
		};
	}
}

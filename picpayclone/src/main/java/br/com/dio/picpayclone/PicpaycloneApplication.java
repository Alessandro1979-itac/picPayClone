package br.com.dio.picpayclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("br.com.dio.picpayclone.model")
@ComponentScan(basePackages = {"br.com.dio.picpayclone.repository"})
@SpringBootApplication
public class PicpaycloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicpaycloneApplication.class, args);
	}
}
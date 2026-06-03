package io.savioromario10.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

	@Autowired
	@Qualifier("apiVersion")
	private String apiVersion;

	@GetMapping("/version")
	public String version(){
		return apiVersion;
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
}
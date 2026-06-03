package io.savioromario10.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class Controller {
  
  @Autowired
	@Qualifier("apiVersion")
	private String apiVersion;

	@GetMapping("/version")
	public String version(){
		return apiVersion;
	}
}
package io.savioromario10.vendas;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ApiConfiguration {

  @Bean(name = "apiVersion")
  public String apiVersion() {
    return "1.0.0";
  }
}
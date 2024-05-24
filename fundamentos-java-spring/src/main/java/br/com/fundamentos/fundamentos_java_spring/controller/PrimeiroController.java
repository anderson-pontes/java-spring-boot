package br.com.fundamentos.fundamentos_java_spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/primeiroController")
public class PrimeiroController {

  @GetMapping("/primeiroMetodo")
  public String primeiroMetodo(){
    return "Parabéns, você criou a sua primeira rota";
  }
  
  
}

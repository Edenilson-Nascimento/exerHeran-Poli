package com.generation.helleworld.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
     @GetMapping
	public String hello() {
		return "hello world!!";
	}
     
     
     @GetMapping("/bsm")
 	public String bsms() {
 		return " Mentalidades: <br/> Orintação ao futuro <br/> Percistencia <br/> Responsabilidade pessoal <br/> "
 				+ "Mentalidade de crescimento <br/> <br/>" +
 				"Habilidades: <br/> Trabalho em equipe <br/> Atenção aos detalhes <br/> Proatividade <br>"
 				+ " Comucicação";
 	}
     
     @GetMapping("objetivos")
 	public String objetivos_aprendezado() {
 		return "MySQL <br/> Spring tooll <br/> Font end";
 	}
     
	
}

package org.serratec.projetoJava2.projetoJava2.controllers;

import org.serratec.projetoJava2.projetoJava2.exceptions.ContaInvalida;
import org.serratec.projetoJava2.projetoJava2.exceptions.ValorInvalido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrosController {
	
	@ExceptionHandler(ContaInvalida.class)
	public ResponseEntity<String> trataContaInvalida(ContaInvalida exception){
		String msg = "Essa conta não existe";
		return ResponseEntity.notFound()
				.header("x.erro.msg", msg)
				.build();
	}
	
	@ExceptionHandler(ValorInvalido.class)
	public ResponseEntity<String> trataContaInvalida(ValorInvalido exception){
		String msg = "Essa conta não existe";
		return ResponseEntity.notFound()
				.header("x.erro.msg", msg)
				.build();
	}
}

package org.serratec.projetoJava2.projetoJava2.controllers;

import java.util.List;

import org.serratec.projetoJava2.projetoJava2.domain.Conta;
import org.serratec.projetoJava2.projetoJava2.exceptions.ContaInvalida;
import org.serratec.projetoJava2.projetoJava2.exceptions.ValorInvalido;
import org.serratec.projetoJava2.projetoJava2.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Conta")
public class ContaController {
	
	@Autowired
	private ContaService contaService;
	
	@GetMapping
	public List<Conta> exibirTodasContas(){
		return contaService.exibirContas();
	}
	
	@GetMapping("/{numero}")
	public Conta exibirUmaConta(@PathVariable Integer numero) throws ContaInvalida {
		return contaService.exibirConta(numero);
	}
	@PostMapping
	public Conta inserirConta(@RequestBody Conta contaNova) {
		return contaService.inserirConta(contaNova);
		
	}
	@PostMapping("/{numero}/saque")
	public Conta saque(@PathVariable Integer numero, @RequestParam Double valor) throws ValorInvalido, ContaInvalida {
		return contaService.saque(numero, valor);
	}
	
	@PostMapping("/{numero}/deposito")
	public Conta atualizarConta(@PathVariable Integer numero, @RequestParam Double valor) throws ValorInvalido, ContaInvalida {
		return contaService.deposito(numero, valor);
	}
	
	@DeleteMapping("/{numero}")
	public void excluirConta(@PathVariable Integer numero) throws ContaInvalida {
		contaService.excluirConta(numero);
	}
}

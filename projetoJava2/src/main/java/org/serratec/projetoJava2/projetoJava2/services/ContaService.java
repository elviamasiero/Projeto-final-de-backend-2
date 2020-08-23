package org.serratec.projetoJava2.projetoJava2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.serratec.projetoJava2.projetoJava2.domain.Conta;
import org.serratec.projetoJava2.projetoJava2.exceptions.ContaInvalida;
import org.serratec.projetoJava2.projetoJava2.exceptions.ValorInvalido;

@Service
public class ContaService {
	
	private List<Conta> listaConta = new ArrayList<Conta>();
	private Integer numeroConta = 0;
	
	public ContaService() {
		listaConta.add(new Conta(500, "Daniel", 2000.0));
		listaConta.add(new Conta(600, "Elvia", 3000.0));
		listaConta.add(new Conta(700, "Adriana", 4000.0));
		numeroConta = 800;
	}
	
	public List<Conta>exibirContas(){
		return listaConta;
	}
	
	public Conta exibirConta(Integer numero) throws ContaInvalida {
		for(Conta conta : listaConta) {
			if(conta.getNumero().equals(numero)) {
				throw new ContaInvalida();
			} 
		}
		return null;
		
	}
	public Conta inserirConta(Conta conta) {
		conta.setNumero(numeroConta);
		listaConta.add(conta);
		numeroConta = numeroConta + 100;
		return conta;
		
	}
	public Conta atualizarConta(Integer numero, Conta conta) throws ContaInvalida {
		Conta contaAtualizada = exibirConta(conta.getNumero());
		contaAtualizada.setNumero(conta.getNumero());
		contaAtualizada.setTitular(conta.getTitular());
		return contaAtualizada;	
	}
	
	public void excluirConta(Integer numero) throws ContaInvalida {
		Conta contaExcluida = exibirConta(numero);
		listaConta.remove(contaExcluida);	
	}
	
	public Conta saque(Integer numero, Double valor)  throws ValorInvalido, ContaInvalida {
		Conta contaRecuperada = exibirConta(numero);
		if(contaRecuperada.getSaldo() < valor) {
			throw new ValorInvalido();
		}else {
			contaRecuperada.setSaldo(contaRecuperada.getSaldo() - valor);
		}
		
		return contaRecuperada;
	}
	
	public Conta deposito(Integer numero, Double valor) throws ValorInvalido, ContaInvalida {
		Conta contaRecuperada = exibirConta(numero);
		
		if(valor < 50) {
			throw new ValorInvalido();
		}else {
			contaRecuperada.setSaldo(contaRecuperada.getSaldo() + valor);
		}
		return contaRecuperada;
	}
}

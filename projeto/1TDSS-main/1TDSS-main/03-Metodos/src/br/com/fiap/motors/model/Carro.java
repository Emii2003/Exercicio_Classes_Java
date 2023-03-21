package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
		
		public void atualizarValor (double porcentagem) {
			valor*= (1 + porcentagem);
		}
		
		// Calcular o valor do seguro do carro (5% do valor do carro)
		double calcularSeguro (double seguro) {
	    seguro = (valor*5) / 100;
			return seguro;
		}
		
		//pegar quantidade de parcelas e calcular o valor do seguro
		
	}
	

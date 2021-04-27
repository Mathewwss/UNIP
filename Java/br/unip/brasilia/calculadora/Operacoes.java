// ----------------------------- PACKAGE ---------------------------- //

// No meu ambiente so executou comentando a linha do package.
// Tente executar sem comentar a linha do package

// package br.unip.brasilia.calculadora;

// ------------------------------------------------------------------ //

// ----------------------------- IMPORTS ---------------------------- //

import java.util.ArrayList;

// ------------------------------------------------------------------ //

// ----------------------------- CLASSES ---------------------------- //

// Operações da calculadora
public class Operacoes{
	float num1;
	float num2;

	// Construtor
	public Operacoes(float num1, float num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	// Somando
	public float Soma(){
		float soma = this.num1 + this.num2;
		return soma;
	}

	// Subtração
	public ArrayList<Float> Subtracao(){
		ArrayList<Float> subs = new ArrayList<Float>();
		float sub1 = this.num1 - this.num2;
		float sub2 = this.num2 - this.num1;

		// Adicionando subtracoes a lista
		subs.add(sub1);
		subs.add(sub2);

		// Listando subtrações
		return subs;
	}

	// Multiplicacao
	public float Multiplicacao(){
		float mult = this.num1 * this.num2;
		return mult;
	}

	// Divisão
	public ArrayList<Float> Divisao(){
		ArrayList<Float> divs = new ArrayList<Float>();

		// Denominador > 0
		if (this.num1 != 0){
			float div = this.num2 / this.num1;
			divs.add(div);
		}

		// Denominador > 0
		if (this.num2 != 0){
			float div = this.num1 / this.num2;
			divs.add(div);
		}

		// Listando divisões
		return divs;
	}
}

// ------------------------------------------------------------------ //

// ----------------------------- PACKAGE ---------------------------- //

// No meu ambiente so executou comentando a linha do package.
// Tente executar sem comentar a linha do package

// package br.unip.brasilia.calculadora;

// ------------------------------------------------------------------ //

// ----------------------------- IMPORTS ---------------------------- //

import java.util.ArrayList;
import java.util.Scanner;

// ------------------------------------------------------------------ //

// ----------------------------- CLASSES ---------------------------- //

public class Calc{
	// Menu
	public static String Menu(){
		int count = 1;
		ArrayList<String> opcoes = new ArrayList<String>();

		// Adicionando opções
		opcoes.add("0");
		opcoes.add("+");
		opcoes.add("-");
		opcoes.add("*");
		opcoes.add("/");

		while (true){
			count += 1;

			// Número máximo de erros
			if (count == 15){
				return "15";
			}

			// Mostrando ao usuário
			System.out.println();
			System.out.println("Opções:");
			System.out.println("    0 - Sair");
			System.out.println("    + - Soma");
			System.out.println("    - - Subtracao");
			System.out.println("    * - Multiplicacao");
			System.out.println("    / - Divisao");

			// Obtendo escolha do usuário
			System.out.println();
			System.out.print(": ");
			Scanner scn = new Scanner(System.in);
			String opc = scn.nextLine();

			// Opção inválida
			if (! opcoes.contains(opc)){
			
				System.out.println();
				System.out.println("Opção inválida");
			}

			// Opção válida
			else{
				return opc;
			}
		}
	}

	public static void main(String[] args){
		String menu = Menu();

		// Selecionando opções
		switch (menu){
			// Erro
			case "15":
				System.out.println();
				System.out.println("Desisto....");
				
				break;

			// Soma
			case "+":
				String msgsum;
				Scanner nsum = new Scanner(System.in);

				// Obtendo numeros
				System.out.println();
				System.out.print("Valor de A: ");
				float nsuma = nsum.nextFloat();
				System.out.print("Valor de B: ");
				float nsumb = nsum.nextFloat();

				// Executando operação
				Operacoes soma = new Operacoes(nsuma, nsumb);

				// Montando mensagem
				msgsum = "A + B = " + nsuma + " + " + nsumb;
				msgsum += " = " + soma.Soma();

				// Mostrando ao usuário
				System.out.println();
				System.out.println(msgsum);

				// Saindo
				break;

			case "-":
				ArrayList<Float> sub = new ArrayList<Float>();
				String msgsub1;
				String msgsub2;

				// Obtendo numeros
				Scanner nsub = new Scanner(System.in);
				System.out.println();
				System.out.print("Valor de A: ");
				float nsuba = nsub.nextFloat();
				System.out.print("Valor de B: ");
				float nsubb = nsub.nextFloat();

				// Executando operações
				Operacoes op = new Operacoes(nsuba, nsubb);
				sub = op.Subtracao();

				// Montando mensagens
				msgsub1 = "A - B = " + nsuba + " - " + nsubb;
				msgsub1 += " = " + sub.get(0);
				msgsub2 = "B - A = " + nsubb + " - " + nsuba;
				msgsub2 += " = " + sub.get(1);

				// Mostrando ao usuário
				System.out.println();
				System.out.println(msgsub1);
				System.out.println(msgsub2);

				// Saindo
				break;

			case "*":
				String msgmul;
				Scanner nmul = new Scanner(System.in);

				// Obtendo numeros
				System.out.println();
				System.out.print("Valor de A: ");
				float nmula = nmul.nextFloat();
				System.out.print("Valor de B: ");
				float nmulb = nmul.nextFloat();

				// Executando operações
				Operacoes multi = new Operacoes(nmula, nmulb);

				// Montando mensagem
				msgmul = "A * B = " + nmula + " * " + nmulb;
				msgmul += " = " + multi.Multiplicacao();

				// Mostrando ao usuário
				System.out.println();
				System.out.println(msgmul);

				// Saindo
				break;

			case "/":
				ArrayList<Float> div = new ArrayList<Float>();
				String msgdiv1;
				String msgdiv2;

				// Obtendo numeros
				Scanner ndiv = new Scanner(System.in);
				System.out.println();
				System.out.print("Valor de A: ");
				float ndiva = ndiv.nextFloat();
				System.out.print("Valor de B: ");
				float ndivb = ndiv.nextFloat();

				// Executando operações
				Operacoes divs = new Operacoes(ndiva, ndivb);
				div = divs.Divisao();

				// Montando mensagens
				msgdiv1 = "A / B = " + ndiva + " / " + ndivb;
				msgdiv1 += " = " + div.get(1);
				msgdiv2 = "B / A = " + ndivb + " / " + ndiva;
				msgdiv2 += " = " + div.get(0);

				// Mostrando ao usuário
				System.out.println();
				System.out.println(msgdiv1);
				System.out.println(msgdiv2);

				// Saindo
				break;
		}
	}
}

// ------------------------------------------------------------------ //

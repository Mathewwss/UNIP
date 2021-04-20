// ----------------------------- PACKAGE ---------------------------- //

// No meu ambiente so executou comentando a linha do package.
// Tente executar sem comentar a linha do package

// package br.unip.brasilia.money;

// ------------------------------------------------------------------ //

// ----------------------------- IMPORTS ---------------------------- //

import java.util.Scanner;
import java.util.ArrayList;

// ------------------------------------------------------------------ //

// ----------------------------- CLASSES ---------------------------- //

public class Programa{
	public static int menu(){
		// Criando array com todas as opções
		ArrayList escolha = new ArrayList();

		// Adicionando opções
		escolha.add(0);
		escolha.add(1);
		escolha.add(2);

		// Verificando opção
		while (true){
			System.out.println();
			System.out.println("Opções:");
			System.out.println("    0 - Sair.");
			System.out.println("    1 - Adicionar uma conta.");
			System.out.println("    2 - Dados sobre uma conta.");

			// Obtendo opção do usuário
			System.out.print(": ");
			Scanner scn = new Scanner(System.in);
			int opcs = scn.nextInt();

			// Opção é válida?
			if (escolha.contains(opcs)){
				return opcs;
			}

			// Não!
			System.out.println("Opção inválida!");
		}
	}

	public static void main(String[] args){
		// Titulares, números e limites
		ArrayList<String> tcontas = new ArrayList<String>();
		ArrayList ncontas = new ArrayList();
		ArrayList lcontas = new ArrayList();

		while (true){
			// Obtendo opção
			int opcs = menu();

			// Verificando numero de contas criadas
			if (opcs == 1){
				if (tcontas.size() == 25){
					System.out.println();
					System.out.println("Não pode inserir mais contas.");
					opcs = -1;
				}
			}

			// Criar contas
			if (opcs == 1){
				Conta cnt = new Conta();

				while (true){
					char letra;
					String c2s;
					boolean space = false;
					String titular_temp = "";

					// Nome do titular
					System.out.println();
					System.out.print("Nome de titular, sem abreviar: ");

					// Pegando dados do usuário
					Scanner scn = new Scanner(System.in);
					String titular = scn.nextLine();

					// Title case
					for (int idx = 0; idx < titular.length(); idx++){
						letra = titular.charAt(idx);

						// Upper case primeira letra do primeiro nome
						if (idx == 0){
							c2s = String.valueOf(letra);
							titular_temp += c2s.toUpperCase();
						}

						// Upper case primeira letra de todos os nomes
						else if (letra == ' '){
							space = true;
							c2s = String.valueOf(letra);
							titular_temp += c2s.toUpperCase();
						}

						// Tratando espaços
						else if (space == true){
							c2s = String.valueOf(letra);
							titular_temp += c2s.toUpperCase();
							space = false;
						}

						// Outros caracteres
						else {
							c2s = String.valueOf(letra);
							titular_temp += c2s;
						}
					}

					// Alterando nome do titular
					titular = titular_temp;

					// Pessoa está cadastrada
					if (tcontas.contains(titular)){
						System.out.println();
						System.out.println("Essa pessoa ja existe!");

					}

					// Cadastrando nova pessoa
					else {
						cnt.titular = titular;
						break;
					}
				}

				while (true){
					// Número da conta
					System.out.print("Numero da conta: ");

					// Pegando dados do usuário
					Scanner scn = new Scanner(System.in);
					int num = scn.nextInt();

					// Verificando se ja existe
					if (ncontas.contains(num)){
						System.out.println();
						System.out.println("Este numero de conta ja existe!");

					}

					// Adicionando nova conta
					else {
						cnt.numconta = num;
						break;
					}
				}

				// Limite da conta
				System.out.print("Qual o limite da conta: ");

				// Pegando informação do usuário
				Scanner scn = new Scanner(System.in);
				int lmt = scn.nextInt();

				// Adicionando limite a conta
				cnt.limite = lmt;

				// Adicionando dados aos arrays
				lcontas.add(cnt.limite);
				tcontas.add(cnt.titular);
				ncontas.add(cnt.numconta);

				// Mostrando passos ao usuário
				System.out.println();
				System.out.println("Conta adicionada!");
			}

			// Informções sobre conta
			else if (opcs == 2){
				System.out.println();
				System.out.print("Digite o numero da conta: ");

				// Pegando dados do usuário
				Scanner scn = new Scanner(System.in);
				int ncon = scn.nextInt();

				// Conta existe
				if (ncontas.contains(ncon)){
					int index = ncontas.indexOf(ncon);
					String msgtitular;
					String msgnumcon;
					String msglimcon;

					// Pegando titular da conta
					msgtitular = "Titular: ";
					msgtitular += tcontas.get(index);
					
					// Pegando numero da conta
					msgnumcon = "Número da Conta: ";
					msgnumcon += ncontas.get(index);

					// Pegando limite da conta
					msglimcon = "Limite da Conta: R$ ";
					msglimcon += lcontas.get(index);

					// Mostrando ao usuário
					System.out.println();
					System.out.println(msgtitular);
					System.out.println(msgnumcon);
					System.out.println(msglimcon);
				}

				// Conta não existe
				else {
					System.out.println();
					System.out.println("Está conta não existe.");
				}
			}

			// Sair do programa
			else if (opcs == 0){
				break;
			}
		}
	}
}

// ------------------------------------------------------------------ //

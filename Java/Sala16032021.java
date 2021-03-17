// Objetivo: Verificar se numeros são divisíveis por (5, 10, 15).
// Entrada: Número entre 1 e 10 (incluindo 1 e 10).
// Saída: Número inserido até 100.

import java.util.Scanner;

public class Sala16032021{
	public static void main(String[] args){
		// Definindo variáveis
		int num;

		System.out.println();
		System.out.print("Escolha um entre 1 e 10: ");

		// Pegando informção do usuário
		Scanner numin = new Scanner(System.in);
		num = numin.nextInt();

		System.out.println();

		if (num >= 1 && num <= 10){
		
			// num -> 100
			for (num = num; num < 101; num++){

				// Verificando se é multiplo de 15
				if (num % 15 == 0){
					System.out.print("M15, ");
				}

				// Verificando se é multiplo de 10
				else if (num % 10 == 0){
					// Verificando se é 100
					if (num == 100){
						System.out.print("M10.");
						System.out.println();
					}

					else {
						System.out.print("M10, ");
					}
				}

				// Verificando se é multiplo de 5
				else if (num % 5 == 0){
					System.out.print("M5, ");
				}

				else {
					System.out.print(num + ", ");
				}
			}
		}

		// Mostrando erro ao usuário
		else{
			if (num > 10){
				System.out.println("Este número é maior que 10.");
				System.out.println("Número inválido!");
			
			}

			else {
				System.out.println("Este número é menor que 1.");
				System.out.println("Número inválido!");
			
			}
		}

		System.out.println();
	}
}

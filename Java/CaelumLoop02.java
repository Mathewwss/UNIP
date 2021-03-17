// Objetivo: Somar numeros de 1 até 1000.
// Entrada: N/A
// Saída: Resultado da soma.

public class CaelumLoop02{
	public static void main(String[] args){
		// Definindo varieis
		int soma;
		int count;
		String msg;
	
		System.out.println();
		System.out.println("# --- Questão 2 --- #");
		System.out.println();

		// For - Somando números de 1 até 1000
		soma = 0;
		msg = "A soma dos números de 1 até 1000 é: ";
		for (int num = 0; num < 1001; num++){ // num+=4 ou num-=4
			soma = soma + num;
		}

		System.out.println(msg + soma);

		// While - Somando números de 1 até 1000
		count = 1;
		soma = 0;
		while (count < 1001){
			soma = soma + count;
			count = count + 1;
		}

		System.out.println();
		System.out.println(msg + soma);

		System.out.println();
		System.out.println("# ----------------- #");
	}
}

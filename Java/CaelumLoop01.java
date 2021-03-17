// Objetivo: Contagem (150-300)
// Entrada: N/A
// Saída: 1 a 300

public class CaelumLoop01{
	public static void main(String[] args){
		// Definindo varieis
		int count;
		int num;
	
		System.out.println();
		System.out.println("# --- Questão 1 --- #");
		System.out.println();

		// For - Mostrando números de 150 a 300
		for (num = 150; num < 301; num++){
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println();

		// While - Mostrando números de 150 a 300
		count = 149;
		while (count < 300){
			count = count + 1; // Pré incremento vs Incremento
			System.out.print(count + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("# ----------------- #");
	}
}

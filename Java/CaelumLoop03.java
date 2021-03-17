// Objetivo: Identifica multiplos de 3.
// Entrada: N/A
// Saída: Mostrar multiplos de 3.

public class CaelumLoop01{
	public static void main(String[] args){
		// Definindo varieis
		int num;
		int res;

		System.out.println();
		System.out.println("# --- Questão 3 --- #");
		System.out.println();
	
		// For - Múltiplos de 3 de 1 até 100
		for (num = 1; num < 101; num++){
			if (num % 3 == 0){
				if (num == 99){
					System.out.print(num + ".");
				}

				else{
					System.out.print(num + ", ");
				}
			}
		}

		System.out.println();
		System.out.println();

		// While - Somando números de 1 até 1000
		num = 1;
		res = 0;
		while (num < 101){
			res = num % 3;

			if (res == 0){
				if (num == 99){
					System.out.print(num + ".");
				}

				else{
					System.out.print(num + ", ");
				}
			}

			num = num + 1;
		}

		System.out.println();
		System.out.println();
		System.out.println("# ----------------- #");
	}
}

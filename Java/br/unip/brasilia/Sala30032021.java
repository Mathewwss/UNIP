// Objetivo: Apresentar o básico de collections.
// Entrada: N/A
// Saída: Algumas saídas interessantes.

// ----------------------------- PACKAGE ---------------------------- //

package br.unip.brasilia;

// ------------------------------------------------------------------ //

// ----------------------------- IMPORTS ---------------------------- //

import java.util.ArrayList;
import java.util.Collections;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.LinkedList;

// ------------------------------------------------------------------ //

// ----------------------------- CLASSES ---------------------------- //

public class Executora{
	public static void main(String[] args){
		// Criando ArrayList de Strings
		ArrayList<String> al = new ArrayList<>();

		// Mostrando lista vazia
		System.out.println();
		System.out.print("Lista inicial:");
		System.out.print(al);

		// Adicionando elementos à lista
		al.add("Daniel");
		al.add("Joana");
		al.add("Luiza");
		al.add("Luiza");
		al.add("André");

		// Mostrando lista
		System.out.println();
		System.out.println();
		System.out.println("Inserindo dados....");
		System.out.println();
		System.out.println(al);

		// Identificando elementos
		System.out.println();
		System.out.println("Array al na posição 0: " + al.get(0));
		System.out.println("Array al na posição 1: " + al.get(1));
		System.out.println("Array al na posição 2: " + al.get(2));
		System.out.println("Array al na posição 3: " + al.get(3));
		System.out.println("Array al na posição 4: " + al.get(4));

		// Atualizando elementos
		al.set(0, "Lucas");
		al.set(3, "Luiz");
		al.set(1, "Paola");
		al.set(4, "Natanael");

		// Mostrando novos dados
		System.out.println();
		System.out.println("Modificando dados....");
		System.out.println();
		System.out.println("Array al na posição 0: " + al.get(0));
		System.out.println("Array al na posição 1: " + al.get(1));
		System.out.println("Array al na posição 2: " + al.get(2));
		System.out.println("Array al na posição 3: " + al.get(3));
		System.out.println("Array al na posição 4: " + al.get(4));

		// Removendo dados
		al.remove(0);
		al.remove(2);

		// Mostrando novos dados
		System.out.println();
		System.out.println("Removendo dados....");
		System.out.println("Removendo Lucas e Luiza....");
		System.out.println();
		System.out.println("Array al na posição 0: " + al.get(0));
		System.out.println("Array al na posição 1: " + al.get(1));
		System.out.println("Array al na posição 2: " + al.get(2));

		// Ordenando dados de A até Z
		Collections.sort(al);

		// Mostrando dados ordenados de A até Z
		System.out.println();
		System.out.println("Ordenando dados de A até Z....");
		System.out.println();
		System.out.println(al);

		// Ordenando dados de Z até A
		Collections.reverse(al);

		// Mostrando dados ordenados de Z até A
		System.out.println();
		System.out.println("Ordenando dados de Z até A....");
		System.out.println();
		System.out.println(al);

		// Mostrando quantidade de elementos na lista
		System.out.println();
		System.out.println("Número de elementos em al: " + al.size());

		// Loop for
		System.out.println();
		System.out.println("Listando todos os elementos....");
		System.out.println();
		for (int p = 0; p < al.size(); p++){
			System.out.println(al.get(p));
		}

		// Mostrando último elemento
		System.out.println();
		System.out.println("Listando último elemento....");
		System.out.println();
		System.out.println(al.get(al.size() - 1));

	}
}

// ------------------------------------------------------------------ //

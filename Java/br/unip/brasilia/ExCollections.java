// ----------------------------- PACKAGE ---------------------------- //

package br.unip.brailia;

// ------------------------------------------------------------------ //

// ----------------------------- IMPORTS ---------------------------- //

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

// ------------------------------------------------------------------ //

// ----------------------------- CLASSES ---------------------------- //

public class T{
	public static void main(String[] args){
		// Mostrando passos
		System.out.println();
		System.out.println("Usando LinkedList:");
		System.out.println("    Criando LinkedList...");
		System.out.println("    Adicionando elementos...");
		
		// Criando LinkedList
		LinkedList<String> phones = new LinkedList<String>();

		// Adicionando dados
		phones.add("Samsung");
		phones.add("Apple");
		phones.add("HTC");
		phones.add("Xiaomi");
		phones.add("Motorola");
		phones.add("LG");

		// Mostrando LinkedList
		System.out.println();
		System.out.println("    " + phones);

		// Mostrando passos
		System.out.println();
		System.out.println("    Alterando elementos...");

		// Alterando elementos
		phones.set(0, "Nokia");
		phones.set(4, "Siemens");

		// Mostrando LinkedList
		System.out.println();
		System.out.println("    " + phones);
		
		// Mostrando passos
		System.out.println();
		System.out.println("    Removendo elementos...");

		// Removendo elementos
		phones.remove(0);
		phones.remove(2);

		// Mostrando LinkedList
		System.out.println();
		System.out.println("    " + phones);

		// Mostrando passos
		System.out.println();
		System.out.println("Usando HashSet:");
		System.out.println("    Criando HashSet...");
		System.out.println("    Adicionando elementos...");

		// Criando HashSet
		HashSet<String> colors = new HashSet<String>();

		// Adicionando eleemntos ao HashSet
		colors.add("Verde");
		colors.add("Azul");
		colors.add("Vermelho");
		colors.add("Verde");
		colors.add("Amarelo");
		colors.add("Preto");

		// Mostrando HashSet
		System.out.println();
		System.out.println("    " + colors);

		// Mostrando passos
		System.out.println();
		System.out.println("    Alterando elementos....");

		// Trocando elementos
		colors.remove("Azul");
		colors.remove("Verde");
		colors.add("Branco");
		colors.add("Ciano");

		// Mostrando HashSet
		System.out.println();
		System.out.println("    " + colors);

		// Mostrando passos
		System.out.println();
		System.out.println("    Removendo elementos....");

		// Removendo elementos
		colors.remove("Branco");
		colors.remove("Vermelho");

		// Mostrando HashSet
		System.out.println();
		System.out.println("    " + colors);

		// Mostrando passos
		System.out.println();
		System.out.println("Usando LinkedHashSet:");
		System.out.println("    Criando LinkedHashSet...");
		System.out.println("    Adicionando elementos...");

		// Criando LinkedHashSet
		LinkedHashSet<String> countries = new LinkedHashSet<String>();
		LinkedHashSet<String> temp = new LinkedHashSet<String>();

		// Adicionando elementos
		countries.add("França");
		countries.add("Cuba");
		countries.add("México");
		countries.add("Brasil");
		countries.add("Argentina");
		countries.add("Honduras");

		// Mostrando LinkedHashSet
		System.out.println();
		System.out.println("    " + countries);

		// Mostrandos passos
		System.out.println();
		System.out.println("    Alterando elementos..." );

		// Alterando dados usando lista temporária
		for (String country : countries){
				if (country == "França"){
					temp.add("Inglaterra");
				}
				else if (country == "Brasil"){
					temp.add("Peru");
				}
				else{
					temp.add(country);
				}
		}

		// Apagando lista original
		countries.clear();

		// Adicionando elementos
		for (String tmp : temp){
			countries.add(tmp);
		}

		// Apagando lista temporária
		temp.clear();

		// Mostrando LinkedHashSet
		System.out.println();
		System.out.println("    " + countries);

		// Mostrando passos
		System.out.println();
		System.out.println("    Removendo elementos..." );

		// Removendo elementos
		countries.remove("México");
		countries.remove("Honduras");

		// Mostrando LinkedHashSet
		System.out.println();
		System.out.println("    " + countries);

		// Mostrando passos
		System.out.println();
		System.out.println("Usando HashMap:");
		System.out.println("    Criando HashMap...");
		System.out.println("    Adicionando elementos...");

		// Criando HashMap
		HashMap<String, String> cities = new HashMap<String, String>();

		// Adicionando elementos
		cities.put("SP", "São Paulo");
		cities.put("MG", "Minas Gerais");
		cities.put("RJ", "Rio de Janeiro");
		cities.put("AC", "Acre");
		cities.put("AL", "Alagoas");
		cities.put("SC", "Santa Catarina");

		// Mostrando HashMap
		System.out.println();
		System.out.println("    " + cities);

		// Mostrando passos
		System.out.println();
		System.out.println("    Alterando elementos...");

		// Alterando valores
		cities.put("SP", "São Petersburgo");
		cities.put("AL", "Alasca");

		// Mostrando HashMap
		System.out.println();
		System.out.println("    " + cities);

		// Mostrando passos
		System.out.println();
		System.out.println("    Removendo elementos...");

		// Removendo pares (chave/valor)
		cities.remove("SP", cities.get("SP"));
		cities.remove("AL", "Alasca");

		// Mostrando HashMap
		System.out.println();
		System.out.println("    " + cities);

		// Mostrando passos
		System.out.println();
		System.out.println("Usando LinkedHashMap:");
		System.out.println("    Criando LinkedHashMap...");
		System.out.println("    Adicionando elementos...");

		// Criando LinkedHashMap
		LinkedHashMap<String, String> mths = new LinkedHashMap<String, String>();

		mths.put("JN", "Junho");
		mths.put("JA", "Janeiro");
		mths.put("MR", "Março");
		mths.put("DZ", "Dezembro");
		mths.put("NV", "Novembro");
		mths.put("OT", "Outubro");

		System.out.println();
		System.out.println(mths);
		
		// Mostrando passos
		System.out.println();
		System.out.println("    Alterando elementos...");

		mths.put("JN", "Janeiro");
		mths.put("JA", "Julho");

		System.out.println();
		System.out.println(mths);

		// Mostrando passos
		System.out.println();
		System.out.println("    Removendo elementos...");

		mths.remove("DZ", mths.get("DZ"));
		mths.remove("OT", mths.get("OT"));

		System.out.println();
		System.out.println(mths);
	
	}
}

// ------------------------------------------------------------------ //

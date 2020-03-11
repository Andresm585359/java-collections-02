package br.fai.collection02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.Start();
	}
	
	private Scanner scan = new Scanner(System.in);
	
	private Map<String , String> mapa = new HashMap<String, String>();
	
	private void Start() {
	

		String chave = "lala";
		String valor = "lala";
		String key = "lala";
		while(key != "10") 
		{
			System.out.println("\n\n\nInsira a opção: \n1- Adicionar nova cidade: \n2- Checar cidade: \n3- Listar cidades: \n10- Sair:\n");
			key =  lerValor();
			switch (key) {
			case "1":
				System.out.println("Add - Insira a chave: ");
				chave = lerValor();
				System.out.println("Add - Insira o valor: ");
				valor = lerValor();	
				
				if(chave != null && valor != null ) {
					
					adicionarItensNoMapa(chave, valor);
				}
				else
				{
					System.out.println("Nada foi adicionado.");
				}
				break;
	
			case "2":
				System.out.println("Search - Insira a chave");
				chave = lerValor();
				exibirValorDoMapa(chave);
				break;
				
			case "3":
				iterarMapa();
				break;
				
			default:
				System.out.println("Numero invalido!");
				break;
			}
		}
		adicionarItensNoMapa(chave, valor);
		exibirValorDoMapa(chave);
		
	}

	private String lerValor() {
		String valor = null;
		try {
		while(valor == null || valor.isEmpty()) {
		valor = scan.next();
		}
		}
		catch (Exception e)
		{
			System.out.println("Ocorreu uma exceção");
		}
		finally {
			System.out.println("\n.....\n\n");
		}
		return valor;
	}
	
	
	private void exibirValorDoMapa(String chave) {
		
		if(mapa.get(chave)!= null || mapa.get(chave).isEmpty()) {
			System.out.println("O valor da chave "+ chave + " é:  " + mapa.get(chave));
		}
		else {
			System.out.println("O valor inserido não corresponde a nenhuma chave conhecida.");
		}
		
	}

	private void adicionarItensNoMapa(String chave, String valor) {
		
		mapa.put(chave, valor);
	}

	private void iterarMapa() {
		for(String chave: mapa.keySet()) {
			System.out.println("Chave: "+ chave + "   Valor: " + mapa.get(chave));
		}
	}
	
	
}

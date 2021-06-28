package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.univas.node.Arvore;
import br.edu.univas.node.No;
import br.edu.univas.show.Viewer;

public class StartApp {
	
	Scanner scanner = new Scanner(System.in);
	List<String> nomes = new ArrayList<>();
	List<Integer> quantidades = new ArrayList<>();
	List<Float> valores = new ArrayList<>();
	List<String> ultimasFolhas = new ArrayList<>();
	Arvore arvore = new Arvore();
	Viewer menu = new Viewer();
	
	public static void main(String[] args) {
		StartApp nonStatic = new StartApp();
		nonStatic.manager();
	}
	
	public void manager() {
		menu.bemVindo();
		transmiteValores();
		scanner.close();
	}
	
	public void transmiteValores() {
		for(int i = 0; i < 14;i++) {
			String nome = readString();
			float valor = readFloat();
			Integer quantidade = readInteger();
			nomes.add(nome);
			valores.add(valor);
			quantidades.add(quantidade);
			
			menu.dadosProduto(nome, valor, quantidade);
		}
		
		arvoreDaBike();
	}
	
	public void arvoreDaBike() {
		
		//Nível 4
		No camara = new No(valores.get(13), nomes.get(13), quantidades.get(13), null, null, null);
		No cassette = new No(valores.get(12), nomes.get(12), quantidades.get(12), null, null, null);
		No pedivela = new No(valores.get(11), nomes.get(11), quantidades.get(11), null, null, null);
		
		//Nível 3
		No pneu = new No(valores.get(10), nomes.get(10), quantidades.get(10), camara, null, null);
		No aro = new No(valores.get(9), nomes.get(9), quantidades.get(9), cassette, null, null);
		No banco = new No(valores.get(8), nomes.get(8), quantidades.get(8), null, null, null);
		No correia = new No(valores.get(7), nomes.get(7), quantidades.get(7), null, null, null);
		No pedal = new No(valores.get(6), nomes.get(6), quantidades.get(6), pedivela, null, null);
		No cambio = new No(valores.get(5), nomes.get(5), quantidades.get(5), null, null, null);
		No freio = new No(valores.get(4), nomes.get(4), quantidades.get(4), null, null, null);
		
		//Nível 2
		No roda = new No(valores.get(3), nomes.get(3), quantidades.get(3), aro, pneu, null);
		No chassi = new No(valores.get(2), nomes.get(2), quantidades.get(2), pedal, correia, banco);
		No guidao = new No(valores.get(1), nomes.get(1), quantidades.get(1), freio, cambio, null);
		
		//Nível 1
		No bike = new No(valores.get(0), nomes.get(0), quantidades.get(0), guidao, chassi, roda);
		
		arvore.somarTotal(bike);
		arvore.imprimeTotal();
	}
	
	//leitores
	
	public Integer readInteger() {
		Integer value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}
	
	public Float readFloat() {
		float value = scanner.nextFloat();
		scanner.nextLine();
		return value;
	}
	
	public String readString() {
		return scanner.nextLine();
	}

}

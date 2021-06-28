package br.edu.univas.show;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.node.Arvore;

public class Viewer {
	
	
	public void bemVindo() {
		System.out.println("=======================================Seja bem-vindo à Árvore Bike!======================================\n\nCole o script abaixo:\n");
	}
	
	public void dadosProduto(String nome, float valorUnitario, Integer quantidade) {
		System.out.println("Produto/Sub-Produto cadastrado!\nNome: " + nome + "\nValor unitário: R$" + valorUnitario + "\nQuantidade: " + quantidade + "\n");
	}
	
	public void custoTotalBike(float valorTotal, List<String> s) {
		System.out.println("O valor total da bicicleta é de R$" + valorTotal + "\n\nAs folhas da árvore são: " + s);
		System.out.println("\n\n======================================Obrigado pela utilização!=========================================");
	}

}

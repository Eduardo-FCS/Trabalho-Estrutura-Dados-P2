package br.edu.univas.node;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.main.StartApp;
import br.edu.univas.node.No;
import br.edu.univas.show.Viewer;

public class Arvore {

	public float valorTotal;
	public List<String> ultimasFolhas = new ArrayList<>();
	Viewer show = new Viewer();

	public void somarTotal(No n) {

		valorTotal += (n.valorProduto * n.quantidadeProduto);

		if (n.direita == null && n.esquerda == null && n.centro == null) {
			ultimasFolhas.add(n.nomeProduto);
		}

		if (n.esquerda != null) {
			somarTotal(n.esquerda);
		}
		if (n.centro != null) {
			somarTotal(n.centro);
		}
		if (n.direita != null) {
			somarTotal(n.direita);
		}

	}

	public void imprimeTotal() {
		 show.custoTotalBike(valorTotal, ultimasFolhas);
	}
	

}

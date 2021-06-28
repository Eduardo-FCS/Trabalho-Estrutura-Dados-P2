package br.edu.univas.node;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.node.No;

public class No {
	
	public String nomeProduto;
	public Integer quantidadeProduto;
	public float valorProduto;
	
	No direita;
	No esquerda;
	No centro;
	
	public No(float valorProduto, String nomeProduto, Integer quantidadeProduto, No esquerda, No centro, No direita) {
		this.valorProduto = valorProduto;
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.esquerda = esquerda;
		this.direita = direita;
		this.centro = centro;
	}
	
	
}

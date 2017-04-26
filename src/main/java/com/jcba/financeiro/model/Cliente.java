package com.jcba.financeiro.model;

import java.util.Scanner;

public class Cliente {
	Integer codigo;
	String nome;

	//Quando se tem um contrutor sem ser vazio, precisa criar um vazio, para poder diferenciar
	public Cliente() {

	}

	// contrutor com o parâmetro código
	public Cliente(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um nome: " );
		String nome = input.nextLine();

		System.out.println("Seu nome é:" + nome);
		Cliente c1 = new Cliente();
		c1.setNome(nome);
	}
}

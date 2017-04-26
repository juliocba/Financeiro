package com.jcba.financeiro.model;

import javax.persistence.Persistence;

public class Teste {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("FinanceiroPU");
	}

}

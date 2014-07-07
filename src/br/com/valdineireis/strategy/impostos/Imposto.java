package br.com.valdineireis.strategy.impostos;

import br.com.valdineireis.strategy.modelo.Orcamento;

public interface Imposto {

	double calcula(Orcamento orcamento);
	
	String getTipo();
}

package br.com.valdineireis.strategy.impostos.impl;

import br.com.valdineireis.strategy.impostos.Imposto;
import br.com.valdineireis.strategy.modelo.Orcamento;

public class ISS implements Imposto {
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public String getTipo() {
		return "ISS";
	}
}

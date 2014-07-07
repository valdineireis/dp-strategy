package br.com.valdineireis.strategy.impostos.impl;

import br.com.valdineireis.strategy.impostos.Imposto;
import br.com.valdineireis.strategy.modelo.Orcamento;

public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public String getTipo() {
		return "ICMS";
	}
}

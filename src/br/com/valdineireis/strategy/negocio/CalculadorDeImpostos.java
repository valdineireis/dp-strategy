package br.com.valdineireis.strategy.negocio;

import br.com.valdineireis.strategy.impostos.Imposto;
import br.com.valdineireis.strategy.modelo.Orcamento;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double valor = impostoQualquer.calcula(orcamento);
		System.out.println("Valor do "+ impostoQualquer.getTipo() + ": " + valor);
	}
}

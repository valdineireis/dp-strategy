package br.com.valdineireis.strategy.impostos.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.valdineireis.strategy.impostos.Imposto;
import br.com.valdineireis.strategy.modelo.Orcamento;

public class CalculaImpostosTest {

	private Imposto iss;
	private Imposto icms;
	private Orcamento orcamento;

	@Before
	public void init() {
		iss = new ISS();
		icms = new ICMS();
		
		orcamento = new Orcamento(500.0);
	}
	
	@Test
	public void deveCalcularISS() {
		assertEquals("ISS", iss.getTipo());
		assertEquals(30.0, iss.calcula(orcamento), 0);
	}
	
	@Test
	public void deveCalcularICMS() {
		assertEquals("ICMS", icms.getTipo());
		assertEquals(50.0, icms.calcula(orcamento), 0);
	}

}

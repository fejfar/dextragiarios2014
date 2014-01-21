package com.dextra.dextragiarios2014.test.atividade6;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.dextra.dextragiarios2014.comum.Banco;
import com.dextra.dextragiarios2014.comum.JPAUtils;
import com.dextra.dextragiarios2014.comum.JPA_DB_Utils;

public class Atividade6Test {

	@BeforeClass
	public static void setUp() throws Exception {
		JPA_DB_Utils.start();
	}

	@Test
	public void testIdBanco() {
		
		List<Banco> bancos = new ArrayList<Banco>();

		bancos.add(criaBanco("A"));
		bancos.add(criaBanco("C"));
		bancos.add(criaBanco("E"));
		bancos.add(criaBanco("G"));
		
		System.out.println("Bancos");
		for (Banco b : bancos)
			System.out.println(b.getId());
		
	}
	
	private Banco criaBanco(String nome) {
		return (Banco) JPAUtils.merge(new Banco(nome));
	}

}

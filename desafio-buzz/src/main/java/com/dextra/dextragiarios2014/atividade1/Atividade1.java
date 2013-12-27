package com.dextra.dextragiarios2014.atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Atividade1 {

	public List<String> encontrarPessoaPorNome(Map<Long, String> pessoas, String nome) {
		List<String> pessoasEncontradas = new ArrayList<String>();
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i) == nome)
				pessoasEncontradas.add(nome);
		}
		return pessoasEncontradas;
	}

}

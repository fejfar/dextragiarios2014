package com.dextra.dextragiarios2014.atividade10;

import java.util.Calendar;

/**
 * Dizem que o rei do Rock'n'Roll, após a fama, engordava um número do cinto a
 * cada ano, e que este número coincidia com a sua idade. Ele nasceu em 1930.
 * Este programa serve para saber qual seria o tamanho do cinto dele se ele
 * estivesse vivo este ano.
 */
public class CintoDoElvis {
	public static final CintoDoElvis INSTANCIA = new CintoDoElvis();
	private final int tamanhoDoCinto;
	private static final int ANO_ATUAL = Calendar.getInstance().get(
			Calendar.YEAR);

	private CintoDoElvis() {
		tamanhoDoCinto = ANO_ATUAL - 1930;
	}

	public int getTamanhoDoCinto() {
		return tamanhoDoCinto;
	}
}

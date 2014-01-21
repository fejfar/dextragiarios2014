package com.dextra.dextragiarios2014.atividade4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private Double saldo;
	
	private Conta() { }
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return this.saldo;
	}

}

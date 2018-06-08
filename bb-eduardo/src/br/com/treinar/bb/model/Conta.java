package br.com.treinar.bb.model;

public class Conta {
	public int numero;
	public double saldo;
	public Cliente cliente;

	public double consultarSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		boolean saqueSucedido;
		if (saldo > valor) {
			saldo -= valor;
			saqueSucedido = true;
		} else {
			saqueSucedido = false;
		}
		return saqueSucedido;
	}
}
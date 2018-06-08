package br.com.treinar.aula;

public class Atividade2 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1 = new Conta();
		c1.cliente = new Cliente();
		c1.cliente.nome = "Eduardo Campos";
		c1.cliente.cpf = "12451905638";
		c1.numero = 1234343;
		c1.saldo = 230.00;
		System.out.println("Bem-vindo, " + c1.cliente.nome);
		boolean sacou = c1.sacar(230);
		if (sacou) {
			System.out.println("Saque sucedido");
		} else {
			System.out.println("Você não tem saldo suficiente");
		}
		double saldoAtual = c1.consultarSaldo();
		System.out.println("Seu novo saldo é de: " + saldoAtual);
		c1.depositar(500);
			System.out.println("Valor depositado.\nSeu novo saldo é de: " + c1.saldo);
			
		}
	}


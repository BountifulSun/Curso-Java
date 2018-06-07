package br.com.treinar.aula;

public class Atividade2 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.cliente = new Cliente();
		c1.cliente.nome = "Gleidson Moura";
		c1.cliente.cpf = "12345678900";
		c1.numero = 12345678;
		c1.saldo = 129.90;
		Conta c2 = c1;
		System.out.println("Bem-vindo, " + c2.cliente.nome + "\nSeu saldo é: " + c2.saldo);
		c1 = new Conta() ;
		c1.cliente = new Cliente();
		c1.cliente.nome = "Eduardo Campos";
		c1.cliente.cpf = "12451905638";
		c1.numero = 1234343;
		c1.saldo = 230.00;
		System.out.println("Bem-vindo, " + c1.cliente.nome + "\nSeu saldo é: " + c1.saldo);
	}

}

package br.com.treinar.aula;

public class Atividade2 {
public static void main(String[] args) {
	Conta conta = new Conta();
	conta.cliente = new Cliente();
	conta.cliente.nome = "Gleidson Moura";
	conta.cliente.cpf = "12345678900";
	conta.numero = 12345678;
	conta.saldo = 129.90;
	System.out.println("Bem-vindo, " + conta.cliente.nome + "\nSeu saldo é: " + conta.saldo);
}
	
}

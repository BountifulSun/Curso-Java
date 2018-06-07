package br.com.treinar.aula;

public class TestePessoa {
	public static void main(String[] args) {

		Pessoa cliente = new Pessoa();
		cliente.nome = "Eduardo";
		
		System.out.println("Cliente = " + cliente.nome);
		Pessoa funcionario = new Pessoa();
		funcionario.nome = "Jorge";

		Pessoa gerente = new Pessoa();
		gerente.nome = "Reginaldo";
		System.out.println("Funcionário = " + funcionario.nome);
		System.out.println("Gerente = " + gerente.nome);
		
		System.out.println("\nFuncionário Jorge demitido \nFuncionário Eduardo contratado\n");
		funcionario = cliente;
		System.out.println("Funcionario = " + funcionario.nome);
		System.out.println("Cliente = " + cliente.nome);
		System.out.println("Gerente = " + gerente.nome);
		
		
		System.out.println("\nGerente Reginaldo demitido \nGerente Eduardo contratado\n");
		gerente = funcionario;
		System.out.println("Gerente = " + gerente.nome);
		System.out.println("Cliente = " + cliente.nome);
		System.out.println("Funcionário = " + funcionario.nome);
		
		System.out.println("\nGerente Eduardo demitido \nGerente Robson contratado\n");
		
		gerente = new Pessoa() ;
		gerente.nome = "Robson";
		System.out.println("Gerente = " + gerente.nome);
		System.out.println("Cliente = " + cliente.nome);
		System.out.println("Funcionário = " + funcionario.nome);
	}

}

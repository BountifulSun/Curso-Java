package br.com.treinar.bb;

import java.util.Scanner;

import br.com.treinar.bb.model.Conta;

public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		int opcao;
		do {
			imprimirMenu();
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				criarConta();
				System.out.println("Criar conta: ");// TODO CRIAR CONTA
				break;
			case 2:
				System.out.println("Consultar saldo: ");// TODO CONSULTAR SALDO
				break;
			case 3:
				System.out.println("Depositar: ");// TODO DEPOSITAR
				break;
			case 4:
				System.out.println("Sacar: ");// TODO SACAR
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
			System.out.println(opcao);
		} while (opcao != 0);
		System.out.println("Obrigado, volte sempre!");
		input.close();
	}

	private static void criarConta() {
		Conta c = new Conta();
		System.out.println("Informe o número da conta: ");
		c.numero = input.nextInt();
	}

	private static void imprimirMenu() {
		System.out.print(
				"Informe a opcao:\n\t0 - Sair\n\t1 - Criar conta\n\t2 - Consultar saldo\n\t3 - Depositar\n\t4 - Sacar\n=>");
	}
}

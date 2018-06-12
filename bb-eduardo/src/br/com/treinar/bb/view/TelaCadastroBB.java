package br.com.treinar.bb.view;

import java.util.Scanner;

import br.com.treinar.bb.controller.BancoController;
import br.com.treinar.bb.model.Cliente;
import br.com.treinar.bb.model.banco.Conta;
import br.com.treinar.bb.model.banco.ContaCorrente;
import br.com.treinar.bb.model.banco.ContaPoupanca;
import br.com.treinar.bb.model.banco.ContaSalario;

public class TelaCadastroBB {

	private BancoController controller;
	private Scanner input;

	public TelaCadastroBB() {
		controller = new BancoController();
		input = new Scanner(System.in);
	}

	public void iniciarOperacao() {
		int opcao;
		do {
			imprimirMenu();
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				criarConta();
				break;
			case 2:
				depositar();
				break;
			case 3:
				imprimirSaldo();
				break;
//			 case 4:
//			 sacar();
//			 break;
			case 0:
				break;

			default:
				System.out.println("OPÇÃO INVÁLIDA DIGITE NOVAMENTE");
				break;
			}
		} while (opcao != 0);

		input.close();

	}

	private void criarConta() {
		System.out.println("Digite:\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Conta Salário");
		int opcao = input.nextInt();
		input.nextLine();
		
		switch (opcao) {
		case 1:
			criarContaCorrente();
			break;
		case 2:
			criarContaPoupanca();
			break;
		case 3:
			criarContaSalario();
			break;

		default: System.out.println("Opção inválida");
			break;
		}
	}

	private void criarContaCorrente() {
		ContaCorrente cc = new ContaCorrente();
		criarContaGenerica(cc);
		System.out.print("Informe o limite de crédito: ");
		double limiteCredito = input.nextDouble();
		cc.setLimiteCredito(limiteCredito);
		controller.criarConta(cc);
	}

	private void criarContaSalario() {
		ContaSalario cs = new ContaSalario();
		criarContaGenerica(cs);
		System.out.print("Informe o dia de crédito do salário: ");
		int diaCreditoSalario = input.nextInt();
		cs.setDiaCreditoSalario(diaCreditoSalario);
		controller.criarConta(cs);
	}

	private void criarContaPoupanca() {
		ContaPoupanca cp = new ContaPoupanca();
		criarContaGenerica(cp);
		System.out.print("Informe a taxa de rendimento: ");
		float taxaRendimento = input.nextFloat();
		cp.setTaxaRendimento(taxaRendimento);
		controller.criarConta(cp);
	}

	public void criarContaGenerica(Conta conta) {
		System.out.print("Informe o número da conta: ");
		int numeroConta = input.nextInt();
		input.nextLine();
		System.out.print("Informe o nome do cliente: ");
		String nomeCliente = input.nextLine();
		System.out.print("Informe o cpf do cliente: ");
		String cpfCliente = input.nextLine();
		conta.setCliente(new Cliente());
		conta.getCliente().setNome(nomeCliente);
		conta.getCliente().setCpf(cpfCliente);
		conta.setNumero(numeroConta);
	}

	private void imprimirSaldo() {
		System.out.println("Saldo atual: " + controller.getConta().getSaldo());
	}

	private void depositar() {
		System.out.print("Valor a ser depositado: ");
		controller.depositar(input.nextDouble());
	}

	private static void imprimirMenu() {
		System.out.print("" + "Informe a opcão:\n\t0 - Sair\n\t1 - Criar conta\n\t2 - Depositar\n\t3 - Exibir saldo\n\t4 - Sacar ");
	}

}

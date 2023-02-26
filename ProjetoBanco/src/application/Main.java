package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe o nome do titular da conta: ");
            String nome = scanner.nextLine();

            System.out.print("Informe o numero da conta: ");
            String numeroConta = scanner.nextLine();

            System.out.print("Informe o saldo inicial da conta: ");
            double saldo = scanner.nextDouble();

            ContaBancaria conta = new ContaBancaria(nome, numeroConta, saldo);

            System.out.println("Ola " + nome + ", seja bem-vindo(a) à sua conta bancaria!");

            int opcao;
            do {
                System.out.println("\nEscolha uma opcao:");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Imprimir saldo");
                System.out.println("0. Sair");

                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("\nInforme o valor a ser depositado: R$");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.print("\nInforme o valor a ser sacado: R$");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                        break;
                    case 3:
                        conta.imprimirSaldo();
                        break;
                    case 0:
                        System.out.println("\nObrigado por utilizar nossos serviços!");
                        break;
                    default:
                        System.out.println("\nOpção inválida. Por favor, tente novamente.");
                        break;
                }
            } while (opcao != 0);
        }
    }
}

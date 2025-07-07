package ex1;

import java.util.Scanner;

import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        System.out.print("Digite o saldo inicial: R$");
        double saldoInicial = Double.parseDouble(scanner.nextLine());

        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

        MenuUtil menu = new MenuUtil("Conta Bancária");
        menu.adicionarOpcao("Consultar Saldo", conta::getSaldo);
        menu.adicionarOpcao("Consultar Cheque Especial", () -> {
            System.out.println("Limite do cheque especial: R$" + conta.getChequeEspecial());
        });
        menu.adicionarOpcao("Depositar Dinheiro", () -> {
            System.out.print("Valor a depositar: R$");
            double valor = Double.parseDouble(scanner.nextLine());
            conta.depositar(valor);
        });
        menu.adicionarOpcao("Sacar Dinheiro", () -> {
            System.out.print("Valor a sacar: R$");
            double valor = Double.parseDouble(scanner.nextLine());
            conta.decrementaValor(valor, true, false);
        });
        menu.adicionarOpcao("Pagar Boleto", () -> {
            System.out.print("Valor do boleto: R$");
            double valor = Double.parseDouble(scanner.nextLine());
            conta.decrementaValor(valor, false, true);
        });
        menu.adicionarOpcao("Verificar Uso do Cheque Especial", () -> {
            if (conta.isUsandoChequeEspecial()) {
                System.out.println("A conta está usando cheque especial!");
            } else {
                System.out.println("A conta NÃO está usando cheque especial.");
            }
        });

        menu.executar();
        scanner.close();
    }
}
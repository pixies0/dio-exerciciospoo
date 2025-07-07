package ex1;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private double chequeEspecial;
    private boolean usandoChequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.setChequeEspecial(saldoInicial);
        this.usandoChequeEspecial = false;
        this.valorUsadoChequeEspecial = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    // Consultar Saldo :check:
    public void getSaldo() {
        if (isUsandoChequeEspecial()) {
            System.out.println("Saldo atual: -R$" + Math.abs(saldo) + " (usando cheque especial) - Valor usado: R$" + valorUsadoChequeEspecial);
        } else {
            System.out.println("Saldo atual: R$" + saldo);
        }
        ;
    }

    public boolean isUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    // Consultar cheque especial :check:
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setChequeEspecial(double valorDepositado) {
        if (valorDepositado <= 500.00) {
            this.chequeEspecial = 50.00;
        } else {
            this.chequeEspecial = valorDepositado * 0.5;
        }
    }

    // Operação de Saque e Pagamento :check:
    public void decrementaValor(double valor, boolean saque, boolean pagamento) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;

            if (saldo < 0) {
                usandoChequeEspecial = true;
                valorUsadoChequeEspecial += Math.abs(saldo);
            }

            if (saque)
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            else if (pagamento)
                System.out.println("Pagamento de R$" + valor + " realizado com sucesso.");

        } else {

            if (saque)
                System.out.println("Saldo insuficiente para saque de R$" + valor + ".");
            else if (pagamento)
                System.out.println("Saldo insuficiente para pagamento de R$" + valor + ".");
        }
    }

    // Operação de Deposito :check:
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;

            if (usandoChequeEspecial && saldo >= 0) {
                double taxa = valorUsadoChequeEspecial * 0.20; // Calcula 20% do valor usado
                saldo -= taxa;
                System.out.println("Taxa de 20% sobre o cheque especial usado: R$" + taxa);

                valorUsadoChequeEspecial = 0.0;
                usandoChequeEspecial = false;
            }

            System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

}

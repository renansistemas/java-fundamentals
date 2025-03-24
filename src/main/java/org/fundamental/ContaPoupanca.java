package org.fundamental;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado (Conta Poupança). Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente! Conta Poupança não permite saldo negativo.");
        }
    }
}

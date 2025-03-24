package org.fundamental;

public class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        }
    }
}
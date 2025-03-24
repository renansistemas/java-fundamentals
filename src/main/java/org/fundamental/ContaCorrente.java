package org.fundamental;

public class ContaCorrente extends ContaBancaria {

    private double limiteChequeEspecial;

    public ContaCorrente(double saldoInicial, double limiteChequeEspecial) {
        super(saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {  // Permite saque mesmo se saldo for negativo
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado (Conta Corrente). Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saque negado! Mesmo com cheque especial, o saldo é insuficiente.");
        }
    }

}

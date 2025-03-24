package org.fundamental;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaPoupanca(500);
        ContaBancaria conta2 = new ContaCorrente(500, 200);

        System.out.println("\nTentando sacar R$ 600 de uma Conta Poupança:");
        conta1.sacar(600);  // Deve bloquear o saque

        System.out.println("\nTentando sacar R$ 600 de uma Conta Corrente:");
        conta2.sacar(600);  // Deve permitir o saque pois há cheque especial
    }

}

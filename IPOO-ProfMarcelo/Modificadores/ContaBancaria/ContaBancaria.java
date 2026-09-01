package ContaBancaria;

import ContaPoupanca.ContaPoupanca;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    protected double saldo;
    public String nomeBanco;

    public ContaBancaria(String titular, String numeroConta, double saldo, String nomeBanco) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeBanco = nomeBanco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void apresentarDados(){
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("Nome do Banco: " + nomeBanco);
    }
}

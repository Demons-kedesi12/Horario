package Modificadores.ContaPoupanca;

import Modificadores.Modelo.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, String numeroConta, double saldo, String nomeBanco, double taxaRendimento) {
        super(titular, numeroConta, saldo, nomeBanco);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }


    protected void apresentarPoupanca(){
        System.out.println("Taca de Redimento: " + taxaRendimento);
    }
}

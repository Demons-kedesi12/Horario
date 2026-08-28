package Modificadores.ContaPoupanca;

import Modificadores.Modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(
                "Maria",
                "12345678",
                3000,
                "Banco Brasil"
        );

        conta.apresentarDados();

    }
}

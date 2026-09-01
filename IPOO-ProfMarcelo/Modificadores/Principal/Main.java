package Principal;

import ContaBancaria.ContaBancaria;
import ContaPoupanca.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(
                "Maria",
                "12345678",
                3000,
                "Banco Brasil"

        );

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                "Maria",
                "12345678",
                3000,
                "Banco Brasil",
                0.1

        );

        conta.apresentarDados();
        System.out.println("====================");
        contaPoupanca.apresentarDados();

    }
}
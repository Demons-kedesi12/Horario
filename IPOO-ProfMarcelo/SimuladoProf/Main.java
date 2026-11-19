package Simulado.SimuladoProf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro<Animal> cadastro = new Cadastro<>();
        int cadastrados = 0;

        while (cadastrados < 3) {
            try {
                System.out.println("\n=== Cadastre o Seus Animais! ===");
                System.out.println("1 - Cachorro ou 2 - Gato?");
                int tipo = Integer.parseInt(sc.nextLine().trim());

                if (tipo != 1 && tipo != 2) {
                    throw new IllegalArgumentException("Tipo informado inválido!");
                }

                System.out.println("Qual o Nome do Animal?");
                String nome = sc.nextLine();

                System.out.println("Porte: PEQUENO ou GRANDE?");
                String porte = sc.nextLine().trim().toUpperCase();
                Porte porteFinal = Porte.valueOf(porte);

                Animal animal;
                if (tipo == 1) {
                    animal = new Cachorro(nome, porteFinal);
                } else {
                    animal = new Gato(nome, porteFinal);
                }

                cadastro.adicionar(animal);
                cadastrados++;
                System.out.println("Animal Cadastrado com Sucesso!");

            } catch (IllegalArgumentException e) {
                System.out.println("ERRO: Cadastro inválido! " + e.getMessage() + " Tente novamente!");
            }
        }

        System.out.println("\n==== Animais Cadastrados! ====");
        for (Animal a : cadastro.getElementos()) {
            a.exibirDados();
            a.emitir();
        }

        sc.close();
    }
}

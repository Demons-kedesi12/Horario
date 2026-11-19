package Simulado.SimuladoLele.Main;

import Simulado.SimuladoLele.Animais.Animal;
import Simulado.SimuladoLele.Animais.Cachorro;
import Simulado.SimuladoLele.Animais.Cadastro;
import Simulado.SimuladoLele.Animais.Gato;
import Simulado.SimuladoLele.Clinica.Clinica;
import Simulado.SimuladoLele.Clinica.StatusConsulta;
import Simulado.SimuladoLele.Clinica.Tutor;
import Simulado.SimuladoLele.Clinica.Vacinavel;
import Simulado.SimuladoLele.Excecoes.DadoInvalidoException;
import Simulado.SimuladoLele.Excecoes.VacinaDuplicadaException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            // 1. Leitura e criação do Cachorro
            System.out.println("=== CADASTRO DO CACHORRO ===");
            System.out.print("Nome do cachorro: ");
            String nomeCachorro = sc.nextLine();
            System.out.print("Idade do cachorro: ");
            int idadeCachorro = Integer.parseInt(sc.nextLine());
            System.out.print("Peso do cachorro (kg): ");
            double pesoCachorro = Double.parseDouble(sc.nextLine());
            System.out.print("Porte do cachorro (pequeno/medio/grande): ");
            String porteCachorro = sc.nextLine();

            Cachorro cachorro = new Cachorro(nomeCachorro, idadeCachorro, pesoCachorro, porteCachorro);

            // 2. Leitura e criação do Gato
            System.out.println("\n=== CADASTRO DO GATO ===");
            System.out.print("Nome do gato: ");
            String nomeGato = sc.nextLine();
            System.out.print("Idade do gato: ");
            int idadeGato = Integer.parseInt(sc.nextLine());
            System.out.print("Peso do gato (kg): ");
            double pesoGato = Double.parseDouble(sc.nextLine());
            System.out.print("O gato é castrado? (true/false): ");
            boolean castradoGato = Boolean.parseBoolean(sc.nextLine());

            Gato gato = new Gato(nomeGato, idadeGato, pesoGato, castradoGato);

            // 3. Leitura e criação do Tutor e da Clínica (Agregação)
            System.out.println("\n=== DADOS DO TUTOR E DA CLÍNICA ===");
            System.out.print("Nome do tutor: ");
            String nomeTutor = sc.nextLine();
            System.out.print("CPF do tutor: ");
            String cpfTutor = sc.nextLine();
            Tutor tutor = new Tutor(nomeTutor, cpfTutor);

            System.out.print("Nome da clínica: ");
            String nomeClinica = sc.nextLine();
            System.out.print("Cidade da clínica: ");
            String cidadeClinica = sc.nextLine();
            Clinica clinica = new Clinica(nomeClinica, cidadeClinica);
            clinica.setTutor(tutor);

            System.out.println();
            clinica.apresentarDados();

            // 4. Cadastro<Animal> e inserção dos dois animais
            Cadastro<Animal> cadastro = new Cadastro<>();
            cadastro.cadastrar(cachorro);
            cadastro.cadastrar(gato);
            System.out.println("\nAnimais cadastrados com sucesso no sistema!");

            // 5. Tentativa de cadastrar animal com nome repetido
            System.out.println("\n=== TESTE: CADASTRAR ANIMAL COM NOME REPETIDO ===");
            try {
                System.out.println("Tentando cadastrar outro cachorro com o mesmo nome (" + cachorro.getNome() + ")...");
                Cachorro cachorroRepetido = new Cachorro(cachorro.getNome(), 2, 10.0, "pequeno");
                cadastro.cadastrar(cachorroRepetido);
            } catch (IllegalArgumentException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            } catch (DadoInvalidoException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }

            // 6. Tentativa de criar animal com dado inválido lido via Scanner
            System.out.println("\n=== TESTE: CRIAR ANIMAL COM DADO INVÁLIDO ===");
            try {
                System.out.print("Digite um nome inválido (ex: deixe vazio) para testar: ");
                String nomeInvalido = sc.nextLine();
                System.out.print("Digite uma idade inválida (ex: -2) para testar: ");
                int idadeInvalida = Integer.parseInt(sc.nextLine());
                System.out.print("Digite um peso inválido (ex: 0) para testar: ");
                double pesoInvalido = Double.parseDouble(sc.nextLine());

                Gato gatoInvalido = new Gato(nomeInvalido, idadeInvalida, pesoInvalido, false);
            } catch (DadoInvalidoException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Exceção capturada: formato numérico inválido.");
            }

            // 7. Aplicação de vacinas e teste de vacina duplicada
            System.out.println("\n=== APLICAÇÃO DE VACINAS ===");
            System.out.print("Informe a vacina para o cachorro (" + cachorro.getNome() + "): ");
            String vacinaCachorro = sc.nextLine();
            cachorro.aplicarVacina(vacinaCachorro);

            System.out.print("Informe a vacina para o gato (" + gato.getNome() + "): ");
            String vacinaGato = sc.nextLine();
            gato.aplicarVacina(vacinaGato);

            System.out.println("Tentando aplicar novamente a vacina '" + vacinaCachorro + "' em " + cachorro.getNome() + "...");
            try {
                cachorro.aplicarVacina(vacinaCachorro);
            } catch (VacinaDuplicadaException e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }

            // 8. Polimorfismo com lista de Animal
            System.out.println("\n=== POLIMORFISMO (LISTA DE ANIMAL) ===");
            List<Animal> animais = new ArrayList<>();
            animais.add(cachorro);
            animais.add(gato);

            for (Animal animal : animais) {
                animal.apresentarDados();
                System.out.printf("Valor da consulta: R$ %.2f%n", animal.calcularValorConsulta());
                System.out.println("Ficha Médica (" + animal.getFicha().getNumero() + ") - Vacinas:");
                animal.getFicha().listarVacinas();
                System.out.println("--------------------------");
            }

            // 9. Referência por interface (Vacinavel)
            System.out.println("\n=== REFERÊNCIA POR INTERFACE (VACINAVEL) ===");
            Vacinavel vacinavel = gato;
            System.out.print("Digite uma segunda vacina para aplicar via interface Vacinavel no gato: ");
            String segundaVacinaGato = sc.nextLine();
            vacinavel.aplicarVacina(segundaVacinaGato);
            System.out.println("Vacinas atualizadas de " + gato.getNome() + ":");
            gato.getFicha().listarVacinas();

            // 10. Agendamento de consulta (Associação simples)
            System.out.println("\n=== AGENDAMENTO DE CONSULTA (ASSOCIAÇÃO SIMPLES) ===");
            tutor.agendarConsulta(cachorro);
            System.out.println();
            tutor.agendarConsulta(gato);

            // 11. Exibição utilizando toString()
            System.out.println("\n=== EXIBIÇÃO COM toString() ===");
            System.out.println(tutor.toString());
            System.out.println(cachorro.toString());
            System.out.println(gato.toString());

            // 12. Uso do Enum StatusConsulta
            System.out.println("\n=== STATUS DA CONSULTA ===");
            StatusConsulta status = StatusConsulta.REALIZADA;
            System.out.println("Status: " + status + " -> " + status.getDescrição());

            // 13. Média das idades dos animais cadastrados
            System.out.println("\n=== MÉDIA DAS IDADES ===");
            System.out.printf("Média das idades dos animais cadastrados: %.1f anos%n", cadastro.mediaIdades());

        } catch (DadoInvalidoException e) {
            System.out.println("Erro de dado inválido: " + e.getMessage());
        } catch (VacinaDuplicadaException e) {
            System.out.println("Erro de vacina duplicada: " + e.getMessage());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Erro de entrada numérica inválida: " + e.getMessage());
        } finally {
            // 14. Bloco finally obrigatório
            sc.close();
            System.out.println("\nAtendimento encerrado.");
        }
    }
}
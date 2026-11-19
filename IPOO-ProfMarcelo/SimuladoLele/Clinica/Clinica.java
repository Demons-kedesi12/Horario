package Simulado.SimuladoLele.Clinica;

import Simulado.SimuladoLele.Excecoes.DadoInvalidoException;

public class Clinica {
    private String nome;
    private String cidade;
    private Tutor tutor; // Agregação: referência para um Tutor criado fora da clínica

    // Construtor recebendo apenas nome e cidade (o tutor pode ser vinculado depois via setTutor)
    public Clinica(String nome, String cidade) throws DadoInvalidoException {
        setNome(nome);
        setCidade(cidade);
    }

    // Sobrecarga de construtor (opcional) caso já queira passar o tutor na criação
    public Clinica(String nome, String cidade, Tutor tutor) throws DadoInvalidoException {
        setNome(nome);
        setCidade(cidade);
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new DadoInvalidoException("ERRO: Nome da clínica inválido!");
        }
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws DadoInvalidoException {
        if (cidade == null || cidade.trim().isEmpty()) {
            throw new DadoInvalidoException("ERRO: Cidade da clínica inválida!");
        }
        this.cidade = cidade;
    }

    public Tutor getTutor() {
        return tutor;
    }

    // Método para relacionar o Tutor criado separadamente à Clínica
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void apresentarDados() {
        System.out.println("==== Clínica ====");
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        if (tutor != null) {
            System.out.println("Tutor vinculado: " + tutor.getNome());
        } else {
            System.out.println("Tutor vinculado: Nenhum");
        }
    }
}
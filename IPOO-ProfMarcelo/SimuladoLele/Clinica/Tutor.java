package Simulado.SimuladoLele.Clinica;

import Simulado.SimuladoLele.Animais.Animal;

public class Tutor {
    private String nome;
    private String cpf;

    public Tutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void agendarConsulta(Animal animal){
        System.out.println(" === Dados da Consulta === ");
        System.out.println("Status da Consulta: " + StatusConsulta.AGENDADA );
        System.out.println("Nome do Tutor: " + nome);
        System.out.println("CPF do Tutor: " + cpf);
        System.out.println("Animal: \n" + animal);


    }

    @Override
    public String toString() {
        return "Tutor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

}

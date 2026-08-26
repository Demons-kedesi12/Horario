package Agregação;

public class Professor {
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("ERRO: Nome Inválido!");
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.trim().isEmpty()){
            this.disciplina = disciplina;
        }else{
            System.out.println("ERRO: Disciplina Inválido!");
        }
    }

    public void apresentarDado(){
        System.out.println("Nome do Professor: " + nome);
        System.out.println("Disciplina: " + disciplina);
    }
}

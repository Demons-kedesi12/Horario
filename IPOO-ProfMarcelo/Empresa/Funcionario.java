package Empresa;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new IllegalArgumentException("Nome inválido");
        }else{
            this.nome = nome;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula < 0){
            throw new IllegalArgumentException("!!Matrícula deve ser Maior que 0!!");
        }else{
            this.matricula = matricula;
        }
    }

    public double getSalario() {
        return salarioBase;
    }

    public void setSalario(double salarioBase) {
        if(salarioBase < 0){
            throw new IllegalArgumentException("!!Salário deve ser Maior que 0!!");
        }else{
            this.salarioBase = salarioBase;
        }
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome + "\nMatrícula: " + matricula + "\nSalário: " + calcularSalario());
    }
}

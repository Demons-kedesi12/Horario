package DesafioChat;

public abstract class Funcionario implements Operavel {
    private final String matricula;
    private String nome;
    private double valorBase;
    private static int totalFuncionarios;
    public static final String NOME_EMPRESA = "Palma Empresas";


    public Funcionario(String matricula, String nome, double valorBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.valorBase = valorBase;
        totalFuncionarios++;
    }

    //getters


    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getValorBase() {
        return valorBase;
    }

    //setters

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("Nome é inválido!");
        }
    }

    public void setValorBase(double valorBase) {
        if (valorBase > 0){
            this.valorBase = valorBase;
        }else{
            throw new IllegalArgumentException("Valor Base menor que 0!");
        }
    }

    //métodos

     public abstract double calcularRemuneracao();

    public double calcularPagamento(int meses){
        if (meses <= 0){
            throw new IllegalArgumentException("Quantidade de Meses é menor que 0!");
        }else{
            return meses * calcularRemuneracao();
        }
    }

    public static int getTotalFuncionarios(){
        return totalFuncionarios;
    }

    public void iniciarAtividade(){
        System.out.println("Iniciando a Atividade!...");
    }
    public void encerrarAtividade(){
        System.out.println("Encerrando a Atividade!...");
    }


    public void exibirDados(){
        System.out.println("Empresa: " + NOME_EMPRESA);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Remuneração Calculada: " + calcularRemuneracao());
    }
}

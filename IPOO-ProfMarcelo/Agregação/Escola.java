public class Escola {
    private String nome;
    private String local;
    private String tipo;

    private Professor professor;

    public Escola(String nome, String local, String tipo, Professor professor) {
        this.nome = nome;
        this.local = local;
        this.tipo = tipo;

        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("ERRO: Nome da Escola Inválido!");
        }
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if (nome != null && !nome.trim().isEmpty()){
            this.local = local;
        }else{
            System.out.println("ERRO: Local Inválido!");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (nome != null && !nome.trim().isEmpty()){
            this.tipo = tipo;
        }else{
            System.out.println("ERRO: Tipo Inválido!");
        }
    }

    public void trocaProf(Professor novoProf){
        if (novoProf != null){
            this.professor = novoProf;
            System.out.println(" === "+ novoProf.getNome() + " é o novo professor! === ");
        }else{
            System.out.println("ERRO: O Novo professor está incapacitado!" );
        }
    }

    public void apresentarDado(){
        System.out.println("Nome da Escola: " + nome);
        System.out.println("Local:"  + local);
        System.out.println("Tipo da Escola: " + tipo);

        professor.apresentarDado();
    }
}
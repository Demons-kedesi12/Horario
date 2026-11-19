    package Simulado.SimuladoLele.Animais;

    import Simulado.SimuladoLele.Clinica.FichaMedica;
    import Simulado.SimuladoLele.Excecoes.DadoInvalidoException;

    public abstract class Animal {
        private String nome;
        private int idade;
        private double peso;
        private FichaMedica ficha;

        public Animal(String nome, int idade, double peso) throws DadoInvalidoException{
            if (nome == null || nome.trim().isEmpty()){
                throw new DadoInvalidoException("ERRO: Nome Inválido!");
            }
            if (idade < 0){
                throw new DadoInvalidoException("ERRO: Idade Inválida!");
            }
            if (peso <= 0){
                throw new DadoInvalidoException("ERRO: Peso Inválido!");
            }

            this.ficha = new FichaMedica("1234556-" + nome);
            setIdade(idade);
            setNome(nome);
            setPeso(peso);
        }

        public FichaMedica getFicha() {
            return ficha;
        }

        public void setNome(String nome) throws DadoInvalidoException {
            if (nome == null || nome.trim().isEmpty()){
                throw new DadoInvalidoException("ERRO: Nome Inválido!");
            }
            this.nome = nome;
        }

        public void setIdade(int idade) throws DadoInvalidoException {
            if (idade < 0){
                throw new DadoInvalidoException("ERRO: Idade Inválida!");
            }

            this.idade = idade;
        }

        public void setPeso(double peso) throws DadoInvalidoException {
            if (peso <= 0){
                throw new DadoInvalidoException("ERRO: Peso Inválido!");
            }
            this.peso = peso;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public double getPeso() {
            return peso;
        }

        public void apresentarDados(){
            System.out.println("==== Animal ====");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Peso: " + peso);
        }

        public abstract double calcularValorConsulta();

        @Override
        public String toString() {
            return "Animal{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", peso=" + peso +
                    ", valorConsulta=R$ " + String.format("%.2f", calcularValorConsulta()) +
                    '}';
        }
    }

package locadora;

/**
 * Classe Cliente que realiza operações utilizando métodos que interagem com os objetos nome, idade, anosHabilitado.
 */

public class Cliente {

    private String nome;
    private int idade;
    private int anosHabilitado;

    /**
     * Construtor da classe Cliente
     * Cria a instância dos objetos
     * @param nome nome do cliente
     * @param idade idade do cliente
     * @param anosHabilitado anos que o cliente está habilitado
     */

    public Cliente(String nome, int idade, int anosHabilitado) {
        this.nome = nome;
        this.idade = idade;
        this.anosHabilitado = anosHabilitado;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAnosHabilitado() {
        return anosHabilitado;
    }

    /**
     * Método public booleano para verificar se o cliente é apto.
     * @return uma lógica de true, se a idade for maior ou igual a 21 e os anos habilitados do cliente for maior ou igual a 2, ou false se uma ou ambas lógicas forem falsas.
     */

    public boolean isApto() {
        return idade >= 21 && anosHabilitado >= 2;
    }
}

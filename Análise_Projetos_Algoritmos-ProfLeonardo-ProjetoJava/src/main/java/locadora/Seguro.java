package locadora;

/**
 * Classe Seguro que realiza getters que interagem com os atributos tipo e valorDiario.
 */

public class Seguro {

    private String tipo;
    private double valorDiario;

    /**
     * Construtor da classe Seguro
     * Cria a instância dos objetos
     * @param tipo tipo do seguro
     * @param valorDiario valor diário do seguro
     */


    public Seguro(String tipo, double valorDiario) {
        this.tipo = tipo;
        this.valorDiario = valorDiario;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorDiario() {
        return valorDiario;
    }
}

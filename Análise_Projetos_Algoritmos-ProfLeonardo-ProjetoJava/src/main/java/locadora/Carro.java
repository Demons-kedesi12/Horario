package locadora;

/**
 * Classe Carro que realiza getters que interagem com os atributos placa, modelo, valorDiaria e disponivel.
 */

public class Carro {

    private String placa;
    private String modelo;
    private double valorDiaria;
    private boolean disponivel;

    /**
     * Construtor da classe Carro
     * Cria a instância dos objetos
     * @param placa placa do carro da locadora
     * @param modelo modelo do carro da locadora
     * @param valorDiaria valor de pagamento por dia do carro na locadora.
     */
    public Carro(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

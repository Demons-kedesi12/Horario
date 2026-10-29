package Atv13;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {

        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("ERRO: O titular não pode ser nulo ou vazio!");
        }

        if (saldo < 0 || !Double.isFinite(saldoInicial)) {
            throw new IllegalArgumentException("ERRO: Saldo inicial negativo ou não finito!");
        }


        this.saldo = saldoInicial;
        this.titular = titular.trim();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor <= 0 || !Double.isFinite(valor)){
            throw new IllegalArgumentException("ERRO: O valor do saque deve ser maior que zero e finito.");
        }

        if (valor > saldo){
            throw new SaldoInsuficienteException("\nSaldo Insuficiente. \nSaldo: " + saldo + " \nSaque: " + valor);
        }
        saldo -= valor;
    }

    public void exibirDados(){
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n",  saldo);

    }
}

package Composição;

public class Motor {
    private int cilindrada;
    private double combustivel;

    public Motor(int cilindrada, double combustivel) {
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada > 0){
            this.cilindrada = cilindrada;
        }else{
            System.out.println("ERRO: Cilindrada deve ser maior que 0");
        }
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        if (combustivel>0){
            this.combustivel = combustivel;
        }else{
            System.out.println("ERRO: Combustível menor que 0");
        }
    }
    public void apresentarDados(){
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Combustível: " + combustivel);
    }
}

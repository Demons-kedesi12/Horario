package Composição;
public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, int cilindrada, double combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(cilindrada,combustivel);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca !=null && !modelo.trim().isEmpty()) {
            this.marca = marca;
        }else{
            System.out.println("ERRO: Marca não existe");
        }
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        if(marca !=null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        }else{
            System.out.println("ERRO: Modelo não existe");
        }
    }
    public void apresentarDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        motor.apresentarDados();
    }
}

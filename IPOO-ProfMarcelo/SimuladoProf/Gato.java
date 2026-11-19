package Simulado.SimuladoProf;

public class Gato extends Animal {

    public Gato(String nome, Porte porte) {
        super(nome, porte);
    }

    @Override
    public void emitir() {
        System.out.println("Miau!");
    }
}

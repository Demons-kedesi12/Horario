package Simulado.SimuladoProf;

public abstract class Animal implements Sonoro {
    private String nome;
    private Porte porte;

    public Animal(String nome, Porte porte) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("ERRO: Nome está inválido!");
        }
        if (porte == null) {
            throw new IllegalArgumentException("ERRO: Porte está inválido!");
        }

        this.nome = nome;
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public Porte getPorte() {
        return porte;
    }

    public void exibirDados() {
        System.out.println("=== Animal ====" + "\nNome: " + nome + "\nPorte: " + porte);
    }
}

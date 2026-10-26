package DesafioChat;

public class Main {

    public static void main(String[] args) {

        // criando funcionario clt
        FuncionarioCLT clt = new FuncionarioCLT(
                "CLT001",
                "Ana Silva",
                2500,
                2
        );

        // criando funcionario pj
        FuncionarioPJ pj = new FuncionarioPJ(
                "PJ001",
                "Carlos Souza",
                4000,
                3
        );

        // referencias do tipo funcionario
        Funcionario funcionario1 = clt;
        Funcionario funcionario2 = pj;

        // exibindo dados
        funcionario1.exibirDados();
        System.out.println("Pagamento por 3 meses: R$ " + funcionario1.calcularPagamento(3));

        System.out.println();

        funcionario2.exibirDados();
        System.out.println("Pagamento por 3 meses: R$ " + funcionario2.calcularPagamento(3));

        System.out.println();

        // dados especificos
        System.out.println("Quantidade de dependentes: " + clt.getQtdDependentes());
        System.out.println("Quantidade de projetos: " + pj.getQutdProjetos());

        System.out.println();

        // referencias do tipo operavel
        Operavel operavel1 = clt;
        Operavel operavel2 = pj;

        operavel1.iniciarAtividade();
        operavel1.encerrarAtividade();

        System.out.println();

        operavel2.iniciarAtividade();
        operavel2.encerrarAtividade();

        System.out.println();

        // total de funcionarios
        System.out.println("Total de funcionarios criados: "
                + Funcionario.getTotalFuncionarios());
    }
}
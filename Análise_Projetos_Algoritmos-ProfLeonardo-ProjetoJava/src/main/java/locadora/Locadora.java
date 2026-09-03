package locadora;

/**
 * Classe Locadora que realiza operações utilizando métodos que interagem com os objetos carro e cliente.
 */

public class Locadora {

    private static final double[] TABELA_PRECOS = {90.0, 130.0, 180.0};
    private static final int[] LIMIARES_DIAS = {3, 7, 15};
    private static final double[] DESCONTOS = {0.05, 0.10, 0.20};

    /**
     * Ao selecionar opção 1
     * Mostra quantos carros estão disponíveis na frota no momento.
     *
     * @param carros objeto da classe Carro que possui todas as informações e getters dos carros.
     * @return a variável total, após passar por uma estrutura de repetição de total++ e verificar quantos carros estão disponíveis.
     */

    public int contarCarrosDisponiveis(Carro[] carros) {
        int total = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                total++;
            }
        }
        return total;
    }

    /**
     * Ao selecionar a opção 2.
     * Soma o valor da diaria de todos os carros da frota.
     *
     * @param carros objeto da classe Carro que possui todas as informações e getters dos carros.
     * @return a variável total, após passar por uma estrutura de repetição que atribui o valor da diária do carro adicionado ao total anterior.
     */

    public double calcularReceitaTotalFrota(Carro[] carros) {
        double total = 0;
        for (int i = 0; i < carros.length; i++) {
            total += carros[i].getValorDiaria();
        }
        return total;
    }

    /**
     * Ao selecionar a opção 3.
     * Calcula a media de idade dos clientes novos informados.
     *
     * @param clientes objeto da classe Cliente que possui todas as informações e getters dos clientes.
     * @return em uma condicional if, em que:
     * Retorna soma dividido pela quantidade de clientes para a média, se a quantidade de clientes for maior que 0
     * (que atribui soma + o índice das idades dos clientes, com uma estrutura de repetição for.
     * Ou, senão, retorna 0 se a quantidade de clientes for 0.
     */

    public int calcularMediaIdadeClientes(Cliente[] clientes) {
        int soma = 0;
        if (clientes.length > 0){
            for (int i = 0; i < clientes.length; i++) {
                soma += clientes[i].getIdade();
            }
            return soma / clientes.length;
        }else{
            return 0;
        }
    }

    /**
     * Ao selecionar a opção 4.
     * Busca, entre os clientes informados, o de maior idade. A lógica consiste em fazer uma eestrutura de repetição
     * com o tamanho da quantidade de clientes. Assim, dentro da estrutura, fazer uma condicional If,
     * para testar se a variável maisVelha for nula no começo ou o índice do cliente ter uma idade maior que a variável maisVelho
     * a  condição é verdadeira e o maisVelho atribuirá o objeto cliente mais velho. Assim sucessivamente até o fim da repetição.
     *
     * @param clientes objeto da classe Cliente que possui todas as informações e getters dos clientes.
     * @return a varíavel maisVelho, ou seja o cliente mais velho da locadora.
     */

    public Cliente buscarClienteMaisVelho(Cliente[] clientes) {
        Cliente maisVelho = null;
        for (int i = 0; i < clientes.length; i++) {
            if (maisVelho == null || clientes[i].getIdade() > maisVelho.getIdade()) {
                maisVelho = clientes[i];
            }
        }
        return maisVelho;
    }

    /**
     * Ao selecionr a opção 5.
     * Busca um carro pela placa e devolve uma descricao com modelo e valor da diaria.
     * A lógica se dá:
     * Cria-se uma variável encontrado com valor inicial nulo.
     * Entra-se numa estrutura de repetição for que repete quantidade dos carros vezes.
     * Nessa estrutura de repetição terá uma condicional que vai verificar se o índice do carro apresentado é igual ao valor do parâmetro placa.
     * Se verdadeiro, então variáevel encontrado recebe o objeto carro.
     *
     * @param carros objeto da classe Carro que possui todas as informações e getters dos carros.
     * @param placa recebe o nome da placa para verificação
     * @return uma condicional em que, se variável encontrado não for nula, então se dá verdadeira e retorna o nome do carro e o valor da diária.
     * Senão, retornará que deu erro e a placa exigida não foi encontrada.
     */


    public String buscarCarroPorPlaca(Carro[] carros, String placa) {
        Carro encontrado = null;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getPlaca().equals(placa)) {
                encontrado = carros[i];
            }
        }
        if (encontrado != null){
            return encontrado.getModelo() + " - R$" + encontrado.getValorDiaria() + "/dia";

        }else{
            return "ERRO: Placa Não Encontrada!";
        }
    }

    /**
     * Ao selecionar a opção 6.
     * Calcula a multa por atraso, cobrando R$40,00 por dia de atraso.
     * A lógica se dá:
     * Cria-se uma variável multaPorDia que atribui 40 reais, que seria o valor da multa diária.
     * E outra variável total com valor 0.
     * Após isso, uma estrutura de repetição for que repetirá a quantidade de diasAtraso vezes.
     * Assim, total atribuirá a soma de total anterior com a multaPorDia
     *
     * @param diasAtraso recebe a quantidade de dias que o cliente atrasou para os cálculos.
     * @return a variável total agora com o total da multa a ser paga pelos dias que se passaram.
     */

    public double calcularMultaAtraso(int diasAtraso) {
        double multaPorDia = 40;
        double total = 0;
        for (int i = 0; i < diasAtraso; i++) {
            total += multaPorDia;
        }
        return total;
    }

    /**
     * Ao selecionar a opção 7.
     * Processa uma locacao completa: valida o carro, calcula o valor bruto
     * (diaria + seguro, multiplicado pelos dias) e aplica 15% de desconto
     * quando o cliente estiver apto E o aluguel for de 7 dias ou mais.
     * A lógica se dá:
     * A função public double processarLocacaoCompleta será chamada e realizará, dentro dela, ela chama
     * a função private void validarLocacao, que valida se o carro está disponível, se estiver indisponível, interromperá a execução.
     * Se não tiver erro segue normalmente para o próximo programa da função processarLocacaoCompleta.
     * O próximo passo é a variável double valorBruto que atribui a função private double calcularValorBruto.
     * A função de calcular o valor bruto, é a diaria + seguro, multiplicado pelos dias.
     *
     * @param carro objeto da classe Carro que possui todas as informações e getters dos carros.
     * @param cliente objeto da classe Cliente que possui todas as informações e getters dos clientes.
     * @param seguro objeto da classe Seguro que possui todas as informações e getters do seguro dos carros.
     * @param dias recebe a quantidade de dias que o carro sera alugado.
     * @return função private double aplicarDescontosEEncargos,
     * que retorna uma condicional de se o cliente for apto E os dias forem maior ou igual a 7,
     * então retornará o valorBruto * 0.85.
     * Senão, caso false, retornará apenas o valorBruto sem descontos.
     */

    public double processarLocacaoCompleta(Carro carro, Cliente cliente, Seguro seguro, int dias) {
        validarLocacao(carro);
        double valorBruto = calcularValorBruto(carro, seguro, dias);
        return aplicarDescontosEEncargos(valorBruto, cliente, dias);
    }

    private void validarLocacao(Carro carro) {
        if (!carro.isDisponivel()) {
            throw new IllegalStateException("Carro indisponivel");
        }
    }

    private double calcularValorBruto(Carro carro, Seguro seguro, int dias) {
        return (carro.getValorDiaria() + seguro.getValorDiario()) * dias;
    }

    private double aplicarDescontosEEncargos(double valorBruto, Cliente cliente, int dias) {
        if (cliente.isApto() && dias >= 7) {
            return valorBruto * 0.85;
        }else{
            return valorBruto;
        }
    }

    /**
     * Ao selecionar a opção 8.
     * Calcula a diaria de um aluguel a partir da categoria do veiculo (0, 1 ou 2),
     * multiplicada pela quantidade de dias.
     * A lógica de dá:
     * Cria-se uma variável double valorDiaria que recebe o valor da posição da TABELA_PRECOS correspondente à categoria informada.
     * Assim, para acessar os preços da tabela, coloca-se o índice do vetor como categoria, para acessar os preço específico.
     * @param categoria recebe a categoria do veículo, um valor entre 0, 1 ou 2.
     * @param dias recebe a quantiadade de dias de aluguel
     * @return valorDiaria vezes a quantidade de dias de aluguel.
     */

    public double calcularDiariaComCategoria(int categoria, int dias) {
        double valorDiaria = TABELA_PRECOS[categoria];
        return valorDiaria * dias;
    }

    /**
     * Ao selecionar a opção 9.
     * Gera um resumo da frota com a quantidade de carros disponíveis e a média do valor da diária apenas dos carros disponíveis.
     * A lógica se dá:
     * Cria-se uma variável disponiveis com valor 0 e uma variável somaValores com valor 0.
     * Após isso, uma estrutura de repetição for que percorrerá a quantidade de carros da frota.
     * Dentro da estrutura, terá uma condicional if para verificar se o carro está disponível.
     * Se true, a variável disponiveis receberá mais 1 e a variável somaValores receberá a soma do valor da diária do carro.
     * Após a repetição, será criada uma variável media que verificará se a quantidade de carros disponíveis é igual a 0.
     * Se for igual a 0, a média receberá 0, senão, a média será calculada dividindo a soma dos valores pela quantidade de carros disponíveis.
     *
     * @param carros objeto da classe Carro que possui todas as informações e getters dos carros.
     * @return uma String contendo a quantidade de carros disponíveis e a média do valor da diária dos carros disponíveis.
     */

    public String gerarResumoFrota(Carro[] carros) {
        int disponiveis = 0;
        double somaValores = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                disponiveis++;
                somaValores += carros[i].getValorDiaria();
            }
        }
        double media = disponiveis == 0 ? 0 : somaValores / disponiveis;
        return disponiveis + " carro(s) disponivel(is), media de R$" + media + "/dia";
    }

    /**
     * Ao selecionar a opção 10
     * Aplica um desconto escalonado sobre o valor base, conforme a quantidade
     * de dias alugados: 5% (3+ dias), 10% (7+ dias) ou 20% (15+ dias).
     * A lógica se dá:
     * Cria-se uma variável double desconto com valor 0.
     * Inicia-se uma repetição for que repetirá o tamanho do vetor LIMIARES_DIAS vezes.
     * Dentro dessa repetição, terá uma condicional if que,
     * se os dias estipulados forem maior ou igual aos LIMIARES_DIAS, então desconto
     * receberá o valor de DESCONTOS conforme o índice.
     * Se for false, o for continuará a repetição novamente até o fim dela.
     * @param valorBase recebe o valor base
     * @param dias recebe a quantidade de dias
     * @return o valorBase com o desconto aplicado, sendo o cálculo 1 menos a
     * quantidade de desconto (5%, 10% ou 20%), multiplicado pelo valorBase.
     */

    public double calcularDescontoEscalonado(double valorBase, int dias) {
        double desconto = 0;
        for (int i = 0; i < LIMIARES_DIAS.length; i++) {
            if (dias >= LIMIARES_DIAS[i]) {
                desconto = DESCONTOS[i];
            }
        }
        return valorBase * (1 - desconto);
    }


    /**
     * Ao selecionar a opção 11.
     * Verifica se o cliente tem direito ao desconto de fidelidade: precisa ter
     * pelo menos 25 anos E pelo menos 3 locacoes anteriores.
     * @param cliente objeto da classe Cliente que possui todas as informações e getters dos clientes.
     * @param totalLocacoesAnteriores recebe o total de locações anteriores que o cliente já teve.
     * @return um valor booleano true or false, dependendo se a expressão lógica estiver correta.
     * Será true se, a idade do cliente for maior ou igual 25 anos E o total de locações anteriores for maior ou igual a 3,
     * qualquer outro valor que não for verdadeiro, retornará false.
     */

    public boolean clienteElegivelDescontoFidelidade(Cliente cliente, int totalLocacoesAnteriores) {
        return cliente.getIdade() >= 25 && totalLocacoesAnteriores >= 3;
    }
}

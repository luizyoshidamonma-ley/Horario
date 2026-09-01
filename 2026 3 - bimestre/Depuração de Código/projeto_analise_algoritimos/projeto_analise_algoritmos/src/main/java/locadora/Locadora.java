package locadora;

/**
 * A classe Locadora 11 métodos que podem ser chamados na Main, cada uma realiza sua função (que é diferente entre si), ela possui três atributos, tabela de preço, limiares de dia e desconto, todas são vetores, eles são utilizados por alguns métodos.
 */
public class Locadora {

    private static final double[] TABELA_PRECOS = {90.0, 130.0, 180.0};
    private static final int[] LIMIARES_DIAS = {3, 7, 15};
    private static final double[] DESCONTOS = {0.05, 0.10, 0.20};

    // Conta quantos carros da frota estao disponiveis.
    // TODO: adicionar Javadoc.

    /**
     *contarCarrosDisponíveis conta a quantidade de carros disponível para locação, ela é um laço que se repete por toda a extensão do vetor /parâmetro carros e soma 1 ao total toda vez que o carro da posição correspondente estiver disponível
     * @param carros
     * @return  total (de carros disponível)
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

    // Soma o valor da diaria de todos os carros da frota.
    // TODO: adicionar Javadoc.

    /**
     * calcularReceitaTotalFrota calcula o total que a frota (quantidade de carros) pode gerar (locação de todos os carros independente da disponibilidade), ela é um laço com o tamanho do parâmetro de carros que soma ao total o valor da diária do carro correspondente ao laço
     * @param carros
     * @return total (valor total da frota de carros)
     */
    public double calcularReceitaTotalFrota(Carro[] carros) {
        double total = 0;
        for (int i = 0; i < carros.length; i++) {
            total += carros[i].getValorDiaria();
        }
        return total;
    }

    // Calcula a media de idade dos clientes informados.
    // TODO: adicionar Javadoc.

    /**
     *calcularMediaIdadeClientes calcula a média de idade dos clientes, ela é calculada pela soma da idade de todos os clientes (utilizando um laço para que a variável soma recebe a idade de todos os clientes) dividido pela quantidade de clientes; caso a quantidade de clientes seja 0 o programa quebra pois a divisão por 0 é impossível, portanto é necessário colocar uma restrição (a quantidade de clientes é o tamanho do vetor de clientes novos)
     * @param clientes
     * @return 0 (caso a lista de clientes estaja vazia) ou a média (divisão da soma total de idades dividido pela quantidade de clientes)
     */
    public int calcularMediaIdadeClientes(Cliente[] clientes) {
        int soma = 0;
        for (int i = 0; i < clientes.length; i++) {
            soma += clientes[i].getIdade();
        }
        if (clientes.length == 0) {
            return 0;
        }
        return soma / clientes.length;
    }

    // Busca, entre os clientes informados, o de maior idade.
    // TODO: adicionar Javadoc.

    /**
     * BuscarClienteMaisVelho busca o cliente mais velho, ele cria a variável maisVelho como null, faz um laço pra passar por todo o vetor de clientes e se o mais velho for null ou a idade do cliente de posição i do laço for maior que a idade do mais velho, o mais velho recebe o cliente de valor i, após passar o vetor inteiro o maisVelho tem a idade mais velha
     * @param clientes
     * @return a variável maisVelho que foi declarada no começo mas que recebe diferentes valores dentro do laço, ele carrega a idade mais velha
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

    // Busca um carro pela placa e devolve uma descricao com modelo e valor da diaria.
    // TODO: adicionar Javadoc.

    /**
     * BusarCarroPorPlaca busca o carro por uma placa específica, el cria uma variável encontrado que é inicializada como null, um laço com o tamanho do vetor de carros ou seja a quantidade de carros e se o carro da posição i do laço foi igual a placa que está sendo procurada a variável encontrado recebe o carro i, senão o laço continua
     *
     * @param carros
     * @param placa
     * @return o retorno mostra o modelo do carro e o valor da sua diária (caso seja encontrado), caso o carro não seja encontrado o retorno é um aviso que o carro não pode ser encontrado
     */
    public String buscarCarroPorPlaca(Carro[] carros, String placa) {
        Carro encontrado = null;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getPlaca().equals(placa)) {   // se o carro da posição i, pega a placa, se a placa for igual ao parametro placa então encontrado recebe o carro i
                encontrado = carros[i];

            }else {
                continue;
            }
            return encontrado.getModelo() + " - R$" + encontrado.getValorDiaria() + "/dia";
        }


        return "O carro não pode ser encontrado";
    }

    // Calcula a multa por atraso, cobrando R$40,00 por dia de atraso.
    // TODO: adicionar Javadoc.

    /**
     * CalcularMultaAtraso calcula o valor total da multa pela quantidade de dias de atraso, com o valor da multa po dia 40 reais, o método cria uma variável total que é inicializada em 0, o laço recorre pela quantidade de dias de atraso e o total recebe o valor da multa por dia, é uma conta de multiplicação da multa por dia vezes a quantidade de dias mas re-escrita como a soma da multa por dia a quantidade de dias de atraso
     *
     * @param diasAtraso
     * @return o retorno é o valor total da soma sequencial.
     */


    public double calcularMultaAtraso(int diasAtraso) {
        double multaPorDia = 40;
        double total = 0;
        for (int i = 1; i <= diasAtraso; i++) {
            total += multaPorDia;
        }
        return total;
    }

    // Processa uma locacao completa: valida o carro, calcula o valor bruto
    // (diaria + seguro, multiplicado pelos dias) e aplica 15% de desconto
    // quando o cliente estiver apto E o aluguel for de 7 dias ou mais.
    // TODO: adicionar Javadoc.

    /**
     * ProecssarLocacaoCompleta processa o valor de uma locação completa com os parametros de carro, cliente, seguro e a quantidade de dias, primeiro ele valida se o carro está disponível, depois a variável valor bruto recebe o método de calcular o valor Bruto do carro que usa os parametros de carro seguro e dias (o valor bruto é calculado pelo valor base do carro somado ao valor da diária com o segura multiplicado pela quantidade de dias (valorBase + (valor diário * dias))
     * @param carro
     * @param cliente
     * @param seguro
     * @param dias
     * @return o retorno é o valor bruto com um desconto baseado na idade do cliente e na quantidade de dias que o carro será locado, caso o cliente seja apto ou a quantidade de dias locados seja maior ou igual a 7 o valor bruto recebe 15% de desconto ou seja 85% do valor bruto
     */
    public double processarLocacaoCompleta(Carro carro, Cliente cliente, Seguro seguro, int dias) {
        validarLocacao(carro);
        double valorBruto = calcularValorBruto(carro, seguro, dias);
        return aplicarDescontosEEncargos(valorBruto, cliente, dias);
    }

    /**
     * Caso o carro esteja diferente de disponível
     * @param carro
     * @return "retorna" uma aviso que o carro está indisponível
     */
    private void validarLocacao(Carro carro) {
        if (!carro.isDisponivel()) {
            throw new IllegalStateException("Carro indisponivel");
        }
    }

    /**
     * Cálculo do valor bruto de uma locação que é o valor da diária do carro somado ao (valor da diária do segundo multiplicado pela quantidade de dias)
     * @param carro
     * @param seguro
     * @param dias
     * @return valor da locação do carro sem descontos
     */
    private double calcularValorBruto(Carro carro, Seguro seguro, int dias) {
        return (carro.getValorDiaria() + seguro.getValorDiario()) * dias;
    }

    /**
     * Calcula o valor total da locação caso alguma das condições de desconto possa ser aplicada, seja
     * @param valorBruto
     * @param cliente
     * @param dias
     * @return valor da locação do carro com descontos aplicados se passível.
     */
    private double aplicarDescontosEEncargos(double valorBruto, Cliente cliente, int dias) {
        if (cliente.isApto() || dias >= 7) {
            return valorBruto * 0.85;
        }
        return valorBruto;
    }

    // Calcula a diaria de um aluguel a partir da categoria do veiculo (0, 1 ou 2),
    // multiplicada pela quantidade de dias.
    // TODO: adicionar Javadoc.
    /**
     * CalcularDiariaComCategoria Calcula o valor da diária de um carro baseado na sua categoria e quantidade de dias que será locado, a variável valor diária recebe a o preço da diária da categoria selecionada e é multiplicada pela quantidade de dias
     * @param categoria
     * @param dias
     * @return valor da diária de um carro de uma categoria selecionada multiplicada pela quantidade de dias
     */
    public double calcularDiariaComCategoria(int categoria, int dias) {
        double valorDiaria = TABELA_PRECOS[categoria];
        return valorDiaria * dias;
    }

    // Gera um resumo com a quantidade de carros disponiveis e o valor medio
    // da diaria apenas dos carros disponiveis.
    // TODO: adicionar Javadoc.

    /**
     * GerarResumoFrota Gera um resumo da frota de carros, ele usa o vetor carros, as variáveis disponível e soma valores são usados como acumuladores e estão dentro do laço que roda pela quantidade de carros no vetor carros independente da sua disponibilidade, se o carro estiver disponível para locação a variável disponíveis recebe 1 e o acumulator somaValores recebe em soma o valor do carro da posição do laço (diária do carro), além disso a variável média recebe a soma dos valores da frota de carro disponível dividido pela quantidade de carros disponível (isso se a quantidade de carros disponível for diferente de 0
     * @param carros
     * @return quantidade de carris disponíveis e a média de preço de toda a frota por dia
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
        return String.format("%d carro(s) disponível (is) , média de %.2f / dia",disponiveis,media);
    }

    // Aplica um desconto escalonado sobre o valor base, conforme a quantidade
    // de dias alugados: 5% (3+ dias), 10% (7+ dias) ou 20% (15+ dias).
    // TODO: adicionar Javadoc.

    /**
     *CalcularDescontoEscalonado calcula o desconto de acordo com a quantidade de dias, com 3 ou mais dias 5%, 7+ 10% e 15+ duas 20% de desconto, isso utilizando um laço com o tamanho do vetor de limiar de dias ou seja a quantidade de dias necessárias para aplicar um desconto, dentro do laço caso a quantidade de dias seja maior ou igual a quantidade de dias necessária para um desconto o desconto recebe o valor do vetor de desconto na posição do laço i
     * @param valorBase
     * @param dias
     * @return o retorno é o valor base da locação multiplicado por 1 - quantidade de desconto
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

    // Verifica se o cliente tem direito ao desconto de fidelidade: precisa ter
    // pelo menos 25 anos E pelo menos 3 locacoes anteriores.
    // TODO: adicionar Javadoc.

    /**
     * ClienteElegivelDescontoFidelidade verifica se o cliente pode receber um desconto pela sua fidelidade a locadora. ela é um boolean falso ou verdadeiro
     * @param cliente
     * @param totalLocacoesAnteriores
     * @return se a idade do cliente for maior ou igual a 25 e o cliente tiver feito três ou mais locações anteriormente o valor retornado é verdadeiro, caso contrário o retorno é falso
     */
    public boolean clienteElegivelDescontoFidelidade(Cliente cliente, int totalLocacoesAnteriores) {
        return cliente.getIdade() >= 25 && totalLocacoesAnteriores >= 3;
    }
}

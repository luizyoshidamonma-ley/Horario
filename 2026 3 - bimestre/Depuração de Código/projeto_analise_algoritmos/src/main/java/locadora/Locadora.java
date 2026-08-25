package locadora;

// TODO: adicionar Javadoc da classe.
public class Locadora {

    private static final double[] TABELA_PRECOS = {90.0, 130.0, 180.0};
    private static final int[] LIMIARES_DIAS = {3, 7, 15};
    private static final double[] DESCONTOS = {0.05, 0.10, 0.20};

    // Conta quantos carros da frota estao disponiveis.
    // TODO: adicionar Javadoc.
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
    public double calcularReceitaTotalFrota(Carro[] carros) {
        double total = 0;
        for (int i = 0; i < carros.length; i++) {
            total += carros[i].getValorDiaria();
        }
        return total;
    }

    // Calcula a media de idade dos clientes informados.
    // TODO: adicionar Javadoc.
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
    public String buscarCarroPorPlaca(Carro[] carros, String placa) {
        Carro encontrado = null;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getPlaca().equals(placa)) {
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
        if (cliente.isApto() || dias >= 7) {
            return valorBruto * 0.85;
        }
        return valorBruto;
    }

    // Calcula a diaria de um aluguel a partir da categoria do veiculo (0, 1 ou 2),
    // multiplicada pela quantidade de dias.
    // TODO: adicionar Javadoc.
    public double calcularDiariaComCategoria(int categoria, int dias) {
        double valorDiaria = TABELA_PRECOS[categoria];
        return valorDiaria * dias;
    }

    // Gera um resumo com a quantidade de carros disponiveis e o valor medio
    // da diaria apenas dos carros disponiveis.
    // TODO: adicionar Javadoc.
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
    public boolean clienteElegivelDescontoFidelidade(Cliente cliente, int totalLocacoesAnteriores) {
        return cliente.getIdade() >= 25 && totalLocacoesAnteriores >= 3;
    }
}

package questao_1;

public class ExibirInformacoes {
    private CalcularDesconto Calculadora;

    public ExibirInformacoes(CalcularDesconto calculadora) {
        this.Calculadora = calculadora;
    }

    public void exibir() {
        System.out.printf("Preço original: R$%.2f\n", Calculadora.getPreco());
        System.out.printf("Desconto: %.2f%%\n", Calculadora.getDesconto());
        System.out.printf("Preço com desconto: R$%.2f\n", Calculadora.calcularValorFinal());
    }
}

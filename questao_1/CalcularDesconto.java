package questao_1;

public class CalcularDesconto {
    private double preco;
    private float desconto;

    public CalcularDesconto(double preco, float desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public double calcularValorFinal () {
        return preco - (preco * desconto);
    }
}

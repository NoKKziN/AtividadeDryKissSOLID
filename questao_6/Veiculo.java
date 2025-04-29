package questao_6;

public class Veiculo {
    private int peso;
    private int velocidadeMax;
    private float preco;

    public Veiculo() {
        this.peso = 0;
        this.velocidadeMax = 0;
        this.preco = 0.0f;
    }

    public Veiculo(int peso, int velocidadeMax, float preco) {
        this.peso = peso;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }

    public void set(int peso, int velocidadeMax, float preco) {
        this.peso = peso;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }

    public void print() {
        System.out.println("Veículo:");
        System.out.println(" - Peso: " + peso + " kg");
        System.out.println(" - Velocidade Máxima: " + velocidadeMax + " km/h");
        System.out.println(" - Preço: R$ " + preco);
    }

    // Getters e setters
    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }

    public int getVelocidadeMax() { return velocidadeMax; }
    public void setVelocidadeMax(int velocidadeMax) { this.velocidadeMax = velocidadeMax; }

    public float getPreco() { return preco; }
    public void setPreco(float preco) { this.preco = preco;
    }
}

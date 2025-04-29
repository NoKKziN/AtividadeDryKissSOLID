package questao_6;

public class Caminhao extends Veiculo {
    private Motor motor;
    private int toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        super();
        this.motor = new Motor();
        this.toneladas = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    public Caminhao(int numCilindros, int potencia, int peso, int velocidadeMax, float preco, int toneladas, int alturaMax, int comprimento) {
        super(peso, velocidadeMax, preco);
        this.motor = new Motor(numCilindros, potencia);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void set(int numCilindros, int potencia, int peso, int velocidadeMax, float preco, int toneladas, int alturaMax, int comprimento) {
        motor.set(numCilindros, potencia);
        super.set(peso, velocidadeMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void print() {
        System.out.println("Caminhão:");
        motor.print();
        super.print();
        System.out.println(" - Toneladas (carga máx): " + toneladas);
        System.out.println(" - Altura Máxima: " + alturaMax + " cm");
        System.out.println(" - Comprimento: " + comprimento + " cm");
    }

    // Getters e setters
    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public int getToneladas() { return toneladas; }
    public void setToneladas(int toneladas) { this.toneladas = toneladas; }

    public int getAlturaMax() { return alturaMax; }
    public void setAlturaMax(int alturaMax) { this.alturaMax = alturaMax; }

    public int getComprimento() { return comprimento; }
    public void setComprimento(int comprimento) { this.comprimento = comprimento; }
}

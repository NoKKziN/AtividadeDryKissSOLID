package questao_6;

public class CarroPasseio extends Veiculo{
    private Motor motor;
    private String cor;
    private String modelo;

    public CarroPasseio() {
        super();
        this.motor = new Motor();
        this.cor = "";
        this.modelo = "";
    }

    public CarroPasseio(int numCilindros, int potencia, int peso, int velocidadeMax, float preco, String cor, String modelo) {
        super(peso, velocidadeMax, preco);
        this.motor = new Motor(numCilindros, potencia);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void set(int numCilindros, int potencia, int peso, int velocidadeMax, float preco, String cor, String modelo) {
        motor.set(numCilindros, potencia);
        super.set(peso, velocidadeMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void print() {
        System.out.println("Carro de Passeio:");
        motor.print();
        super.print();
        System.out.println(" - Cor: " + cor);
        System.out.println(" - Modelo: " + modelo);
    }

    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}

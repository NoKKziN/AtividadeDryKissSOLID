package questao_6;

public class Motor {
    private int numCilindros;
    private int potencia;

    public Motor() {
        this.numCilindros = 0;
        this.potencia = 0;
    }

    public Motor(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    public void set(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    public void print() {
        System.out.println("Motor:");
        System.out.println(" - Número de cilindros: " + numCilindros);
        System.out.println(" - Potência: " + potencia + " HP");
    }

    // Getters e setters
    public int getNumCilindros() { return numCilindros; }
    public void setNumCilindros(int numCilindros) { this.numCilindros = numCilindros; }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia;
    }
}

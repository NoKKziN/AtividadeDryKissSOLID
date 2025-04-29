package questao_4;

public class CalculadoraCientifica extends Calculadora {

    public double raizQuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("Raiz quadrada de número negativo não é permitida.");
        }
        return Math.sqrt(a);
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}

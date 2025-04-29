package questao_7;

public class CalcularSalarioAnual implements CalculadoraSalario {
    public double calcularSalarioAnual(Empregado empregado) {
        return empregado.getSalarioMensal() * 12;
    }
}

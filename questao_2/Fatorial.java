package questao_2;

public class Fatorial {
    public int calcularFatorial(int num) {
        if (num == 0 || num == 1) return 1;

        int resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}


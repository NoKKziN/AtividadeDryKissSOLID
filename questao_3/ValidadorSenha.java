package questao_3;

public class ValidadorSenha {
    public static boolean validarSenha(String senha) {
        return senha.matches("^(?=.*[0-9])(?=.*[A-Z]).{8,}$");
    }
}

import java.util.Scanner;

public class Login {
    private Scanner scanner = new Scanner(System.in);

    public boolean autenticar(String emailDigitado, String senhaDigitada, Usuario usuario) {
        if (usuario.getEmail().equals(emailDigitado) && usuario.getSenhaHash().equals(senhaDigitada)) {
            System.out.println("Login bem-sucedido!");
            return true;
        } else {
            System.out.println("E-mail ou senha incorretos.");
            return false;
        }
    }

    public void solicitarAlteracaoSenha(Usuario usuario) {
        System.out.println("\nIniciando processo de alteração de senha...");
        usuario.alterarSenha();
    }
}
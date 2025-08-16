public class Main {
    public static void main(String[] args) {
        Login sistemaDeLogin = new Login();

        Usuario meuUsuario = new Usuario("1", "teste da Silva", "123.456.789-00", "teste.classe@email.com", "senha123", "Ativo", "2025-08-16", "2025-08-16");

        sistemaDeLogin.autenticar("teste.classe@email.com", "senha123", meuUsuario);

        sistemaDeLogin.solicitarAlteracaoSenha(meuUsuario);

        meuUsuario.visualizarPerfil();
    }
}
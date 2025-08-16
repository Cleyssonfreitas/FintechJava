import java.util.Scanner;

public class Usuario {
    Scanner scanner = new Scanner(System.in);

    // Atributos
    private String idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String senhaHash;
    private String status;
    private String dataCadastro;
    private String dataAtualizacao;

    // Construtor
    public Usuario(String idUsuario, String nome, String cpf, String email, String senhaHash, String status, String dataCadastro, String dataAtualizacao) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senhaHash = senhaHash;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    // Métodos (comportamentos)
    public void visualizarPerfil() {
        System.out.println("### Perfil do Usuário ###");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Status: " + this.status);
        System.out.println("Data de Cadastro: " + this.dataCadastro);
        System.out.println("Data de Atualizacao: " + this.dataAtualizacao);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public void atualizarDados() {
        int opcao;

        System.out.println("\nMétodo atualizarDados() sendo executado.");
        System.out.println("Deseja alterar quais dados?");
        System.out.println("1 - E-mail");
        System.out.println("2 - Desativar a conta");
        System.out.println("0 - Voltar");
        System.out.print("Sua opção: ");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada: Alterar e-mail.");
                System.out.print("Digite o novo e-mail: ");
                scanner.nextLine();
                String novoEmail = scanner.nextLine();
                this.email = novoEmail;
                System.out.println("E-mail alterado com sucesso para: " + this.email);
                break;
            case 2:
                System.out.println("Opção 2 selecionada: Desativar a conta.");
                this.status = "Inativo";
                System.out.println("Status da conta alterado para: " + this.status);
                break;
            case 0:
                System.out.println("Voltando...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    public void alterarSenha() {
        System.out.println("\nMétodo alterarSenha() sendo executado.");
        System.out.print("Digite sua senha atual: ");
        scanner.nextLine();
        String senhaAtual = scanner.nextLine();

        if (this.senhaHash.equals(senhaAtual)) {
            System.out.print("Digite a nova senha: ");
            String novaSenha = scanner.nextLine();
            this.senhaHash = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("A senha atual está incorreta. Operação cancelada.");
        }
    }
}
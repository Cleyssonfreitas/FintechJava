import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("### Iniciando Teste do Sistema Fintech ###");


        System.out.println("\n--- Teste de Usuário e Login ---");

        Usuario meuUsuario = new Usuario("1", "teste da Silva", "123.456.789-00", "teste.classe@email.com", "senha123", "Ativo", "2025-08-16", "2025-08-16");


        Login sistemaDeLogin = new Login();


        sistemaDeLogin.autenticar("teste.classe@email.com", "senha123", meuUsuario);


        sistemaDeLogin.solicitarAlteracaoSenha(meuUsuario);


        meuUsuario.visualizarPerfil();


        System.out.println("\n--- Teste de Conta Bancária ---");

        ContaBancaria minhaConta = new ContaBancaria("98765-4", 1500.75, "Corrente");


        minhaConta.depositar(250.25);
        minhaConta.sacar(100.00);


        System.out.println("\n--- Teste de Investimento ---");

        Investimento meuInvestimento = new Investimento("CDB", 500.00, 1.2);


        meuInvestimento.aplicarInvestimento();
        meuInvestimento.resgatarInvestimento();


        System.out.println("\n--- Teste de Relatório Financeiro ---");

        RelatorioFinanceiro meuRelatorio = new RelatorioFinanceiro();


        meuRelatorio.gerarExtrato();
        meuRelatorio.gerarBalancoAnual();


        System.out.println("\n--- Teste de Notificação ---");

        Notificacao minhaNotificacao = new Notificacao();


        minhaNotificacao.enviarEmail("Seu saque de R$ 100 foi efetuado.");
        minhaNotificacao.enviarSMS("Seu saldo foi atualizado.");

        System.out.println("\n### Teste do Sistema Concluído ###");
        System.out.println("\n\n--- Testando a Herança com as Transações ---");

        System.out.println("\n--- Teste Transação PIX ---");
        TransacaoPix pix = new TransacaoPix("pix001", 150.0, "2025-09-06", "chave.aleatoria@banco.com");
        pix.processar();
        pix.exibirValor();

        System.out.println("\n--- Teste Transação Cartão ---");
        TransacaoCartao cartao = new TransacaoCartao("cartao002", 89.90, "2025-09-06", "Teste da Silva", "12/29", 12345678, "Mastercard");
        cartao.processar();
        cartao.exibirValor();

        System.out.println("\n--- Teste Transação TED ---");
        TransacaoTed ted = new TransacaoTed("ted003", 2500.0, "2025-09-05", "Empresa Exemplo LTDA", "Banco Fintech", 987654);
        ted.processar();
        ted.exibirValor();

        System.out.println("\n\n### Teste do Sistema Concluído ###");

    }
}
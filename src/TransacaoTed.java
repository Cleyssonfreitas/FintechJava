public class TransacaoTed extends Transacao {
    private String titular;
    private String banco;
    private int numeroConta;

    public TransacaoTed(String id, double valor, String data, String titular, String banco, int numeroConta) {
        super(id, valor, data);
        this.titular = titular;
        this.banco = banco;
        this.numeroConta = numeroConta;
    }

    @Override
    public void processar() {
        System.out.println("Processando Transação da conta " + numeroConta);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
public class TransacaoCartao extends Transacao {
    private String titularCartao;
    private String vencimentoCartao;
    private int numeroCartao;
    private String bandeira;

    public TransacaoCartao(String id, double valor, String data, String titularCartao, String vencimentoCartao, int numeroCartao, String bandeira) {
        super(id, valor, data);
        this.titularCartao = titularCartao;
        this.vencimentoCartao = vencimentoCartao;
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    @Override
    public void processar() {
        System.out.println("Processando Transação do cartão: " + numeroCartao);
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String getVencimentoCartao() {
        return vencimentoCartao;
    }

    public void setVencimentoCartao(String vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
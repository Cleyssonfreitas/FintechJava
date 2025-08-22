public class TransacaoPix extends Transacao {
    private String chavePix;

    public TransacaoPix(String id, double valor, String data, String chavePix) {
        super(id, valor, data);
        this.chavePix = chavePix;
    }

    @Override
    public void processar() {
        System.out.println("Processando transação PIX com chave: " + chavePix);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}

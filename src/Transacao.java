public abstract class Transacao {
    protected String id;
    protected double valor;
    protected String data;

    public Transacao(String id, double valor, String data) {
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

    public abstract void processar();

    public void exibirValor() {
        System.out.println("Valor da transação: R$ " + valor);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}



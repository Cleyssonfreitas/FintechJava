public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    private String tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(String numeroConta, double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor) {
        System.out.println("Depositando R$ " + valor + " na conta " + numeroConta);
    }

    public void sacar(double valor) {
        System.out.println("Sacando R$ " + valor + " da conta " + numeroConta);
    }
}

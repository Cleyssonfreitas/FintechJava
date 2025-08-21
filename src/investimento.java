public class Investimento {

    private String tipoInvestimento;
    private double valorAplicado;
    private double taxaJuros;

    public Investimento() {
    }

    public Investimento(String tipoInvestimento, double valorAplicado, double taxaJuros) {
        this.tipoInvestimento = tipoInvestimento;
        this.valorAplicado = valorAplicado;
        this.taxaJuros = taxaJuros;
    }

    public void aplicarInvestimento() {
        System.out.println("Aplicando R$ " + valorAplicado + " em " + tipoInvestimento);
    }

    public void resgatarInvestimento() {
        System.out.println("Resgatando investimento em " + tipoInvestimento);
    }
}

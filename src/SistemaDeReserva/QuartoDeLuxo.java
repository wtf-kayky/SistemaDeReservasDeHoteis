package SistemaDeReserva;
public class QuartoDeLuxo extends  Quarto {

    private double taxaDeServiço = 29.99;

    public QuartoDeLuxo(int numero, double precoPorQuarto, boolean ocupado, double taxaDeServiço) {
        super(numero, precoPorQuarto, ocupado);
        this.taxaDeServiço = taxaDeServiço;
    }

    @Override
    public double calcularValor(int quantidadesDeNoites) {

        double valorTotal = (double) (quantidadesDeNoites * getPrecoPorNoite() + taxaDeServiço);

        System.out.println("Valor a ser pago pelo quarto de luxo " + valorTotal);
        return valorTotal;
    }
}

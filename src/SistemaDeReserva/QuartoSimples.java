package SistemaDeReserva;

public class QuartoSimples extends Quarto{

    private String cama;

    public QuartoSimples(int numero, double precoPorQuarto, boolean ocupado, String cama) {
        super(numero, precoPorQuarto, ocupado);
        this.cama = cama;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    @Override
    public double calcularValor(int quantidadesDeNoites) {
        double valorTotal = (double) (quantidadesDeNoites * getPrecoPorNoite());
        System.out.println("Valor a ser pago para hotel pelo quarto simples "+ valorTotal);

        return valorTotal;
    }
}

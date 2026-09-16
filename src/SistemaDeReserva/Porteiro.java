package SistemaDeReserva;

public class Porteiro {
    public static void main(String[] args) {

        Hospede hospede = new Hospede("kayke", 18);
        QuartoSimples quarto1 = new QuartoSimples(18, 109.99, false, "c/cama");
        QuartoDeLuxo quarto2 = new QuartoDeLuxo(28, 199.90, false, 50);
        Reserva reserva = new Reserva(hospede, quarto1, 5);
        try {

            reserva.calcularReserva();
            reserva.cancelarReserva();
            reserva.cancelarReserva();
        } catch (Exception e) {
            System.out.println("ERRO:" + e.getMessage());
        }
    }
}

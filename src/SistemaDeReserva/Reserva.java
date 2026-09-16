package SistemaDeReserva;

public class Reserva {

    Hospede hospede;
    Quarto quarto;
    int quantidadesDeNoites;
    boolean ativa;

    public Reserva(Hospede hospede, Quarto quarto, int quantidadesDeNoites) {
        if (quantidadesDeNoites <= 0) {
            throw new RuntimeException("Quantidade de noites insuficientes");
        } else if (quarto.isOcupado()) {
            throw new RuntimeException("Quarto ja reservado");
        } else {
            System.out.println("Quarto reservado");
        }
        this.hospede = hospede;
        this.quarto = quarto;
        this.quantidadesDeNoites = quantidadesDeNoites;
        this.ativa = true;

        quarto.reserva();
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getQuantidadesDeNoites() {
        return quantidadesDeNoites;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void cancelarReserva() {
        if (!ativa) {
            throw new RuntimeException("Reserva ja foi  cancelada");
        } else {

            ativa = false;
            quarto.cancelarReserva();
            System.out.println("Este quarto esta disponivel para a reserva ");
        }
    }

    public double calcularReserva() {
        double valor = quarto.calcularValor(quantidadesDeNoites);
        return valor;
    }

    public void reativarReserva() {
        if (ativa) {
            throw new RuntimeException("Esta reserva ja esta ativa ");
        } else if (quarto.isOcupado()) {
            throw new RuntimeException("Este quarto ja esta ocupado");
        } else {
            this.ativa = true;
            quarto.reserva();
            System.out.println("Quarto reservado novamente");
        }
    }
}

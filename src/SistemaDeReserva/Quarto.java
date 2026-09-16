package SistemaDeReserva;

public abstract class Quarto {

    protected int numero;
    protected double precoPorNoite;
    protected boolean ocupado;

    public Quarto(int numero,double precoPorQuarto, boolean ocupado) {
        this.numero = numero;
        this.precoPorNoite = precoPorQuarto;
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void reserva(){
        if(ocupado){
            throw new RuntimeException("Este quarto esta disponivel para reservas");
        }else{
            ocupado = true;
            System.out.println("Reserva concluida com sucesso");
        }
    }
    public void cancelarReserva(){
        if (!ocupado){
            throw new RuntimeException("Não foi possivel cnacelar a reserva deste quarto");
        }else{
            ocupado = false;
            System.out.println("Reserva cancelada ");
        }

    }
    public abstract double calcularValor(int quantidadesDeNoites);
}

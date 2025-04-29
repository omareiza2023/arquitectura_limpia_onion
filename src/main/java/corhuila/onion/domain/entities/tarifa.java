
public class Tarifa {
    private String id;
    private int estrato;
    private double valor;

    public Tarifa(String id, int estrato, double valor) {
        if (estrato < 1 || estrato > 6) {
            throw new IllegalArgumentException("Estrato inválido.");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("La tarifa no puede ser negativa.");
        }
        this.id = id;
        this.estrato = estrato;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public int getEstrato() {
        return estrato;
    }

    public double getValor() {
        return valor;
    }
}
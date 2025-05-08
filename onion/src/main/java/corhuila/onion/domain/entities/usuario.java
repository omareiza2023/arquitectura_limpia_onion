
public class Usuario {
    private String id;
    private String nombre;
    private int estrato;

    public Usuario(String id, String nombre, int estrato) {
        if (estrato < 1 || estrato > 6) {
            throw new IllegalArgumentException("El estrato debe estar entre 1 y 6.");
        }
        this.id = id;
        this.nombre = nombre;
        this.estrato = estrato;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstrato() {
        return estrato;
    }
}
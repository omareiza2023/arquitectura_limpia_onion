import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    private String id;
    private String nombre;
    private int estrato;

    public UsuarioEntity() {}

    public UsuarioEntity(String id, String nombre, int estrato) {
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
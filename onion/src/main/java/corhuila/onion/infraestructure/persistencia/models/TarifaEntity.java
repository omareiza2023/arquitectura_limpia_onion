import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarifas")
public class TarifaEntity {

    @Id
    private String id;
    private int estrato;
    private double valor;

    public TarifaEntity() {}

    public TarifaEntity(String id, int estrato, double valor) {
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
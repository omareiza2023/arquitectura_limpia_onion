
import java.util.Optional;

public interface TarifaRepository {
    void guardar(Tarifa tarifa);
    Optional<Tarifa> buscarPorEstrato(int estrato);
}
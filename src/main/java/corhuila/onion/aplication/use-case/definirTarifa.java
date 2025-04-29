import java.util.UUID;

public class DefinirTarifa {
    private final TarifaRepository tarifaRepository;
    private final TarifaCalculator tarifaCalculator;

    public DefinirTarifa(TarifaRepository tarifaRepository, TarifaCalculator tarifaCalculator) {
        this.tarifaRepository = tarifaRepository;
        this.tarifaCalculator = tarifaCalculator;
    }

    public void ejecutar(int estrato) {
        double valor = tarifaCalculator.calcularPorEstrato(estrato);
        String id = UUID.randomUUID().toString();
        Tarifa tarifa = new Tarifa(id, estrato, valor);
        tarifaRepository.guardar(tarifa);
    }
}
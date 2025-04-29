
public class TarifaCalculator {

    public double calcularPorEstrato(int estrato) {
        switch (estrato) {
            case 1: return 10000;
            case 2: return 12000;
            case 3: return 15000;
            case 4: return 20000;
            case 5: return 25000;
            case 6: return 30000;
            default:
                throw new IllegalArgumentException("Estrato fuera de rango (1-6)");
        }
    }
}

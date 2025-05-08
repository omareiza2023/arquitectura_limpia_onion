@RestController
@RequestMapping("/tarifas")
public class TarifaController {

    private final DefinirTarifa definirTarifa;

    public TarifaController(DefinirTarifa definirTarifa) {
        this.definirTarifa = definirTarifa;
    }

    @PostMapping("/{estrato}")
    public ResponseEntity<String> definirTarifa(@PathVariable int estrato) {
        definirTarifa.ejecutar(estrato);
        return ResponseEntity.ok("Tarifa definida para estrato " + estrato);
    }
}
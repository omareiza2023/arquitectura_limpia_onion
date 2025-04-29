@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CrearUsuario crearUsuario;

    public UsuarioController(CrearUsuario crearUsuario) {
        this.crearUsuario = crearUsuario;
    }

    @PostMapping
    public ResponseEntity<String> crearUsuario(@RequestBody UsuarioRequest request) {
        crearUsuario.ejecutar(request.getId(), request.getNombre(), request.getEstrato());
        return ResponseEntity.ok("Usuario creado correctamente");
    }

    // Clase DTO interna para la petición
    public static class UsuarioRequest {
        private String id;
        private String nombre;
        private int estrato;

        public String getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEstrato() {
            return estrato;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEstrato(int estrato) {
            this.estrato = estrato;
        }
    }
}
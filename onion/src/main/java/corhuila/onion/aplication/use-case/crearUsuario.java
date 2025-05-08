public class CrearUsuario {
    private final UsuarioRepository usuarioRepository;

    public CrearUsuario(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void ejecutar(String id, String nombre, int estrato) {
        Usuario usuario = new Usuario(id, nombre, estrato);
        usuarioRepository.guardar(usuario);
    }
}
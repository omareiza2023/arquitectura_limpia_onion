
public class RegistrarUsuarioUseCase {

    private final UsuarioRepository usuarioRepository;

    public RegistrarUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void ejecutar(Usuario usuario) {
        if (usuarioRepository.existePorIdentificacion(usuario.getTipoIdentificacion(), usuario.getNumeroIdentificacion())) {
            throw new IllegalArgumentException("El usuario ya existe con esta identificación.");
        }
        usuarioRepository.guardar(usuario);
    }
}

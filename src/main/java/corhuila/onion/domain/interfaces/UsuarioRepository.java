import java.util.Optional;

public interface UsuarioRepository {
    void guardar(Usuario usuario);
    Optional<Usuario> buscarPorId(String id);
}
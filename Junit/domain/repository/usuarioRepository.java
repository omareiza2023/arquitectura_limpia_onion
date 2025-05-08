// domain/repository/UsuarioRepository.java
public interface UsuarioRepository {
    void guardar(Usuario usuario);
    boolean existePorIdentificacion(String tipoIdentificacion, String numeroIdentificacion);
}

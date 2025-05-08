// infrastructure/persistence/UsuarioRepositoryImpl.java

import domain.model.Usuario;
import domain.repository.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public boolean existePorIdentificacion(String tipoIdentificacion, String numeroIdentificacion) {
        return usuarios.stream().anyMatch(u ->
                u.getTipoIdentificacion().equals(tipoIdentificacion) &&
                u.getNumeroIdentificacion().equals(numeroIdentificacion)
        );
    }
}

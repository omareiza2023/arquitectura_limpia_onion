package main.java.corhuila.onion.infraestructure.persistencia.repositorios;


import java.util.Optional;

public class UsuarioRepositoryImpl implements UsuarioRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void guardar(Usuario usuario) {
        UsuarioEntity entity = new UsuarioEntity(usuario.getId(), usuario.getNombre(), usuario.getEstrato());
        entityManager.persist(entity);
    }

    @Override
    public Optional<Usuario> buscarPorId(String id) {
        UsuarioEntity entity = entityManager.find(UsuarioEntity.class, id);
        if (entity == null) return Optional.empty();
        Usuario usuario = new Usuario(entity.getId(), entity.getNombre(), entity.getEstrato());
        return Optional.of(usuario);
    }
}
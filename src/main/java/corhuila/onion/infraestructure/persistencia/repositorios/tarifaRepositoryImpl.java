package main.java.corhuila.onion.infraestructure.persistencia.repositorios;

import java.util.Optional;

public class TarifaRepositoryImpl implements TarifaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void guardar(Tarifa tarifa) {
        TarifaEntity entity = new TarifaEntity(tarifa.getId(), tarifa.getEstrato(), tarifa.getValor());
        entityManager.persist(entity);
    }

    @Override
    public Optional<Tarifa> buscarPorEstrato(int estrato) {
        TarifaEntity entity = entityManager
            .createQuery("SELECT t FROM TarifaEntity t WHERE t.estrato = :estrato", TarifaEntity.class)
            .setParameter("estrato", estrato)
            .getResultStream()
            .findFirst()
            .orElse(null);

        if (entity == null) return Optional.empty();
        return Optional.of(new Tarifa(entity.getId(), entity.getEstrato(), entity.getValor()));
    }
}
package br.com.leandrobove.projetofuncionario.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.leandrobove.projetofuncionario.dao.AbstractDao;

public abstract class AbstractDaoImpl<Entity, PK> implements AbstractDao<Entity, PK> {

	@SuppressWarnings("unchecked")
	private final Class<Entity> entityClass = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];

	@PersistenceContext
	private EntityManager entityManager;

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	public void salvar(Entity e) {
		entityManager.persist(e);
	}

	public void atualizar(Entity e) {
		entityManager.merge(e);
	}

	@Override
	public void remover(PK id) {
		entityManager.remove(this.buscarPorId(id));
	}

	@Override
	public Entity buscarPorId(PK id) {
		return entityManager.find(entityClass, id);
	}

	@Override
	public List<Entity> listar() {
		return entityManager.createQuery("from " + entityClass.getSimpleName(), entityClass).getResultList();
	}

	@Override
	public List<Entity> query(String jpql, Object[] params) {
		TypedQuery<Entity> query = entityManager.createQuery(jpql, entityClass);

		for (int i = 0; i < params.length; i++) {
			query.setParameter(i + 1, params[i]);
		}

		return query.getResultList();
	}

	@Override
	public Entity queryOneResult(String jpql, Object[] params) {
		TypedQuery<Entity> query = entityManager.createQuery(jpql, entityClass);

		for (int i = 0; i < params.length; i++) {
			query.setParameter(i + 1, params[i]);
		}

		return query.getSingleResult();
	}

}

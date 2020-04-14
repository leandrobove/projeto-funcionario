package br.com.leandrobove.projetofuncionario.dao;

import java.util.List;

public interface AbstractDao<Entity, PK> {

	void salvar(Entity e);

	void atualizar(Entity e);

	void remover(PK id);

	Entity buscarPorId(PK id);

	List<Entity> listar();

	List<Entity> query(String jpql, Object[] params);

	Entity queryOneResult(String jpql, Object[] params);
}

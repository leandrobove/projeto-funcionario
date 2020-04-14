package br.com.leandrobove.projetofuncionario.service;

import java.util.List;

import br.com.leandrobove.projetofuncionario.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);

	void atualizar(Departamento departamento);

	void remover(Long id);

	Departamento buscarPorId(Long id);

	List<Departamento> buscarTodos();
}

package br.com.leandrobove.projetofuncionario.service;

import java.util.List;

import br.com.leandrobove.projetofuncionario.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);

	void atualizar(Funcionario funcionario);

	void remover(Long id);

	Funcionario buscarPorId(Long id);

	List<Funcionario> buscarTodos();

}

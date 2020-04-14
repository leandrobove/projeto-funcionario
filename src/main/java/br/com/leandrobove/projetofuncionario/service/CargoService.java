package br.com.leandrobove.projetofuncionario.service;

import java.util.List;

import br.com.leandrobove.projetofuncionario.domain.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void atualizar(Cargo cargo);
	
	void remover(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

}

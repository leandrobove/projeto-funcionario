package br.com.leandrobove.projetofuncionario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandrobove.projetofuncionario.dao.FuncionarioDao;
import br.com.leandrobove.projetofuncionario.domain.Funcionario;
import br.com.leandrobove.projetofuncionario.service.FuncionarioService;

@Transactional(readOnly = true)
@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario funcionario) {
		dao.salvar(funcionario);
	}

	@Transactional(readOnly = false)
	@Override
	public void atualizar(Funcionario funcionario) {
		dao.atualizar(funcionario);
	}

	@Transactional(readOnly = false)
	@Override
	public void remover(Long id) {
		dao.remover(id);
	}

	@Override
	public Funcionario buscarPorId(Long id) {
		return dao.buscarPorId(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return dao.listar();
	}

}

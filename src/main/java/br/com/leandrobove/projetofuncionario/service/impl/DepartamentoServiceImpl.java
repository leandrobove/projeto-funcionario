package br.com.leandrobove.projetofuncionario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandrobove.projetofuncionario.dao.DepartamentoDao;
import br.com.leandrobove.projetofuncionario.domain.Departamento;
import br.com.leandrobove.projetofuncionario.service.DepartamentoService;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Departamento departamento) {
		dao.salvar(departamento);
	}

	@Transactional(readOnly = false)
	@Override
	public void atualizar(Departamento departamento) {
		dao.atualizar(departamento);
	}

	@Transactional(readOnly = false)
	@Override
	public void remover(Long id) {
		dao.remover(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Departamento buscarPorId(Long id) {
		return dao.buscarPorId(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Departamento> buscarTodos() {
		return dao.listar();
	}

}

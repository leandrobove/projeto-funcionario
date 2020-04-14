package br.com.leandrobove.projetofuncionario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandrobove.projetofuncionario.dao.CargoDao;
import br.com.leandrobove.projetofuncionario.domain.Cargo;
import br.com.leandrobove.projetofuncionario.service.CargoService;

@Transactional(readOnly = false)
@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDao dao;

	@Override
	public void salvar(Cargo cargo) {
		dao.salvar(cargo);
	}

	@Override
	public void atualizar(Cargo cargo) {
		dao.atualizar(cargo);
	}

	@Override
	public void remover(Long id) {
		dao.remover(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Cargo buscarPorId(Long id) {
		return dao.buscarPorId(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Cargo> buscarTodos() {
		return dao.listar();
	}

}

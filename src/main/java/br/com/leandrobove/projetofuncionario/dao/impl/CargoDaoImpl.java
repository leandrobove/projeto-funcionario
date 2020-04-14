package br.com.leandrobove.projetofuncionario.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.leandrobove.projetofuncionario.dao.CargoDao;
import br.com.leandrobove.projetofuncionario.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDaoImpl<Cargo, Long> implements CargoDao {

}

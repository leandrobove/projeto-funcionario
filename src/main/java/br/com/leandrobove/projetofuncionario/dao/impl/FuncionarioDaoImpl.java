package br.com.leandrobove.projetofuncionario.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.leandrobove.projetofuncionario.dao.FuncionarioDao;
import br.com.leandrobove.projetofuncionario.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDaoImpl<Funcionario, Long> implements FuncionarioDao {

}

package br.com.leandrobove.projetofuncionario.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "T_CARGO")
public class Cargo extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "fk_id_departamento")
	private Departamento departamento;

	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;

	public Cargo() {
	}

	public Cargo(String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}

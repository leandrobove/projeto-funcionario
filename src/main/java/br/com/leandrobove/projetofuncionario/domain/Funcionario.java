package br.com.leandrobove.projetofuncionario.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "T_FUNCIONARIO")
public class Funcionario extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true)
	private String nome;

	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;

	@Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;

	@Column(name = "data_saida", nullable = true, columnDefinition = "DATE")
	private LocalDate dataSaida;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_endereco")
	private Endereco endereco;

	@ManyToOne
	@JoinColumn(name = "fk_id_cargo")
	private Cargo cargo;

	public Funcionario() {
	}

	public Funcionario(String nome, BigDecimal salario, LocalDate dataEntrada, LocalDate dataSaida, Endereco endereco,
			Cargo cargo) {
		this.nome = nome;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.endereco = endereco;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}

package com.obed.helpdesk.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.obed.helpdesk.domain.Chamado;


public class ChamadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	
    @JsonFormat(pattern = "dd/MM/yyy")
    private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyy")
    private LocalDate dataFechamento =LocalDate.now();
	private Integer prioridade;
	private Integer status;
	private String titulo;
	private String observacaoes;
	private Integer tecnico;
	private Integer cliente;
	private String nomeTecnico;
	private String nomeCliente;
	
	public ChamadoDTO() {
		super();
		
	}

	public ChamadoDTO(Chamado obj) {
		
		this.id = obj.getId();
		this.dataAbertura = obj.getDataAbertura();
		this.dataFechamento = obj.getDataFechamento();
		this.prioridade = obj.getPrioridade().getCodigo();
		this.status = obj.getStatus().getCodigo();
		this.titulo = obj.getTitulo();
		this.observacaoes = obj.getObservacaoes();
		this.tecnico = obj.getTecnico().getId();
		this.cliente = obj.getCliente().getId();
		this.nomeTecnico = obj.getTecnico().getNome();
		this.nomeCliente = obj.getCliente().getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservacaoes() {
		return observacaoes;
	}

	public void setObservacaoes(String observacaoes) {
		this.observacaoes = observacaoes;
	}

	public Integer getTecnico() {
		return tecnico;
	}

	public void setTecnico(Integer tecnico) {
		this.tecnico = tecnico;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
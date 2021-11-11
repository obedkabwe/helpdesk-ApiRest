package com.obed.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obed.helpdesk.domain.Chamado;
import com.obed.helpdesk.domain.Cliente;
import com.obed.helpdesk.domain.Tecnico;
import com.obed.helpdesk.domain.enums.Perfil;
import com.obed.helpdesk.domain.enums.Prioridade;
import com.obed.helpdesk.domain.enums.Status;
import com.obed.helpdesk.repositories.ChamadoRepository;
import com.obed.helpdesk.repositories.ClienteRepository;
import com.obed.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "obed kabwe", "3947547543 ","kabwe@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "nathan ngoya", "38644383", "oberson@gmail.com", "123");
		
		Chamado c1 = new Chamado(null,Prioridade.MEDIA,Status.ANDAMENTO,"Chamado 01" , "Primeiro chamada", cli1, tec1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

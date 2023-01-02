package com.associacaoCasaCompanheira.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.associacaoCasaCompanheira.controller.AssociacaoController;
import com.associacaoCasaCompanheira.model.Associacao;
import com.associacaoCasaCompanheira.repository.AssociacaoRepository;


/**
 * Esta Clase Tem a Responsabilidade de Fazer as 
 * Operacaoes de Transacoes com o Banco de Dados (BD) 
 * E tambem algumas Accoes Uteis
 * 
 * @author Jose Euclides - Programador
 * @see AssociacaoRepository 
 * @see AssociacaoService
 * @see AssociacaoController
 * @version 1.0
 *
 */


@Service
public class AssociacaoService {

	//Instanciamento automatico da AssociacaoRepository gerido pelo Spring
	@Autowired
	private AssociacaoRepository ar;
	
	@Autowired
	private Associacao assoc;
	
	@Autowired
	private Associacao assoc2;
	
	
	// Este Metodo é responsavel Por fazer o usuario entrar no
	// sistema ou nao
	public Associacao entrarNoSistema(Associacao associacao) {
		
		String refer = associacao.getReferencia();
		Optional<Associacao> associacao2 = ar.findByReferencia(refer);
		
		
		if(!associacao2.isPresent()) {
			
			assoc2.setData(null);
			assoc2.setFoiSalvo(false);
			assoc2.setGenero(null);
			assoc2.setId(null);
			assoc2.setIdade(0);
			assoc2.setNome(null);
			assoc2.setPassword(null);
			assoc2.setReferencia(null);
			assoc2.setExisteUsuario(false);
			
			return assoc2;
		}else {
			assoc2 =  associacao2.get();
			return assoc2;
			
		}
	}
	
	
	
	// Este Metodo é responsavel Por cadastrar Novos Usuarios
	public Associacao cadastrar(Associacao associacao) {
		
		
			associacao.setFoiSalvo(true);
			associacao.setExisteUsuario(true);
			associacao.setDataLocal(LocalDateTime.now());
			associacao.setReferencia("Assoc"+associacao.getPassword());
			associacao.setContrato("Aceite");
			System.out.println("Cadastrou Tudo");
			assoc = ar.save(associacao);
		
		return assoc;
	}
}

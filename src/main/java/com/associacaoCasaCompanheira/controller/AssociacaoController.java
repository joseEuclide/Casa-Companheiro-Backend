package com.associacaoCasaCompanheira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.associacaoCasaCompanheira.model.Associacao;
import com.associacaoCasaCompanheira.service.AssociacaoService;

/**
 * Classe Responsavel por Controlar Todas Requisicoes Da APP
 * 
 * 
 * @author Jose Euclides - Programador
 * @version 1.0
 *
 */

@CrossOrigin(origins = "*")
@RestController
public class AssociacaoController {
	
  @Autowired
  private AssociacaoService service;
  
  @Autowired
  private Associacao assoc;
	
  /*
   * Este MEtodo é usado pra saber se Existe 
   * Um Usuario Com A Referencia Informado
   * Caso Exista Vai  retornar um boolean como
   * true dizendo que ele existe, caso nao retorna 
   * um boolean false indicando que nao existe Esse 
   * Usuario	
   */
  
  
  @PostMapping(value="/entrar",consumes = "application/json",produces = "application/json")	
  public ResponseEntity<Associacao> entrtarNoSistema(@RequestBody Associacao associacao){
	  assoc = service.entrarNoSistema(associacao);
	  return new ResponseEntity<Associacao>(assoc, HttpStatus.OK);
  }
  
  
  // Metodo Responsavel por cadastrar novos usuarios no Site
  
  @PostMapping(value="/cadastrar",consumes = "application/json",produces = "application/json")	
  public ResponseEntity<Associacao> cadastrarUsuario(@RequestBody Associacao associacao){
	  
	  assoc =  service.cadastrar(associacao);
	  return new ResponseEntity<Associacao>(assoc, HttpStatus.OK);
  }
  
  

}

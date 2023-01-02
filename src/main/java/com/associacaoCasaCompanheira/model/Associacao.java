package com.associacaoCasaCompanheira.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.associacaoCasaCompanheira.service.AssociacaoService;

/**
 * 
 * Esta Classe tem o objectivo de ser a 
 * Ponte Entre a Base de Dados (BD) e o Backend,
 * Transacionado Dados entre o Backend e a BD e 
 * tambem é a ponte entre o Backend e o FrontEnd
 * 
 * @author Jose Eucliides - Programador
 * @see </a>AssociacaoController</>
 * @see AssociacaoService
 * @version 1.0
 *
 */

@Entity
public class Associacao implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Long id;
	
	
	private String nome;
	private int idade;
	private String  genero;
	private String  referencia;
	private boolean existeUsuario;
	private boolean foiSalvo;
	private LocalDateTime dataLocal;
	private String password;
	private String contrato;
	private String bi;
	private String provincia;
	private String municipio;
	private LocalDate data;
	private String servico;
	private String profissao;
	private String telefone;
	private String email;
	
	
	
	
	
	
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalDateTime getDataLocal() {
		return dataLocal;
	}
	public void setDataLocal(LocalDateTime dataLocal) {
		this.dataLocal = dataLocal;
	}
	public String getBi() {
		return bi;
	}
	public void setBi(String bi) {
		this.bi = bi;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isFoiSalvo() {
		return foiSalvo;
	}
	public void setFoiSalvo(boolean foiSalvo) {
		this.foiSalvo = foiSalvo;
	}
	
	public boolean isExisteUsuario() {
		return existeUsuario;
	}
	public void setExisteUsuario(boolean existeUsuario) {
		this.existeUsuario = existeUsuario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
}

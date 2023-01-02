package com.associacaoCasaCompanheira.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.associacaoCasaCompanheira.model.Associacao;


/**
 * Interface Responsavel Pela Transacao Com A BD
 * 
 * @author Jose Euclides - Prograador
 * @see AssociacaoService
 * @version 1.0
 *
 */

@Repository
public interface AssociacaoRepository extends JpaRepository<Associacao, Long>{

	public Optional<Associacao> findByReferencia(String referencia);
}

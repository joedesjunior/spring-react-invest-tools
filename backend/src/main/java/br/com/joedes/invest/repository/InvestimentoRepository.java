package br.com.joedes.invest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.joedes.invest.domain.*;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
	
	

}

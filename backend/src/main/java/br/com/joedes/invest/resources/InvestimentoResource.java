package br.com.joedes.invest.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.joedes.invest.domain.Investimento;
import br.com.joedes.invest.repository.InvestimentoRepository;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoResource {
	
	@Autowired
	private InvestimentoRepository investimentoRepository; 

	@GetMapping
	public List<Investimento> listarTodos() {
		return investimentoRepository.findAll();
	}
	
	@GetMapping(value = "/{codigo}")
	public Investimento buscarPeloCodigo(@PathVariable Long codigo) {
		return investimentoRepository.findById(codigo).orElseThrow(null);
	}
	
	@DeleteMapping
	public void removerInvestimento(@PathVariable Long codigo) {
		investimentoRepository.deleteById(codigo);
	}
	
	@PostMapping
	public Investimento cadastrarInvestimento(@RequestBody Investimento investimento) {
		return investimentoRepository.save(investimento); 
	}

}

package br.com.joedes.invest.resources;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.joedes.invest.domain.TipoInvestimento;
import br.com.joedes.invest.repository.TipoInvestimentoRepository;

@RestController
@RequestMapping(value = "/tipoInvestimento")
public class TipoInvestimentoResource {
	
	private TipoInvestimentoRepository tipoInvestimentoRepository; 
	
	@GetMapping
	public List<TipoInvestimento> buscarTodosTipoInvestimento() {
		return tipoInvestimentoRepository.findAll();
	}
	
	@GetMapping(value = "/{codigo}")
	public TipoInvestimento buscarTipoInvestimentoPeloCodigo(@PathVariable Long codigo) {
		return tipoInvestimentoRepository.findById(codigo).orElseThrow(null);
	}
	
	@DeleteMapping
	public void deleteTipoInvestimento(@PathVariable Long codigo) {
		tipoInvestimentoRepository.deleteById(codigo);
	}
	
	
	@PostMapping
	public TipoInvestimento deletarTipoInvestimento(@RequestBody TipoInvestimento tipoInvestimento) {
		return tipoInvestimentoRepository.save(tipoInvestimento);
	}
	

}

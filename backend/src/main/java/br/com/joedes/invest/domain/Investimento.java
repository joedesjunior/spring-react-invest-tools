package br.com.joedes.invest.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Investimento {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String codigoAtivo; 
	
	private Double valorCota;
	
	private int quantidadeCota; 
	
	private LocalDate dataCompra; 
	
	@ManyToOne
	@JoinColumn(name = "fk_codigo_categoria")
	private TipoInvestimento tipoInvestimento; 

}

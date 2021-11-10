package br.com.pc3.semana2;

public class DataPadraoBrasil {
	private Integer dia;
	private Integer mes;
	private Integer ano;
	public DataPadraoBrasil(Integer dia, Integer mes, Integer ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}

}

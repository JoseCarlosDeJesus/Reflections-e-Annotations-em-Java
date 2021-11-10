package br.com.pc3.semana2;

public class Taxi extends Carro {
	private static final double PERCENTUAL = 0.025;

	private String areaAtuacao;
	private String tipo;
	private String companhia;

	public Taxi() {
	}

	public Taxi(String placa, double valor, String companhia) {
		super(placa, valor);
		this.companhia = companhia;
	}
	
	public double calcularIpva(double valor) {
		return valor * PERCENTUAL;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

}

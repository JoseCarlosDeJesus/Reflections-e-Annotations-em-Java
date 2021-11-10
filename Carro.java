package br.com.pc3.semana2;

public class Carro {

	private static final double PERCENTUAL = 0.035;

	private String placa;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String marca;
	private String modelo;
	private String cor;
	private Double valor;

	public Carro() {
	}

	public Carro(String placa) {
		this.placa = placa;
	}

	public Carro(String placa, double valor) {
		this.placa = placa;
		this.valor = valor;
	}

	public double calcularIpva() {
		return valor * PERCENTUAL;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}

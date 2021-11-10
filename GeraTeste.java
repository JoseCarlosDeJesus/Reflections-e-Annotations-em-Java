package br.com.pc3.semana2;

public class GeraTeste {
	public static void main(String[] args) throws ClassNotFoundException {
		Gera g = new Gera();
		Carro carro = g.instanciarClasse(Class.forName("br.com.pc3.semana2.Carro"));
		carro.setPlaca("JKK0909");
		System.out.println(carro.getPlaca());
	}
}
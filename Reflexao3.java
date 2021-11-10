package br.com.pc3.semana2;

public class Reflexao3 {

	public static void main(String[] args) throws ClassNotFoundException{
		ExaminaClasse.examina(Class.forName("br.com.pc3.semana2.Carro"));
		
		ExaminaClasse.examina(Class.forName("java.util.concurrent.ConcurrentNavigableMap"));

	}

}

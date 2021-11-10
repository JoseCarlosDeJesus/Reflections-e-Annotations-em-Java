package br.com.pc3.semana2;

public class Reflexao1 {

	public static void main(String[] args) {
		Integer i = new Integer(89);
		
		System.out.println(i.getClass());
		
		Class c = i.getClass();
		System.out.println(c);
		
		Carro carro1 = new Carro();
		Class c1 = carro1.getClass();
		
		System.out.println(c1);

	}

}

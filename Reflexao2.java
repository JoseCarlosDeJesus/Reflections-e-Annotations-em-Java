package br.com.pc3.semana2;

public class Reflexao2 {

	public static void main(String[] args) {
		/*
		 * try { System.out.println(Class.forName("br.com.pc3.Carro"));
		 * 
		 * }catch (ClassNotFoundException e) { System.out.println(e.getMessage()); }
		 * 
		 * Class c1 = Double.TYPE; System.out.println(c1);
		 * 
		 * Class c2 = Integer.TYPE; System.out.println(c2);
		 * 
		 * Class c3 = Void.TYPE; System.out.println(c3);
		 * 
		 * Class c4 = br.com.pc3.semana2.Carro.class.getSuperclass();
		 * System.out.println(c4);
		 * 
		 * Class c5 = br.com.pc3.semana2.CarroHibrido.class.getSuperclass();
		 * System.out.println(c5);
		 */

		Class<?>[] c3 = Character.class.getClasses();
		for (Class cs : c3) {
			System.out.println(cs.getName());
		}
		
		System.out.println("getDeclaredClasses");

		Class<?>[] c4 = Character.class.getDeclaredClasses();
		for (Class cs : c4) {
			System.out.println(cs.getName());
		}

		/*
		 * Class<?>[] c3 = br.com.pc3.semana2.Carro.class.getClasses(); for (Class cs :
		 * c3) { System.out.println(cs.getName()); }
		 */

	}

}

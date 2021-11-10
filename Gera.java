package br.com.pc3.semana2;

public class Gera {
	@SuppressWarnings({ "unchecked", "deprecation" })
	public <T> T instanciarClasse(Class<?> classe) {
		T obj = null;
		try {
			obj = (T) Class.forName(classe.getName()).newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e1) {
			return null;
		}
		return obj;
	}

}

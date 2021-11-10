package br.com.pc3.semana2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface MinhaAnotacao {
	String matricula();

	String nome();

	int idade();

	String[] novosNomes();
}

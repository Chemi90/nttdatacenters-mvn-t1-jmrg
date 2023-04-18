package com.nttdata.mvn;

/**
 * Metodo main donde se llama al metodo Password.
 *
 */
public class App {
	public static void main(String[] args) {

		Password p1 = new Password();

		System.out.println(p1.creationPass(10));
	}
}
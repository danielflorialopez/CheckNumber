package com.alumne.checknumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * Classe per a testejar la classe CheckNumber. Té tres proves unitàries 
 * per a provar si el número és positiu, negatiu o zero
 * @author dani
 *
 */
class TestCheckNumber {

	@Test
	void testPositiu() {
		CheckNumber checknumber;
		double resultatEsperat, resultatActual;
		
		checknumber = new CheckNumber(5);
		resultatEsperat = 1;
		resultatActual = checknumber.comprovaSigne();
		
		assertEquals(resultatEsperat, resultatActual, "Test passat. Número positiu");
	}
	
	@Test
	void testNegatiu() {
		CheckNumber checknumber;
		double resultatEsperat, resultatActual;
		
		checknumber = new CheckNumber(-5);
		resultatEsperat = -1;
		resultatActual = checknumber.comprovaSigne();
		
		assertEquals(resultatEsperat, resultatActual,  "Test passat. Número negatiu");
	}
	
	@Test
	void testIguals() {
		CheckNumber checknumber;
		double resultatEsperat, resultatActual;
		
		checknumber = new CheckNumber(0);
		resultatEsperat = 0;
		resultatActual = checknumber.comprovaSigne();
		
		assertEquals(resultatEsperat, resultatActual, "Test passat. Zero");
 	}
}

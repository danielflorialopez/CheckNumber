package com.alumne.checknumber;

/**
 * Classe on passem un double per a comprovar quin tipus d'enter és
 * @author dani
 * 
 */
public class CheckNumber {
	
	private double number;
	
	/**
	 * 
	 * @param num	passem un double i li assigna el seu valor a number
	 */
	public CheckNumber(double num) {
		this.number = num;
	}
	
	/**
	 * Comprova si number és un número positiu, negatiu o zero
	 * @return		1, -1 o 0 en funció de quin tipus d'enter sigui
	 */
	public double comprovaSigne() {
		double status;
		
		if(this.number < 0) status = -1;
		else if(this.number == 0) status = 0;
		else status = 1;
		
		return status;
	}
} 

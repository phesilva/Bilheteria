package View;

import Controller.controle;

public class Principal {

	public static void main(String[] args) {
		for(int i  = 1; i<=300;i++) {
			int qtd = (int)((Math.random()*4)+1);
			controle sistem = new controle(qtd,i);
			 sistem.start();
		}
	}

}


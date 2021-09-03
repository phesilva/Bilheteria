package Controller;

public class controle extends Thread {
	
	//variaveis globais
	private int qtd;
	private int cod;
	private static int Ingressos = 100;
	private int confirm = 0;
	
	public controle(int qtd, int cod) {
		this.qtd = qtd;
		this.cod = cod;
	}
	
	@Override
	public void run() {
		logar();
		if(confirm == 0) {
			comprar();
			validacao();
		}
	}
	private void logar() {
		int logar = (int)((Math.random()*1951)+50);
		try {
			sleep(logar);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	private void comprar() {
		int Compra = (int)((Math.random()*2000)+1000);
		try {
			sleep(Compra);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		if(Compra > 2500) {
			System.out.println(cod+"Excedeu as tentativas de compra! "+Compra+"ms");
			cod = -1;
		}
	}
	private void validacao() {
		if(Ingressos >= qtd) {
			Ingressos -= qtd;
			System.out.println(cod+"conseguiu comprar"+qtd+"ingressos");
			System.out.println("Restam"+Ingressos+"ingressos");
		}else {
			System.out.println(cod+"não conseguiu comprar ingressos");
		}
	}
	
}

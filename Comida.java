package br.robot.poo;

public class Comida {

	private String nome;
	private int energia;
	static int status;// 0 = consumida  | 1 =  nao consumida
	
	Comida(String nome, Integer energia){
		this.nome = nome;
		this.energia = energia;
		Comida.setStatus(1);	//define se a comida foi consumida			
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static int getStatus() {
		return status;
	}
	public static void setStatus(int status) {
		Comida.status = status;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
}

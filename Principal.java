package br.robot.poo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot("Megatron",'m');
		r.mover();
		r.mostrarEstado();
		r.rotacionarEsquerda();
		//r.setNivelBateria(23);
		Comida c = new Comida("Apple", 1);
		r.comer(c);
		r.comer(c);
		r.mostrarEstado();
	}

}

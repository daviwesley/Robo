package br.robot.poo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot("Megatron",'m');
		//r.mover();
		//r.mostrarEstado();
		Comida c = new Comida("Reubber", 23);
		r.comer(c);
		System.out.println(Comida.getStatus());
		r.comer(c);
	}

}

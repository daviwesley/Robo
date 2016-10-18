package br.robot.poo;


public class Robot  {

	private String nome;
	private char sexo;
	private int nivelBateria;
    private int X;
    private int Y;
	private int rotacao;//vai dizer se estar a esquerda ou direita
	
	
	Robot(String nome,char sexo){
		setNome(nome);
		setSexo(sexo);
		setNivelBateria(100);
		setRotacao(2);
		setY(0);
		setX(0);
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	int comer(Comida c){
		if(Comida.getStatus() == 0){
			System.out.println("[!]Esse alimento já foi consumido");
			return 0;
		}
		//Comida c= new Comida(nome,energia);
		int tempBateria = getNivelBateria();
		int total = tempBateria + c.getEnergia();
		setNivelBateria(total);
		if(getNivelBateria() >= 100){
			setNivelBateria(100);
		}
		System.out.println("[+]" + c.getNome() + " Consumida");
		Comida.setStatus(0);
		return 1;
	}
	
    void mover(){
    	if(getNivelBateria() <= 0){
    		System.out.println("[!]Nivel crítico de bateria");
    	}
    	else{
    		int tempRotacao = getRotacao();
    		if (tempRotacao == 1){//mover para o norte
    			if(getNivelBateria() <= 0){
    	    		System.out.println("[!]Nivel crítico de bateria");
    	    	}else{
    	    		int tempY = getY();
        			setY(tempY+10);    	
        			int nivel = getNivelBateria();
        			setNivelBateria(nivel-1);
    	    	}
    		}
            if (tempRotacao == 2){//mover para o leste
            	if(getNivelBateria() <= 0){
    	    		System.out.println("[!]Nivel crítico de bateria");
    	    	}else{
    	    		int tempX = getX();
        			setX(tempX+10);    	
        			int nivel = getNivelBateria();
        			setNivelBateria(nivel-1);
    	    	}
            	
    		}
            if (tempRotacao == 3){//mover para o sul
            	if(getNivelBateria() <= 0){
    	    		System.out.println("[!]Nivel crítico de bateria");
    	    	}else{
    	    		int tempY = getY();
        			setY(tempY-10);
        			int nivel = getNivelBateria();
        			setNivelBateria(nivel-1);
    	    	}
    		}
            if (tempRotacao == 4){//mover para o oeste
            	if(getNivelBateria() <= 0){
    	    		System.out.println("[!]Nivel crítico de bateria");
    	    	}else{
    	    		int tempX = getX();
        			setX(tempX-10);
        			int nivel = getNivelBateria();
        			setNivelBateria(nivel-1);
    	    	}
            	
    		}
    	}
    }
	
    void rotacionarEsquerda(){
    	int tempRotacao = getRotacao();
    	if(tempRotacao == 1 ){
    		setRotacao(4);
    	}
    	else{
    		setRotacao(tempRotacao-1);
    	}
    }
    
    void rotacionarDireita(){
    	int tempRotacao = getRotacao();
    	if(tempRotacao == 4 ){
    		setRotacao(1);
    	}
    	else{
    		setRotacao(tempRotacao+1);
    	}
    }
	public int getNivelBateria() {
		return nivelBateria;
	}
    void mostrarEstado(){
    	System.out.println("[+]X= " + getX() + " Y=" + getY() + " Rotacao=" + getRotacao() + " Nivel de Bateria=" + getNivelBateria());
    }
	
    void mostrarSexo(){
    	if(sexo == 'm'){
    		System.out.println("[+]Seu Robô é masculino");
    	}else{
    		System.out.println("[+]Seu Robô é feminino");
    	}
    }

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getRotacao() {
		return rotacao;
	}

	public void setRotacao(int rotacao) {
		this.rotacao = rotacao;
	}
	
	
}

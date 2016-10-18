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
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	void comer(String nome, Integer energia){
		Comida c= new Comida(nome,energia);
		int tempNivel = getNivelBateria();
	}
	
	void girarEsquerda(){
		if(getNivelBateria() <= 0){
    		System.out.println("[!]Nivel crítico de bateria");
    	}
		
	}
    void girarDireita(){
    	if(getNivelBateria() <= 0){
    		System.out.println("[!]Nivel crítico de bateria");
    	}
	    
	}
    
    void mover(int X, int Y){
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
    	    	}
    		}
            if (tempRotacao == 2){//mover para o leste
            	if(getNivelBateria() <= 0){
    	    		System.out.println("[!]Nivel crítico de bateria");
    	    	}else{
    	    		int tempX = getX();
        			setY(tempX+10);    	    		
    	    	}
            	
    		}
            if (tempRotacao == 3){//mover para o sul
            	if(getNivelBateria() <= 0){
    	    		System.out.println("[!]Nivel crítico de bateria");
    	    	}else{
    	    		int tempY = getY();
        			setY(tempY-10);
    	    	}
    		}
            if (tempRotacao == 4){//mover para o oeste
            	if(getNivelBateria() <= 0){
    	    		System.out.println("[!]Nivel crítico de bateria");
    	    	}else{
    	    		int tempX = getX();
        			setY(tempX-10);
    	    	}
            	
    		}
    	}
    }
	

	public int getNivelBateria() {
		return nivelBateria;
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

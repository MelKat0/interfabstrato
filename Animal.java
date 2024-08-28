package aula5abstrata;

public abstract class Animal {

	String nome;
	String sexo;
	String raça;
	
	public abstract void dormir();
	public abstract void caminhar();
	public abstract void correr();
	public abstract void emitirSom();
	
	public String getNome() {
		return nome;
	}
	public void setNome( String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo( String sexo) {
		this.sexo = sexo;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça( String raça) {
		this.raça = raça;
	}
}

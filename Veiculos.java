package aula5abstrata;

public abstract class Veiculos {
	
	String placa;
	String modelo;
	String cor;
	int ano;
	
	public abstract void acelerar();
	public abstract void frear();
	public abstract void virar();
	public abstract void ligar();
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}

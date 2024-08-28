package aula5abstrata;

public class Carro extends Veiculos{

	@Override
	public void acelerar() {
		System.out.println("Acelerando");
	}
	@Override
	public void frear() {
		System.out.println("Freando");
	}
	@Override
	public void virar() {
		System.out.println("Virando");
	}
	@Override
	public void ligar() {
		System.out.println("Ligando");
	}
}

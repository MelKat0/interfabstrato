package aula5abstrata;

public class PrincipalVeiculos {

	public static void main(String[] args) {
		Onibus bus = new Onibus();
		Carro car = new Carro();
		
		car.setPlaca("FAZ7791");
		car.setModelo("Fluence");
		car.setCor("Preto");
		car.setAno(2007);
		
		bus.setPlaca("BUS5454");
		bus.setModelo("Amarelinho");
		bus.setCor("Amarelo");
		bus.setAno(1999);
		
		System.out.println("****CARRO****");
		car.acelerar();
		car.frear();
		car.virar();
		car.ligar();
		System.out.println("*************");
		System.out.println(car.getPlaca());
		System.out.println(car.getModelo());
		System.out.println(car.getCor());
		System.out.println(car.getAno());
		
		System.out.println("****BUSÃO****");
		bus.acelerar();
		bus.frear();
		bus.virar();
		bus.ligar();
		System.out.println("*************");
		System.out.println(bus.getPlaca());
		System.out.println(bus.getModelo());
		System.out.println(bus.getCor());
		System.out.println(bus.getAno());
		
		System.out.println("*************");
		

	}

}

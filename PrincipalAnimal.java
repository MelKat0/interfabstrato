package aula5abstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo();
		Leao leao = new Leao();
		Tigre tigre = new Tigre();
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		
		lobo.setNome("Edward");
		lobo.setSexo("M");
		lobo.setRaça("Cinzento");
		
		leao.setNome("Alex");
		leao.setSexo("M");
		leao.setRaça("Africano");
		
		tigre.setNome("Kumal");
		tigre.setSexo("M");
		tigre.setRaça("Siberiano");
		
		dog.setNome("Élvis");
		dog.setSexo("M");
		dog.setRaça("Pug");
		
		cat.setNome("Lili");
		cat.setSexo("F");
		cat.setRaça("Malhado");
		
		System.out.println("-------ANIMAIS-------");
		System.out.println("LOBO:");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		System.out.println("---------------------");
		System.out.println(lobo.getNome());
		System.out.println(lobo.getSexo());
		System.out.println(lobo.getRaça());
		System.out.println("---------------------");
		System.out.println("LEÃO:");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		System.out.println("---------------------");
		System.out.println(leao.getNome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getRaça());
		System.out.println("---------------------");
		System.out.println("TIGRE:");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		System.out.println("---------------------");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getSexo());
		System.out.println(tigre.getRaça());
		System.out.println("---------------------");
		System.out.println("CACHORRO:");
		dog.dormir();
		dog.caminhar();
		dog.correr();
		dog.emitirSom();
		System.out.println("---------------------");
		System.out.println(dog.getNome());
		System.out.println(dog.getSexo());
		System.out.println(dog.getRaça());
		System.out.println("---------------------");
		System.out.println("GATO:");
		cat.dormir();
		cat.caminhar();
		cat.correr();
		cat.emitirSom();
		System.out.println("---------------------");
		System.out.println(cat.getNome());
		System.out.println(cat.getSexo());
		System.out.println(cat.getRaça());
		System.out.println("---------------------");

	}

}

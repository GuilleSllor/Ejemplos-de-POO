package EjemplosPOO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animales miAnimales=new Animales(15);
		miAnimales.jose(435);
		miAnimales.mostraredad();
		miAnimales.nombre="josean";
		miAnimales.edad=25;
		miAnimales.caracteristicas();
		Animales miAnimales2 = new Animales(3);
		miAnimales2.nombre="lara";
		miAnimales2.edad=15;
		miAnimales2.caracteristicas();
		System.out.println("Animal 1 ID: "+miAnimales.iD+"\nAnimal 2 ID: "+miAnimales2.iD);
	}

}

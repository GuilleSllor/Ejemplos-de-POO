package EjemplosPOO;
//atributos

 class Animales {
 String nombre;
 static int iD;
 int edad;

//metodos
public Animales(int age) {
	edad=age;
	iD++;
}
public Animales() {
	
}
static void jose(int edad) {
	edad=24;
	
}
public void mostraredad() {
	System.out.println(edad);
	
}
public void caracteristicas()
{
	System.out.println(nombre+iD+edad);
}

}

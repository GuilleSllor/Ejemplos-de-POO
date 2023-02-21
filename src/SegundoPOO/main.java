package SegundoPOO;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona jose = new Persona();
		jose.edad=18;
		jose.nombre ="jose antonio";
		jose.estatura=2.12;
		jose.saludar();
		jose.cumplirAnios();
		System.out.println("cumpliras " + jose.edad + " años");
		System.out.println("¿Cuanto has crecido?");
		double incremento =new Scanner(System.in).nextDouble();
		System.out.println("tu altura es " + jose.estatura + incremento);
	}

}

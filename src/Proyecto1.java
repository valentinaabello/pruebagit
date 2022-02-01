import java.util.Scanner; // primero importo java.util.Scanner

public class Proyecto1 {
	public static Scanner s = new Scanner(System.in); // luego la menciono dentro de la clase
	
	public static void VerificarEdad(int edad) {

		if (edad >= 18) { // se verifica si la persona es mayor de edad
				System.out.println("Es una persona mayor de edad");
			}else { // en caso contrario
				System.out.println("Es una persona menor de edad");
			}
	}
	
	public static void IntegrantesFamilia(int integrantes) {
		switch(integrantes) {
		case 1:
			System.out.println("Solo 1 integrante");
			break;
		case 2:
			System.out.println("2 integrantes");
			break;
		case 3:
			System.out.println("3 integrantes");
			break;
		case 4:
			System.out.println("4 integrantes");
			break;
		}
	}
	
	public static void main(String[] args) {
		
	System.out.println("Ingrese la cantidad de personas que viven con usted: ");
	int integrantes = Integer.parseInt(s.nextLine()); // ingresa la cantidad de personas
	
	for (int i = 1; i < integrantes+1; i++) { // se pregunta la edad para cada uno de los integrantes
		System.out.println("Ingrese edad del integrante " +i);
		int edad = Integer.parseInt(s.nextLine());
		VerificarEdad(edad); //se verifica la edad
	}
	IntegrantesFamilia(integrantes);
	
	}
		

}

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		menuPrincipal();
	}
	public static void menuPrincipal(){
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		while (opcion != 3){
			System.out.println("BIENVENIDO A QUIEN ES QUIEN");
			System.out.println("\tJUGAR\n\tINSTRUCCIONES\n\tSALIR");
			opcion = sc.nextInt();
			switch(opcion){
			case 1:
				menuPartida();
				break;
			case 2:
				//intrucciones();
				break;
			}
		}
	}
	public static void menuPartida(){
		Scanner sc = new Scanner(System.in);
		Juego j = new Juego();
		Personaje personajeQueAcertar = eligePersonajeQueAcertar(j);
		
		j.muestraPersonajesAcertados();
		personajeQueAcertar.mostrarDatos();
		j.eligePregunta(personajeQueAcertar);
		boolean victoria = j.adivinar(personajeQueAcertar);
		if (victoria == true){
			System.out.println("¡HAS GUANYAT!");
		}else{
			System.out.println("¡HAS PERDUT!");
		}
	}
	public static Personaje eligePersonajeQueAcertar(Juego j){
		int randomNumber = (int)(Math.random()*j.getPersonajes().size()-1+0);
		Personaje personajeQueAcertar = j.getPersonajes().get(randomNumber);
		return personajeQueAcertar;
	}
}
	

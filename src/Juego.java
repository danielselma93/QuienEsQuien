import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
private ArrayList <Personaje> personajes;
private ArrayList <Personaje> personajesAcertados;

public Juego (){
	personajes = new ArrayList <Personaje>();
	Personaje a = new Personaje("anita","rubio", "azules", "pequeña", "pequeña", "noTiene", "mujer");
	Personaje b = new Personaje("david", "rubio", "marrones","pequeña","grande","tiene","hombre");
	Personaje c = new Personaje("pepe", "rubio", "marrones", "pequeña", "pequeña", "noTiene","hombre");
	Personaje d = new Personaje("carlos", "rubio", "marrones", "grande","grande","tiene","hombre");
	Personaje e = new Personaje("ernesto", "rubio","marrones", "pequeña","grande","noTiene","hombre");
	Personaje f = new Personaje("clara", "pelirrojo", "marrones", "pequeña","pequeña","noTiene","mujer");
	Personaje g = new Personaje("alfredo", "pelirrojo", "azules", "pequeña","pequeña", "tiene","hombre");
	Personaje h = new Personaje("german", "pelirrojo", "marrones","grande","pequeña", "noTiene","hombre");
	Personaje i = new Personaje("manuel","castaño","marrones","grande","grande","tiene","hombre");
	Personaje j = new Personaje("roberto","castaño","azules","grande","pequeña","noTiene","hombre");
	Personaje k = new Personaje("maria","castaño","marrones","pequeña","pequeña","noTiene","mujer");
	Personaje l = new Personaje("ana","moreno","marrones","grande","pequeña","noTiene","mujer");
	Personaje m = new Personaje("alejandro","moreno","marrones","pequeña","grande","tiene","hombre");
	Personaje n = new Personaje("tomas","moreno","azules","pequeña","pequeña","noTiene","hombre");
	Personaje ñ = new Personaje("susana","blanco","marrones","pequeña","grande","noTiene","mujer");
	Personaje o = new Personaje("pedro","blanco","azules","grande","grande","noTiene","hombre");
	Personaje p = new Personaje("jorge","blanco","marrones","pequeña","grande","noTiene","hombre");
	personajes.add(a);
	personajes.add(b);
	personajes.add(c);
	personajes.add(d);
	personajes.add(e);
	personajes.add(f);
	personajes.add(g);
	personajes.add(h);
	personajes.add(i);
	personajes.add(j);
	personajes.add(k);
	personajes.add(l);
	personajes.add(m);
	personajes.add(n);
	personajes.add(ñ);
	personajes.add(o);
	personajes.add(p);	
	personajesAcertados = (ArrayList<Personaje>) personajes.clone();
}
public void muestraPersonajesAcertados(){
	for (int i = 0 ; i < personajesAcertados.size(); i++){
		personajesAcertados.get(i).mostrarDatos();
	}
}
public String eligePregunta(Personaje personajeQueAcertar){
	Scanner sc = new Scanner(System.in);
	String palabraParaComprobar = "";
	int opcion = 0;
	while(opcion < 1 || opcion > 6){
		System.out.println("!Elige pregunta!");
		System.out.println("1-Color de pelo\n2-Color de ojos\n3-Tamaño de la nariz\n4-Tamaño de la boca\n5-Vello Facial\n6-Sexo");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:palabraParaComprobar = eligePelo();
				comprobador(opcion,palabraParaComprobar,personajeQueAcertar);
				break;
			case 2:palabraParaComprobar = eligeColorOjos();
				comprobador(opcion,palabraParaComprobar,personajeQueAcertar);
				break;
			case 3:palabraParaComprobar = eligeTamañoNariz();
				comprobador(opcion,palabraParaComprobar,personajeQueAcertar);
				break;
			case 4:palabraParaComprobar = eligeTamañoBoca();
				comprobador(opcion,palabraParaComprobar,personajeQueAcertar);
				break;
			case 5:palabraParaComprobar = eligeVelloFacial();
				comprobador(opcion,palabraParaComprobar,personajeQueAcertar);
				break;
			case 6:palabraParaComprobar = eligeSexo();
				comprobador(opcion,palabraParaComprobar,personajeQueAcertar);
				break;
			
			default: System.out.println("Elige una opcion correcta porfavor.");
				break;
		}
	}
	return palabraParaComprobar;
}
public String eligePelo(){
	Scanner sc = new Scanner(System.in);
	String pelo = "";
	int opcion = 0;
	while(opcion < 1 || opcion > 5){
		System.out.println("!Elige el color de cabello!");
		System.out.println("!1-Rubio\n2-Moreno\n3-Pelirrojo\n4-Castaño\n5-Blanco");
		opcion = sc.nextInt();
		switch(opcion){
			case 1: pelo = "rubio";
				break;
			case 2: pelo = "moreno";
				break;
			case 3: pelo = "pelirrojo";
				break;
			case 4: pelo = "castaño";
				break;
			case 5: pelo = "blanco";
				break;
			default: System.out.println("Elige una opcion correcta porfavor.");
				break;
		}
	}
	return pelo;
}

public String eligeColorOjos(){
	Scanner sc = new Scanner(System.in);
	String ojos = "";
	int opcion = 0;
	while(opcion < 1 || opcion > 2){
		System.out.println("!Elige el color de ojos!");
		System.out.println("!1-Azules\n2-Marrones");
		opcion = sc.nextInt();
		switch(opcion){
			case 1: ojos = "azules";
				break;
			case 2: ojos = "marrones";
				break;
			default: System.out.println("Elige una opcion correcta porfavor.");
				break;
		}
	}
	return ojos;
}
public String eligeTamañoNariz(){
	Scanner sc = new Scanner(System.in);
	String nariz = "";
	int opcion = 0;
	while(opcion < 1 || opcion > 2){
		System.out.println("!Elige el tamaño de la nariz!");
		System.out.println("!1-Grande\n2-Pequeña");
		opcion = sc.nextInt();
		switch(opcion){
			case 1: nariz = "grande";
				break;
			case 2: nariz = "pequeña";
				break;
			default: System.out.println("Elige una opcion correcta porfavor.");
				break;
		}
	}
	return nariz;
}
public String eligeTamañoBoca(){
	Scanner sc = new Scanner(System.in);
	String boca = "";
	int opcion = 0;
	while(opcion < 1 || opcion > 2){
		System.out.println("!Elige el tamaño de la boca!");
		System.out.println("!1-Grande\n2-Pequeña");
		opcion = sc.nextInt();
		switch(opcion){
			case 1: boca = "grande";
				break;
			case 2: boca = "pequeña";
				break;
			default: System.out.println("Elige una opcion correcta porfavor.");
				break;
		}
	}
	return boca;
}
public String eligeVelloFacial(){
	Scanner sc = new Scanner(System.in);
	String vello = "";
	int opcion = 0;
	while(opcion < 1 || opcion > 2){
		System.out.println("!Elige si tiene vello facial!");
		System.out.println("!1-Tiene\n2-No tiene");
		opcion = sc.nextInt();
		switch(opcion){
			case 1: vello = "tiene";
				break;
			case 2: vello = "noTiene";
				break;
			default: System.out.println("Elige una opcion correcta porfavor.");
				break;
		}
	}
	return vello;
}
public String eligeSexo(){
	Scanner sc = new Scanner(System.in);
	String sexo = "";
	int opcion = 0;
	while(opcion < 1 || opcion > 2){
		System.out.println("!Elige el sexo!");
		System.out.println("!1-Hombre\n2-Mujer");
		opcion = sc.nextInt();
		switch(opcion){
			case 1: sexo = "hombre";
				break;
			case 2: sexo = "mujer";
				break;
			default: System.out.println("Elige una opcion correcta porfavor.");
				break;
		}
	}
	return sexo;
}
public void quitaPersonajes(int opcion,String palabraParaComprobar,boolean acertado){
	switch(opcion){
	case 1:
		if(acertado == true){
				for (int i = 0 ; i < personajesAcertados.size(); i++){
					if(!palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getColorPelo())){
						personajesAcertados.remove(i);
						i--; 
					}
				}
			}else{
				for (int i = 0 ; i < personajesAcertados.size(); i++){
					if(palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getColorPelo())){
						personajesAcertados.remove(i);
						i--; 
					}
			}
		}
		break;
	case 2:
		if(acertado == true){
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(!palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getColorOjos())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}else{
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getColorOjos())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}
		break;
	case 3:
		if(acertado == true){
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(!palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getTamañoNariz())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}else{
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getTamañoNariz())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}
		break;
	case 4:
		if(acertado == true){
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(!palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getTamañoBoca())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}else{
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getTamañoBoca())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}
		break;
	case 5:
		if(acertado == true){
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(!palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getVelloFacial())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}else{
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getVelloFacial())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}
		break;
	case 6:
		if(acertado == true){
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(!palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getSexo())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}else{
			for (int i = 0 ; i < personajesAcertados.size(); i++){
				if(palabraParaComprobar.equalsIgnoreCase(personajesAcertados.get(i).getSexo())){
					personajesAcertados.remove(i);
					i--; 
				}
			}
		}
		break;
	}
}

public void comprobador (int opcion, String palabraParaComprobar, Personaje personajeQueAcertar){
	boolean acertado = false;	
	switch(opcion){
	case 1:
		if(palabraParaComprobar.equalsIgnoreCase(personajeQueAcertar.getColorPelo())){
			acertado = true;
		}
		quitaPersonajes(opcion,palabraParaComprobar,acertado);
		break;
	case 2:
		if(palabraParaComprobar.equalsIgnoreCase(personajeQueAcertar.getColorOjos())){
			acertado = true;
		}
		quitaPersonajes(opcion,palabraParaComprobar,acertado);
		break;
	case 3:
		if(palabraParaComprobar.equalsIgnoreCase(personajeQueAcertar.getTamañoNariz())){
			acertado = true;
		}
		quitaPersonajes(opcion,palabraParaComprobar,acertado);
		break;
	case 4:
		if(palabraParaComprobar.equalsIgnoreCase(personajeQueAcertar.getTamañoBoca())){
			acertado = true;
		}
		quitaPersonajes(opcion,palabraParaComprobar,acertado);
		break;
	case 5:
		if(palabraParaComprobar.equalsIgnoreCase(personajeQueAcertar.getVelloFacial())){
			acertado = true;
		}
		quitaPersonajes(opcion,palabraParaComprobar,acertado);
		break;
	case 6:
		if(palabraParaComprobar.equalsIgnoreCase(personajeQueAcertar.getSexo())){
			acertado = true;
		}
		quitaPersonajes(opcion,palabraParaComprobar,acertado);
		break;
	}
}
public boolean adivinar (Personaje personajeQueAcertar){
	boolean victoria = false;
	Scanner sc = new Scanner (System.in);
	int opcion = 0;
	while (opcion <= 0 || opcion > personajesAcertados.size()){
		System.out.println("¿ Quien es Quien ?");
		System.out.println("Elige un personaje de arriba a bajo teniendo en cuenta q el orden es ascendente 1 2 3..");
		System.out.println();
		System.out.println();
		muestraPersonajesAcertados();
		opcion = sc.nextInt();
		if(opcion != 0){
			opcion -=1;
			if(personajesAcertados.get(opcion).getNombre().equalsIgnoreCase(personajeQueAcertar.getNombre())){
				victoria = true;
			}
			opcion +=1;
		}else{
			System.out.println("Elige un numero correcto, de arriba a bajo en orden ascendente1 2 3..");
		}
	}
	return victoria;
}
public ArrayList<Personaje> getPersonajes() {
	return personajes;
}
public void setPersonajes(ArrayList<Personaje> personajes) {
	this.personajes = personajes;
}
public ArrayList<Personaje> getPersonajesAcertados() {
	return personajesAcertados;
}
public void setPersonajesAcertados(ArrayList<Personaje> personajesAcertados) {
	this.personajesAcertados = personajesAcertados;
}

}
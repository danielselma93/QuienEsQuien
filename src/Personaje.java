
public class Personaje {
private String nombre;
private String colorPelo;
private String colorOjos;
private String tamañoNariz;
private String tamañoBoca;
private String velloFacial;
private String sexo;


public Personaje(String nom, String cPelo, String cOjos, String tNariz, String tBoca, String vFacil, String sex){
	nombre = nom;
	colorPelo = cPelo;
	colorOjos = cOjos;
	tamañoNariz = tNariz;
	tamañoBoca = tBoca;
	velloFacial = vFacil;
	sexo = sex;
}
public void mostrarDatos(){
	System.out.println("Nombre:"+nombre+"\tColor de pelo:"+colorPelo+"\tColor de ojos:"+colorOjos+"\tTamaño de nariz:"+tamañoNariz+"\tTamaño boca:"+tamañoBoca+"\tVello facial:"+velloFacial+"\tSexo:"+sexo);
	System.out.println();
	System.out.println();
}

public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getColorPelo() {
	return colorPelo;
}


public void setColorPelo(String colorPelo) {
	this.colorPelo = colorPelo;
}


public String getColorOjos() {
	return colorOjos;
}


public void setColorOjos(String colorOjos) {
	this.colorOjos = colorOjos;
}


public String getTamañoNariz() {
	return tamañoNariz;
}


public void setTamañoNariz(String tamañoNariz) {
	this.tamañoNariz = tamañoNariz;
}


public String getTamañoBoca() {
	return tamañoBoca;
}


public void setTamañoBoca(String tamañoBoca) {
	this.tamañoBoca = tamañoBoca;
}


public String getVelloFacial() {
	return velloFacial;
}


public void setVelloFacial(String velloFacial) {
	this.velloFacial = velloFacial;
}



public String getSexo() {
	return sexo;
}


public void setSexo(String sexo) {
	this.sexo = sexo;
}

}
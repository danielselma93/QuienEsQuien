
public class Personaje {
private String nombre;
private String colorPelo;
private String colorOjos;
private String tama�oNariz;
private String tama�oBoca;
private String velloFacial;
private String sexo;


public Personaje(String nom, String cPelo, String cOjos, String tNariz, String tBoca, String vFacil, String sex){
	nombre = nom;
	colorPelo = cPelo;
	colorOjos = cOjos;
	tama�oNariz = tNariz;
	tama�oBoca = tBoca;
	velloFacial = vFacil;
	sexo = sex;
}
public void mostrarDatos(){
	System.out.println("Nombre:"+nombre+"\tColor de pelo:"+colorPelo+"\tColor de ojos:"+colorOjos+"\tTama�o de nariz:"+tama�oNariz+"\tTama�o boca:"+tama�oBoca+"\tVello facial:"+velloFacial+"\tSexo:"+sexo);
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


public String getTama�oNariz() {
	return tama�oNariz;
}


public void setTama�oNariz(String tama�oNariz) {
	this.tama�oNariz = tama�oNariz;
}


public String getTama�oBoca() {
	return tama�oBoca;
}


public void setTama�oBoca(String tama�oBoca) {
	this.tama�oBoca = tama�oBoca;
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
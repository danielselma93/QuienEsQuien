
public class Personaje {
private String nombre;
private String colorPelo;
private String colorOjos;
private String tamaņoNariz;
private String tamaņoBoca;
private String velloFacial;
private String sexo;


public Personaje(String nom, String cPelo, String cOjos, String tNariz, String tBoca, String vFacil, String sex){
	nombre = nom;
	colorPelo = cPelo;
	colorOjos = cOjos;
	tamaņoNariz = tNariz;
	tamaņoBoca = tBoca;
	velloFacial = vFacil;
	sexo = sex;
}
public void mostrarDatos(){
	System.out.println("Nombre:"+nombre+"\tColor de pelo:"+colorPelo+"\tColor de ojos:"+colorOjos+"\tTamaņo de nariz:"+tamaņoNariz+"\tTamaņo boca:"+tamaņoBoca+"\tVello facial:"+velloFacial+"\tSexo:"+sexo);
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


public String getTamaņoNariz() {
	return tamaņoNariz;
}


public void setTamaņoNariz(String tamaņoNariz) {
	this.tamaņoNariz = tamaņoNariz;
}


public String getTamaņoBoca() {
	return tamaņoBoca;
}


public void setTamaņoBoca(String tamaņoBoca) {
	this.tamaņoBoca = tamaņoBoca;
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
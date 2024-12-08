package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	static private ArrayList<Pez> listado = new ArrayList<Pez>();
	static public int salmones = 0;
	static public int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Pez> listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas){
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public Pez() {}
	
	static public int cantidadPeces() {
		return Pez.listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	static public Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones +=1;
		return new Pez(nombre, edad, "oceano", genero, "rojo",6);
	}
	static public Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos +=1;
		return new Pez(nombre, edad, "oceano", genero, "gris",6);
	
	}
    static ArrayList<Pez> getListado(){
    	return listado;
    }
    
    public String getColorEscamas() {
    	return this.colorEscamas ;
    }
    
    public int getCantidadAletas() {
    	return this.cantidadAletas ;
    }
    
    public void setColorEscamas(String color) {
    	this.colorEscamas = color;
    }
    
    public void setCantidadAletas(int cantidad) {
    	this.cantidadAletas = cantidad;
    }
}

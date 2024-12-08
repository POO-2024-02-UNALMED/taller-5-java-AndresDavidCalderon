package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	static private ArrayList<Anfibio> listado;
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Anfibio> listado, int ranas, int salamandras, String colorPiel, boolean venenoso){
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public Anfibio() {
		
	}
	
	static public int cantifadAnfibios() {
		return Anfibio.listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	static public Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas +=1;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	static public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras +=1;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		
	}
    static ArrayList<Anfibio> getListado(){
    	return listado;
    }
    public String getColorPiel() {
    	return this.colorPiel ;
    }
    public boolean isVenenoso() {
    	return this.venenoso ;
    }
    
    public void setColorPiel(String color) {
    	this.colorPiel = color;
    }
    
    public void setVenenoso(boolean venenoso) {
    	this.venenoso = venenoso;
    }
}

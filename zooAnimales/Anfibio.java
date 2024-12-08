package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	static private ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
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
	
	public void cantifadAnfibios() {
	}
	
	public String movimiento() {
		return "saltar";
	}
	public void crearRana() {
		
	}
	public void crearSalamandra() {
		
	}
    static ArrayList<Anfibio> getListado(){
    	return listado;
    }
}

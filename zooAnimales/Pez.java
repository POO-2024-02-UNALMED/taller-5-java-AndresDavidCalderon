package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	static private ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
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
	
	public void cantidadPeces() {
		
	}
	public String movimiento() {
		return "nadar";
	}
	public void crearSalmon() {
		
	}
	public void crearBacalao() {
		
	}
    static ArrayList<Pez> getListado(){
    	return listado;
    }
}

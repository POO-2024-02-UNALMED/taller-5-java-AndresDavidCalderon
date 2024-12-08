package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	static private ArrayList<Reptil> listado;
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Reptil> listado, int iguanas, int serpientes, String colorEscamas, int largoCola){
		super(totalAnimales,nombre,edad,habitat,genero,zona);
		this.listado = listado;
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public Reptil() {
		
	}
	
	static public int cantidadReptiles() {
		return Reptil.listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	static public Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas+=1;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	static public Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes+=1;
		return new Reptil(nombre, edad, "jungla", genero, "blanco",1);
	}
    static ArrayList<Reptil> getListado(){
    	return listado;
    }
}

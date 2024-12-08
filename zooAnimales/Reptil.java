package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	static private ArrayList<Reptil> listado;
	public int iguanas;
	public int serpientes;
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
	
	public void cantidadReptiles() {
		
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana() {
		
	}
	
	public void crearSerpientes() {
		
	}
    static ArrayList<Reptil> getListado(){
    	return listado;
    }
}

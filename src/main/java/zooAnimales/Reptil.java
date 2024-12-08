package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	static private ArrayList<Reptil> listado = new ArrayList<Reptil>();
	static public int iguanas = 0;
	static public int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	
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
    
    public String getColorEscamas() {
    	return this.colorEscamas ;
    }
    
    public int getLargoCola() {
    	return this.largoCola ;
    }
    
    public void setColorEscamas(String color) {
    	this.colorEscamas =color;
    }
    public void setLargoCola(int largo) {
    	this.largoCola = largo;
    }
}

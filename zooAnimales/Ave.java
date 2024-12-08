package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
    static private ArrayList<Ave> listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;
    
    Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Ave> listado, int halcones, int aguilas, String colorPlumas){
    	super(totalAnimales, nombre, edad, habitat, genero, zona);
    	this.listado = listado;
    	this.halcones = halcones;
    	this.aguilas = aguilas;
    	this.colorPlumas = colorPlumas;
		listado.add(this);
    }
    
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
    	super(nombre, edad, habitat, genero);
    	this.colorPlumas= colorPlumas;
    }
    
    public Ave() {
    	
    }
    
    public String movimiento() {
    	return "volar";
    }
    
    public void cantidadAves() {
    	
    }
    
    public void crearHalcon() {
    	
    }
    
    public void crearAguila() {
    	
    }
    static ArrayList<Ave> getListado(){
    	return listado;
    }
    
}

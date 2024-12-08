package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
    static private ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    
    Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, int halcones, int aguilas, String colorPlumas){
    	super(totalAnimales, nombre, edad, habitat, genero, zona);
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
    
    public int cantidadAves() {
    	return Ave.listado.size();
    }
    
    static public Ave crearHalcon(String nombre,int edad,String genero) {
    	Ave.halcones +=1;
    	return new Ave(nombre, edad, "montañas", genero, "cafe glorioso"); 
    }
    
    static public Ave crearAguila(String nombre, int edad, String genero) {
    	Ave.aguilas +=1;
    	return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
    }
    static ArrayList<Ave> getListado(){
    	return listado;
    }
    
    public String getColorPlumas() {
    	return this.colorPlumas ;
    }
    public void setColorPlumas(String color) {
    	this.colorPlumas = color;
    }
    
}

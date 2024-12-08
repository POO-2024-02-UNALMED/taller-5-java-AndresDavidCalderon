package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
    static private ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;
    
    
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
    	return new Ave(nombre, edad, "montanas", genero, "cafe glorioso"); 
    }
    
    static public Ave crearAguila(String nombre, int edad, String genero) {
    	Ave.aguilas +=1;
    	return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
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

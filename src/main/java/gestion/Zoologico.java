package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas){
    	this.nombre = nombre;
    	this.ubicacion = ubicacion;
    	this.zonas = zonas;
    }
    
    public Zoologico(String nombre, String ubicacion) {
    	this.nombre = nombre;
    	this.ubicacion = ubicacion;
    }
    
    public Zoologico(){
    	
    }
    
    
    public void agregarZonas(Zona zona){
    	zonas.add(zona);
    }

    public int cantidadTotalAnimales(){
        int animales = 0;
        for (int i=0; i<zonas.size(); i++) {
        	animales +=zonas.get(i).getAnimales().size();
        }
        return animales;
    }
    
    public String getNombre() {
    	return this.nombre;
    }
    public String getUbicacion() {
    	return this.ubicacion ;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public void setUbicacion(String ubicacion) {
    	this.ubicacion = ubicacion;
    }
    
    public ArrayList<Zona> getZona(){
    	return this.zonas;
    }
}

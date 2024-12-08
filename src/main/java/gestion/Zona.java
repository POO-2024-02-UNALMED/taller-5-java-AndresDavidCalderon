package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;


public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();
    
    Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales){
    	this.nombre = nombre;
    	this.zoo = zoo;
    	this.animales = animales;
    }
    
    public Zona(String nombre, Zoologico zoo) {
    	this.nombre = nombre;
    	this.zoo = zoo;
    }
    
    public Zona() {
    	
    }
    
    public ArrayList<Animal> getAnimales(){
    	return this.animales;
    }
    
    public void agregarAnimales(Animal animal) {
    	animales.add(animal);
    }
    
    public int cantidadAnimales() {
    	return this.animales.size();
    }
    
    public Zoologico getZoo() {
    	return this.zoo;
    }
    
    public String getNombre() {
    	return this.nombre;
    }
    
    public void setZoo(Zoologico zoo) {
    	this.zoo = zoo;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
}

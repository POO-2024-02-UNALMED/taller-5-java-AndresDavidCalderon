package zooAnimales;
import gestion.Zona;

public class Animal {
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;   
    
    public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona){
    	this.totalAnimales = totalAnimales;
    	this.nombre = nombre;
    	this.edad = edad;
    	this.habitat = habitat;
    	this.genero = genero;
    	this.zona = zona;
    	this.totalAnimales+=1;
    }
    
    public Animal(String nombre, int edad, String habitat, String genero){
    	this.nombre = nombre;
    	this.edad = edad;
    	this.habitat = habitat;
    	this.genero = genero;
    }
    
    public Animal() {
    	
    }
    
    public String movimiento() {
    	return "desplazarse";
    }
    
    public String totalPorTipo() {
    	return "Mamiferos: "+ Mamifero.getListado().size() + "\n"+
    			"Aves: "+ Ave.getListado().size() + "\n"+
    			"Reptiles: " + Reptil.getListado().size() + "\n"+
    			"Peces: " + Pez.getListado().size() + "\n"+
    			"Anfibios: "+ Anfibio.getListado().size() + "\n";
    }
    public String toString() {
    	String presentacion = "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+ this.genero;
    	if (zona!=null) {
    		presentacion+=", la zona en la que me ubico es "+this.zona.getNombre()+", en el "+this.zona.getZoo().getNombre();
    	}
    	return presentacion;
    }
}

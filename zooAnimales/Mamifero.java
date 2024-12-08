package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
    static private ArrayList<Mamifero> listado;
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;
    
    Mamifero(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, ArrayList<Mamifero> listado, int caballos, int leones, boolean pelaje, int patas){
    	super(totalAnimales, nombre, edad, habitat, genero, zona);
    	this.listado = listado;
    	this.caballos = caballos;
    	this.leones = leones;
    	this.pelaje = pelaje;
    	this.patas = patas;
		listado.add(this);
    }
    
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
    	super(nombre, edad, habitat, genero);
    	this.pelaje = pelaje;
    	this.patas = patas;
    }
    
    public Mamifero() {}

    public int cantidadMamiferos(){
    	return listado.size();
    }

    public void crearCaballo(){
    	this.caballos +=1;
    	
    }

    public void crearLeon(){
        this.leones+=1;
    }
    
    static ArrayList<Mamifero> getListado(){
    	return listado;
    }
    
}

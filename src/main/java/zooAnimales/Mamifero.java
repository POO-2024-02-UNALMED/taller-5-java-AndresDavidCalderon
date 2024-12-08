package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
    static private ArrayList<Mamifero> listado;
    static public int caballos;
    static public int leones;
    private boolean pelaje;
    private int patas;
    
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
    	super(nombre, edad, habitat, genero);
    	this.pelaje = pelaje;
    	this.patas = patas;
    }
    
    public Mamifero() {}

    public int cantidadMamiferos(){
    	return listado.size();
    }

    static public Mamifero crearCaballo(String nombre,int edad,String genero){
    	Mamifero.caballos +=1;
    	return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    static public Mamifero crearLeon(String nombre,int edad,String genero){
    	Mamifero.leones+=1;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
    
    static ArrayList<Mamifero> getListado(){
    	return listado;
    }
    
    public boolean getPelaje() {
    	return this.pelaje;
    }
    
    public int getPatas() {
    	return this.patas;
    }
    
    public void setPelaje(boolean pelaje) {
    	this.pelaje = pelaje;
    }
    
    public void setPatas(int patas) {
    	this.patas = patas;
    }
}

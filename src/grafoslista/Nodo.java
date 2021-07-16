package grafoslista;

/**
 *
 * @author DinoMahomie
 */

public class Nodo{
    private int nombre;
    private int peso;
    private Nodo siguiente;
    
    
    public Nodo( int nombre ){
        this.nombre = nombre;
        peso = -1;
        siguiente = null;
    }
    
    public Nodo( int nombre, int peso ){
        this.nombre = nombre;
        this.peso = peso;
        siguiente = null;
    }
    
    public Nodo(){
        nombre = -1;
        peso = -1;
        siguiente = null;
    }
    
    public int getNombre(){ return nombre; }
    public void setNombre( int nombre ){ this.nombre = nombre; }
    
    public int getPeso(){ return peso; }
    public void setPeso( int peso ){ this.peso = peso; }

    public Nodo getSiguiente() { return siguiente; }
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
    
    public boolean equals( Nodo x ){
        return nombre == x.nombre ;
    }
}

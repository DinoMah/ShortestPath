/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoslista;

import java.util.ArrayList;

/**
 *
 * @author Rick
 */
public class ListaAdyacencia {
   private ArrayList <Nodo>lista;
    private int numVertices;
    private int peso;
    
    
    
    public ListaAdyacencia(){
        lista = new ArrayList<>();    
        numVertices = 0;
        peso = 0;
    }

    public ArrayList<Nodo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Nodo> lista) {
        this.lista = lista;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){
        return peso;
    }
    
    
    public void agregarVertice( int nombre ) throws Exception{
        if( numVertice( nombre ) < 0 ){
            Nodo nvo = new Nodo( nombre );
            Nodo aux = new Nodo();
            lista.add( nvo );
            numVertices++;
        }
        else
            throw new Exception( "Ese vertice ya existe homs :P" );
    }
    
    
    //Esto va en el camino osea lineas
    public void agregarArista( int punto1, int punto2, int peso ) throws Exception{
        int pos = numVertice( punto1 );
        int pos2 = numVertice( punto2 );
        if( pos > -1  || pos2 > -1 ){
            Nodo xArista = new Nodo( punto2, peso );
            Nodo xArista2 = new Nodo( punto1, peso );
            if( lista.get( pos ).getSiguiente() == null ){
                lista.get( pos ).setSiguiente( xArista );
                lista.get( pos2 ).setSiguiente( xArista2 );
            }
            else{
                Nodo aux = lista.get( pos );
                Nodo aux2 = lista.get( pos2 );
                while( aux.getSiguiente() != null ) //éste while recorre el primer auxiliar
                    aux = aux.getSiguiente();
                while( aux2.getSiguiente() != null ) //éste while recorre el segundo auxiliar
                    aux2 = aux2.getSiguiente();
                aux.setSiguiente( xArista );
                aux2.setSiguiente( xArista2 );
                
            }
        }
        else
            throw new Exception( "Error X_X" );
    }
    
    public int numVertice( int nombre ){
        Nodo aBuscar = new Nodo( nombre );
        boolean esta = false;
        int i = 0;
        while( i < numVertices && !esta ){
            esta = lista.get( i ).equals( aBuscar );
            if( !esta )
                i++;
        }
        return (i < numVertices)? i: -1;
    }
    
    public void mostrarLista(){
        for( int i = 0; i < numVertices; i++ ){
            Nodo aux = lista.get(i);
            System.out.println( "Nombre: " + aux.getNombre() );
            aux = aux.getSiguiente();
            while( aux != null ){
                System.out.println( aux.getNombre() );
                System.out.println( aux.getPeso() );
                aux = aux.getSiguiente();
            }
        }  
    }//fin mostrarlista
    
    
}//fin class ListaAdyacencia

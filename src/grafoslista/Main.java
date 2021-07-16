
package grafoslista;

import java.util.Scanner;
import grafoslista.ListaAdyacencia;

/**
 *
 * @author Rick
 */

public class Main{
    public static void main( String[] args ) throws Exception{
        ListaAdyacencia nva = new ListaAdyacencia();
        Scanner input = new Scanner( System.in );
        String captura;
        String op = "";
        int aux;
        while( true ){   
            System.out.print( "Dame un vertice: " );
            captura = input.next();
            try{
                nva.agregarVertice( Integer.parseInt(captura) );
            }
            catch( Exception e ){
                System.out.println( "Hay un error: " + e.getCause() );
            }
            System.out.println( "¿Quieres otro vertice?" );
            op = input.next();
            if( op.equals( "n" ) || op.equals( "N" ) )
                break;
        }
        
        int peso = 0;
        String origen = "", destino = "";
        
        while( true ){   
            System.out.print( "Dame un origen: " );
            origen = input.next();
            System.out.print( "Dame un destino: " );
            destino = input.next();
            System.out.print( "Cuál es el peso de la arista: " );
            peso = input.nextInt();
            
            //try{
                nva.agregarArista( Integer.parseInt(origen), Integer.parseInt(destino), peso );
            //}
            //catch( Exception e ){
                //System.out.println( "Hay un error: " + e.getCause() );
            //}
            System.out.println( "¿Quieres otra arista?" );
            op = input.next();
            if( op.equals( "n" ) || op.equals( "N" ) )
                break;
        }
        nva.mostrarLista();
    }
}

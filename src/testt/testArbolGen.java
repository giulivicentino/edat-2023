package testt;

import jerarquicas.ArbolGen;
import lineales.dinamicas.Lista;

/**
 *
 * @author Giuli Vicentino
 */
public class testArbolGen {

    public static void main(String[] args) {
        /* 
        ArbolGen arbol = new ArbolGen();
        System.out.println("vacio??? " + arbol.toString());
        arbol.insertar(20, null);
        arbol.insertar(13, 20);
        arbol.insertar(54, 20);
        arbol.insertar(15, 13);
        arbol.insertar(12, 13);
        arbol.insertar(11, 54);
        arbol.insertar(27, 54);
        arbol.insertar(4, 54);
        arbol.insertar(17, 27);
        arbol.insertar(5, 54);
        arbol.insertar(6, 54);
        arbol.insertar(7, 54);
        arbol.insertar(77, 17);
        System.out.println("ARBOL1:  " + arbol.toString());
        System.out.println("eliminar 4: " + arbol.eliminar(6));
        System.out.println("ARBOL sin 4?:  " + arbol.toString());
        System.out.println("LISTAR HASTA NIVEL 1: " + arbol.listarHastaNivel(3).toString());
*/
        ArbolGen arbol2 = new ArbolGen();
        arbol2.insertar('A', null);
        arbol2.insertar('H', 'A');
        arbol2.insertar('B', 'A');
        arbol2.insertar('Z', 'A');

        arbol2.insertar('D', 'H');
        arbol2.insertar('N', 'H');
        arbol2.insertar('Q', 'H');

        arbol2.insertar('P', 'D');
        arbol2.insertar('G', 'D');

        arbol2.insertar('Y', 'N');

        arbol2.insertar('L', 'Q');

        arbol2.insertar('E', 'B');

        arbol2.insertar('R', 'E');

        arbol2.insertar('F', 'Z');
        arbol2.insertar('C', 'Z');
        arbol2.insertar('J', 'Z');

        arbol2.insertar('W', 'F');
        arbol2.insertar('O', 'F');
        
        arbol2.insertar('I', 'C');

        arbol2.insertar('V', 'J');
        arbol2.insertar('M', 'J');
        
        //System.out.println("Arbol2(de las diapo): " + arbol2.toString());
        //System.out.println("es J, sobrino de H?  " + arbol2.esSobrino('J', 'H'));
       // System.out.println("obtener nodo "+arbol2.obtenerNodoP("L"));
        //System.out.println("CAMINO A HOJA MAS CERCANA:   "+arbol2.caminoAHojaMasCercana().toString());
        //System.out.println("listar por niveles "+arbol2.listarPorNiveles().toString());
        System.out.println("CAMINO A HOJA MAS LEJANA:   "+arbol2.caminoAHojaMasLejana().toString());

    }
}

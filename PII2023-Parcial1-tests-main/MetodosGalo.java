public class MetodosGalo {

    public static class ArregloFueraDeRangoException extends Exception{

    }
    public MetodosGalo(){

    }

    public static int[] insertar(int[] arreglo, int valor, int posicion) throws ArregloFueraDeRangoException {
        final int POSICION_INICIAL = 0;
        final int POSICION_FINAL = arreglo.length;

        if(posicion < POSICION_INICIAL || posicion > POSICION_FINAL){
            throw new ArregloFueraDeRangoException("La posicion indicada esta fuera de los limites del arreglo.");
        }

        int[] nuevo_arreglo = new int[arreglo.length + 1];

        for(int i = 0; i < posicion; i++){
            nuevo_arreglo[i] = arreglo[i];
        }

        nuevo_arreglo[posicion] = valor;

        for(int i = posicion + 1; i <= POSICION_FINAL; i++){
            nuevo_arreglo[i] = arreglo[i - 1];
        }

        return nuevo_arreglo;
    }
}

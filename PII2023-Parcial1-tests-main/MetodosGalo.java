public class MetodosGalo {
    final int[] arreglo;

    public static class ArregloFueraDeRangoException extends Exception{
        public ArregloFueraDeRangoException(String mensaje){
            super(mensaje);
        }
    }

    private MetodosGalo(int[] arreglo) throws Exception{
        this.arreglo = arreglo;

        if(arreglo.getClass().getComponentType() != int.class){
            throw new Exception("El arreglo no esta compuesto de enteros.");
        }
    }

    /**
     * Función que dado un arreglo de números enteros, un valor y una posición, inserta el valor en la posición indicada
     * @param arreglo Recibe un arreglo de enteros.
     * @param valor Valor que va a ser colocado.
     * @param posicion Es un entero que indica la posicion en la que se introduce el nuevo valor.
     * @return Un arreglo nuevo con un largo aumentado en una unidad y un valor nuevo.
     */
    public static int[] insertar(int[] arreglo, int valor, int posicion) throws ArregloFueraDeRangoException {
        final int POSICION_INICIAL = 0;
        final int POSICION_FINAL = arreglo.length;

        if(posicion < POSICION_INICIAL || posicion > POSICION_FINAL){
            throw new ArregloFueraDeRangoException("La posicion indicada esta fuera de los limites del arreglo.");
        }

        int[] nuevo_arreglo = new int[arreglo.length + 1];

        System.arraycopy(arreglo, 0, nuevo_arreglo, 0, posicion);

        nuevo_arreglo[posicion] = valor;

        if (POSICION_FINAL + 1 - (posicion + 1) >= 0)
            System.arraycopy(arreglo, posicion + 1 - 1, nuevo_arreglo, posicion + 1, POSICION_FINAL + 1 - (posicion + 1));

        return nuevo_arreglo;
    }

    /**
     * Busca un número en un arreglo de enteros y devuelve la posición en la que se encuentra.
     * @param arreglo El arreglo en el que se va a buscar el valor.
     * @param numero Valor que va a ser buscado en el arreglo.
     * @return Retorna la posicion numerica en la cual se encuentra el valor buscado o -1 si no existe el valor.
     */
    public static int buscar(int[] arreglo, int numero){
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == numero){
                return i;
            }
        }

        return -1;
    }

    /**
     * Indica si todos los elementos del segundo arreglo están en el primero.
     * @param arreglo_uno Primer arreglo.
     * @param arreglo_dos Segundo arreglo utilizado para comparar con el primero.
     * @return Retorna true si todos los elementos del segundo están en el primero y false en caso contrario.
     */
    public static boolean esContenido(int[] arreglo_uno, int[] arreglo_dos){
        for(int j : arreglo_dos){
            boolean contenido = false;

            for(int i : arreglo_uno){
                if(j == i){
                    contenido = true;
                    break;
                }
            }

            if(!contenido){
                return false;
            }
        }

        return true;
    }
}

/**
 * En esta clase se insertan los metodos creados por los alumnos para comparar si retornan bien los resultados :)
 */
public class MetodosAlumno {

    /**
     * Esta funcion se encarga de agregar un numero en la posicion indicada del arreglo
     * @param array es el arreglo ingresado por el usuario
     * Pre: arreglo no nulo de numeros enteros
     * @param arregloNuevo es un nuevo arreglo donde van a copiarse todos los nros del arreglo original y ademas se agregara el nro nuevo
     * Pre: arreglo no nulo de numeros enteros
     * @param posicion es el posicion en la que se agregara el nuevo valor
     * pre debe ser un valor positivo
     * @param nuevoValor es el valor nuevo que se agregara el nuevo valor
     * pre debe ser un valor entero
     * Post: devolver el arreglo con el valor agregado
     */
    public static int[] insercion(int[] arregloNuevo, int[] array, int posicion, int nuevoValor) {
        if(posicion<0){
            throw new NegativeArraySizeException("Dimension negativa");
        }
        int[] arregloTemp=new int[2];
        for(int i=0, j=0; i<array.length;i++){
            if(i>=posicion){
                arregloTemp[j]=array[i];
                j++;
            }
        }
        for (int i = 0, j=0; i < array.length; i++) {
            arregloNuevo[i]=array[i];
            if (i == posicion) {
                arregloNuevo[i]=nuevoValor;

            }
            if(i>posicion){
                arregloNuevo[i]=arregloTemp[j];
                j++;
            }
        }
        return arregloNuevo;
    }

    /**
     *  Esta funcion se encarga de bbuscar un numero dentro de un arreglo y devolver la posicion en la que se encuentra
     * @param array es el arreglo ingresado por el usuario
     * Pre: arreglo no nulo de numeros enteros
     * @param numero es el numero que hay que encontrar
     * Pre: nro entero
     * Post: Devolver la posicion del nro buscado
     */
    public static int buscar(int[] array, int numero) {
        int posicion=-1;
        for(int i=0;i< array.length;i++){
            if (array[i]==numero){
                posicion=i;
            }
        }
        return posicion;
    }

    /**
     *  Esta funcion se encarga de verificar si los valores de un arreglo se encuentran dentro de otro
     * @param array1 es el arreglo ingresado por el usuario
     * Pre: arreglo no nulo de numeros enteros
     * @param array2 es el arreglo ingresado por el usuario
     * Pre: arreglo no nulo de numeros enteros
     * Post: Devolver true/false si el arreglo2 se encuentra en el arreglo1
     */
    public static boolean contenido(int[] array1, int[] array2) {
        int valoresComunes=0;
        int cantidadValores=0;
        for(int i = 0; i<array2.length; i++){
            cantidadValores=cantidadValores+1;
        }
        int n=1;
        int j=0;
        for (int i=0; i<array1.length*cantidadValores; i++){
            if (array1[i]==array2[j]){
                valoresComunes=valoresComunes+1;
            }
            if (i==array1.length*n){
                n++;
                j++;
            }
        }
        boolean resultado=valoresComunes==array2.length;
        return resultado;
    }
}

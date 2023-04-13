public class MetodosAlumno {

    /**
     * AGUSTINA BOVER
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
}

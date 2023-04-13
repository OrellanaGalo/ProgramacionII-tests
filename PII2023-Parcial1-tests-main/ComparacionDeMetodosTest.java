import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class ComparacionDeMetodosTest{

    @Test
    public void testComparacionDeMetodosInsertar(){
        int[] arreglo = {1, 2, 3};
        int valor = 4;
        int posicion = 1;

        int[] resultado_esperado = {1, 4, 2, 3};

        try{
            int[] resultado_uno = MetodosGalo.insertar(arreglo, valor, posicion);
            int[] resultado_dos = MetodosAlumno.insercion(arreglo, arreglo, posicion, valor);

            assertArrayEquals(resultado_esperado, resultado_uno);
            assertArrayEquals(resultado_esperado, resultado_dos);
        } catch (MetodosGalo.ArregloFueraDeRangoException e){
            fail("No se esperaba una excepcion: " + e.getMessage());
        }
    }

    @Test
    public void testComparacionDeMetodosBuscar(){
        int[] arreglo = {1, 2, 3, 4, 5};
        int numero = 3;

        int resultado_esperado = 2;

        int resultado_uno = MetodosGalo.buscar(arreglo, numero);
        int resultado_dos = MetodosAlumno.buscar(arreglo, numero);

        assertEquals(resultado_esperado, resultado_uno);
        assertEquals(resultado_esperado, resultado_dos);
    }

    @Test
    public void testComparacionDeMetodosContenido(){
        int[] arreglo_uno = {1, 2, 3, 4, 5};
        int[] arreglo_dos = {3, 4};

        boolean resultado_esperado = true;

        boolean resultado_uno = MetodosGalo.esContenido(arreglo_uno, arreglo_dos);
        boolean resultado_dos = MetodosAlumno.contenido(arreglo_uno, arreglo_dos);

        assertEquals(resultado_esperado, resultado_uno);
        assertEquals(resultado_esperado, resultado_dos);
    }
}

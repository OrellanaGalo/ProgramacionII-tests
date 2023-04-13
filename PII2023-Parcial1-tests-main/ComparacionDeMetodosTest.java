import static org.junit.Assert.assertArrayEquals;
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
}

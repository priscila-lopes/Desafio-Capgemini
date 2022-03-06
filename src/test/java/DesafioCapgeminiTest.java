import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesafioCapgeminiTest {

    @Test
    @DisplayName("Desafio 1: mediana de [9, 2, 1, 4, 6] deve ser 4")
    void testDesafio1(){
        Integer[] array = {9, 2, 1, 4, 6};
        assertEquals(4, Desafio1.obterMediana(array), "Mediana da lista [9, 2, 1, 4, 6] deve ser 4");
    }

    @Test
    @DisplayName("Desafio 2: deve conter 3 pares com diferença de de 2 na lista [1, 5, 3, 4, 2]")
    void testDesafio2(){
        Integer[] array = {1, 5, 3, 4, 2};
        assertEquals(3, Desafio2.obterNumeroDePares(array, 2), "Deve conter 3 pares com diferença de de 2 na lista [1, 5, 3, 4, 2]");
    }

    @Test
    @DisplayName("Desafio 3: deve encriptar 'tenha um bom dia' para 'taoa eum nmd hbi'")
    void testDesafio3(){
        String s = "tenha um bom dia";
        assertEquals("taoa eum nmd hbi", Desafio3.encriptarTexto(s), "deve encriptar 'tenha um bom dia' para 'taoa eum nmd hbi'");
    }


}

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {

@Test
    void test() {

    Orquestra orq = new Orquestra();

    orq.cadastrarInstrumento(new Instrumento("trompete", "Bb"));

    assertEquals(orq.getInstrumentos().size(),1);

    List<Instrumento> encontrados = orq.buscarInstrumentoNome("trompete");

    assertEquals(encontrados.get(0).getAfinacao(), "Bb");

    System.out.println(encontrados);

    for (Instrumento i : encontrados) {
        System.out.println("Instrumento encontrado: " + i.getNome() + " - Afinação: " + i.getAfinacao());
    }

}
}

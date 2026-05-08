import java.util.LinkedList;
import java.util.List;

public class Orquestra {

    private List<Instrumento> instrumentos = new LinkedList<Instrumento>();

    public void cadastrarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public List<Instrumento> buscarInstrumentoNome(String nome) {
        List<Instrumento> encontrados = new LinkedList<Instrumento>();
        for (Instrumento instrumento : instrumentos) {
            if (instrumento.getNome().equals(nome)) {
                encontrados.add(instrumento);
            }
        }
    return encontrados;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }
}

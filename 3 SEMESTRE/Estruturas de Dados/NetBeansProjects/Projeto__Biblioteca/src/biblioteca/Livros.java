package biblioteca;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//Classe auxiliar

@XmlRootElement(name = "livros")
public class Livros {

    private List<Livro> livros;

    @XmlElement(name = "livro")
    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}

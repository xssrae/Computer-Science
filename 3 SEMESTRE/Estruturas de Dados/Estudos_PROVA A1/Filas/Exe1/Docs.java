package Filas.Exe1;

public class Docs {
    private String nomeDoc;
    private int qtdeDoc;

    public Docs (String nomeDoc, int qtdeDoc ){
        setNomeDoc(nomeDoc);
        setQtdeDoc(qtdeDoc);
    }

    @Override
    public String toString() {
        return getNomeDoc() + ".doc" + getQtdeDoc() + "pgs.";
    }

    public void setNomeDoc(String nomeDoc) {
        this.nomeDoc = nomeDoc;
    }
    public void setQtdeDoc(int qtdeDoc) {
        this.qtdeDoc = qtdeDoc;
    }
    public String getNomeDoc() {
        return nomeDoc;
    }
    public int getQtdeDoc() {
        return qtdeDoc;
    }
}

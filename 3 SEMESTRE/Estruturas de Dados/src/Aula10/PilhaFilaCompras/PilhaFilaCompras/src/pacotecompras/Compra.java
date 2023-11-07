package pacotecompras;

public class Compra {
    private String nomeComprador;
    private String nomeProduto;
    private float valorProduto;

    public Compra(String nomeComprador, String nomeProduto, float valorProduto) {
        this.nomeComprador = nomeComprador;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return "comprador=" + getNomeComprador() + ", produto="
               + getNomeProduto() + ", R$ " + getValorProduto() ;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }
      
}

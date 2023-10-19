public class Produto {
    private int codigo;
    private int quantidade;
    public Produto(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Codigo=" + codigo + ", Quantidade=" + quantidade + "\n";
    }
}

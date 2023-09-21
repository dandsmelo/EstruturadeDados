public class AlunoES {
    private String nome;
    private String ra;
    public AlunoES(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    @Override
    public String toString() {
        return "AlunoES [nome=" + nome + ", ra=" + ra + "]";
    }

    
}

public class PilhaLL {
    private No topo;
    public PilhaLL(){
        topo = null;
    }

    public void empilha(int e){
        No novo = new No(e);
        novo.prox = topo;
        topo = novo;
    }

    public boolean vazia(){
        return topo == null;
    }

    public int desempilha() throws Exception{
        if (vazia())
            throw new Exception("ERRO! Pilha Vazia");
        else{
            int r = topo.dado;
            topo = topo.prox;
            return r;
        }
    }

    public String toString(){
        String r = "";
        No aux = topo;
        while(aux != null){
            r = r + "\t" + aux.dado;
            aux = aux.prox;
        }
        return r;
    }
}

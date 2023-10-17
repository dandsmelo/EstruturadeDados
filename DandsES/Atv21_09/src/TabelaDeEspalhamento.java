public class TabelaDeEspalhamento {
    private ListaLigada tabela[];
    public TabelaDeEspalhamento(int qtd){
        tabela = new ListaLigada[qtd];
    }
    public int fEspalha(int chave){
        return chave-1;
    }
    public void adiciona(int origem, int destino){
        if (origem >= 0 && origem < tabela.length && destino >= 0 && destino < tabela.length){
            int indice = fEspalha(origem);
            if(tabela[indice] == null){
                tabela[indice] = new ListaLigada();
            }
            tabela[indice].adicionaFinal(destino);
        } else {
            System.out.println("ERRO! Origem ou Destino invalido");
        }
    }
    public String toString(){
        String r = "";
        for(int i = 0; i<tabela.length; i++){
            if(tabela[i] != null){
                r = r + i + "\t=>" + tabela[i].toString() + "\n";
            }
        }
        return r;
    }
}

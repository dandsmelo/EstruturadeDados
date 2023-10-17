public class TesteTabela {
    public static void main(String[] args){
        TabelaDeEspalhamento t = new TabelaDeEspalhamento(3);
        t.adiciona(1, 2);
        t.adiciona(1, 3);
        t.adiciona(2, 1);
        t.adiciona(3, 2);
    }
}

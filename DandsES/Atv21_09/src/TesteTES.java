public class TesteTES {
    public static void main(String[] args){
        TabelaDeEspalamentoSimples t = new TabelaDeEspalamentoSimples(0);
        try{
            t.adiciona(100, 11);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Estado da Tabela de Espalhamento");
        t.toString();
    }
}

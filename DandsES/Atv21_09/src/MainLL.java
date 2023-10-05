public class MainLL {
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        lista1.adicionaInicio(90);
        lista1.adicionaInicio(10);
        lista1.adicionaInicio(20);
        System.out.println("Lista: "+lista1.toString());
        try{
          int valor = lista1.removeInicio();
          System.out.println("Elemento Removido " + valor);
          System.out.println("Lista: "+lista1.toString());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

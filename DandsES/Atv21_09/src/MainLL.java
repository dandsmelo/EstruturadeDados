public class MainLL {
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        try{
          lista1.adicionaFinal(15);
          System.out.println("Removido" + lista1.removeFinal());
          lista1.adicionaFinal(10);
          lista1.adicionaFinal(100);
          System.out.println("Removido" + lista1.removeFinal());
          lista1.adicionaFinal(101);
          lista1.adicionaFinal(1001);
          lista1.adicionaFinal(15);
          lista1.adicionaFinal(150);
          System.out.println("Removido" + lista1.removeFinal());
          System.out.println(lista1.toString());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

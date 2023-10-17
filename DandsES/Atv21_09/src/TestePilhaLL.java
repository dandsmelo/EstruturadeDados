public class TestePilhaLL {
    public static void main(String[] args){
        PilhaLL p1 = new PilhaLL();
        FilaLL f1 = new FilaLL();
        int i = 1;
        while (i <= 5) {
            f1.adiciona(i*5);
            i = i + 1;
        }
        if(!f1.vazia()){
            System.out.println("Elementos da fila: "+f1.toString());
        } else {
            System.out.println("Fila vazia");
        }

        if(!p1.vazia()){
            System.out.println("\n\nElementos da pilha: "+p1.toString());
        } else {
            System.out.println("\n\nPilha vazia");
        }

        while(!f1.vazia()){
            p1.empilha(f1.remove());
        }
    }
}

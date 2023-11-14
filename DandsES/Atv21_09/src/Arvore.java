public class Arvore {
    private NoArvore raiz;
    public Arvore



public void preOrdem(No n){
    if(n != null){
        sout(n.elemento);
        preOrdem(n.esquerda);
        preOrdem(n.direita);
    }
}

public int somaPreOrdem(No n){
    if( n!= null){
        return n.elemento + somaPreOrdem(n.esquerdo) + somaPreOrdem(n.direita);
    }
    return 0;
}
}

public class Arvore{	
	private NoArvore raiz;
	public Arvore ( ){
		raiz=null;
	}
	public void adicionaElemento(int e){
		NoArvore novo = new NoArvore(e);
		if(raiz == null)
			raiz = novo;
		else{
			NoArvore aux1=raiz, aux2=raiz;
			while(aux1 != null && aux1.elemento!=e){
				aux2=aux1;
				if(e<aux1.elemento)
					aux1=aux1.esquerda;
				else if(e>aux1.elemento)
					aux1=aux1.direita;
			}
			if(aux1 != null && e == aux1.elemento) 
           System.out.println("Elemento já existe");
			else{
				if(e < aux2.elemento) aux2.esquerda = novo;
				if(e > aux2.elemento) aux2.direita = novo;
				System.out.println("Elemento Incluído "+novo.elemento);
			}
		} 
	}
	
public NoArvore removeMinimo(NoArvore node) {
            if (node == null) {
                System.out.println("ERRO");
            } else if (node.esquerda != null) {
                node.esquerda = removeMinimo(node.esquerda);
                return node;
            } else {
                return node.direita;
            }
            return null;
        }
        public NoArvore encontraMinimo(NoArvore node) {
            if (node != null) {
                while (node.esquerda != null) {
                    node = node.esquerda;
                }
            }
            return node;
        }    

   public void remove (int e){
       if (raiz == null) {
                System.out.println("Arvore vazia ");
            } else
       if (raiz.elemento == e){
            if (raiz.esquerda != null && raiz.direita != null){
                System.out.println("Removeu No com o elemento " + raiz.elemento);
                raiz.elemento = encontraMinimo(raiz.direita).elemento;
                raiz.direita = removeMinimo(raiz.direita);
            }
            else {
                System.out.println("Removeu No com a matricula " + raiz.elemento);
                raiz = (raiz.esquerda != null) ? raiz.esquerda : raiz.direita;
            }
       }else        remover(raiz, e);
           
       
       
   }

    public NoArvore remover(NoArvore node, int e) {

            if (node == null) {
                System.out.println("Arvore vazia ");
            }else
            if (e < node.elemento) {
                node.esquerda = remover(node.esquerda, e);
            }
            else if (e > node.elemento) {
                node.direita = remover(node.direita, e);
            }
            else if (node.esquerda != null && node.direita != null){
                System.out.println("Removeu No com o elemento " + node.elemento);
                node.elemento = encontraMinimo(node.direita).elemento;
                node.direita = removeMinimo(node.direita);
            }
            else {
                System.out.println("Removeu No com a matricula " + node.elemento);
                node = (node.esquerda != null) ? node.esquerda : node.direita;
            }
            return node;
        }
   
   
	public void profundidade(NoArvore n){
	       if (n!=null){
			    System.out.print(" "+n.elemento);
				 profundidade(n.esquerda);
				 profundidade(n.direita);
			 }
	}

	public void ordemSimetrica(NoArvore n){
	       if (n!=null){
				 ordemSimetrica(n.esquerda);
			    System.out.print(" "+n.elemento);
				 ordemSimetrica(n.direita);
			 }
	}
	
	public void posOrdem(NoArvore n){
	       if (n!=null){
				 posOrdem(n.esquerda);
				 posOrdem(n.direita);
			    System.out.print(" "+n.elemento);
			 }
	}
   
   public int soma(NoArvore n){
          int resp=0;
	       if (n!=null){
				 resp = soma(n.esquerda)+
				 soma(n.direita)+ n.elemento;
			 }
          return resp;
	}
   
   public int conta(NoArvore n){
          int resp=0;
	       if (n!=null){
				 resp = conta(n.esquerda)+
				 conta(n.direita)+ 1;
			 }
          return resp;
	}
   
public double media (){
     int s=soma (raiz);
     double c=conta (raiz);
     return s/c;
}
			 public NoArvore obtemRaiz(){
			    return raiz;
			 }
	public static void main(String args[]){
	    Arvore a = new Arvore();
		 a.adicionaElemento(10);
 		 a.adicionaElemento(4);
		 a.adicionaElemento(12);
 		 a.adicionaElemento(1);
 		 a.adicionaElemento(13);
 		 a.adicionaElemento(11);		 
  		 a.adicionaElemento(7);
		 System.out.println("\nProfundidade");
		 a.profundidade(a.obtemRaiz());
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());
		 System.out.println("\nPos Ordem");
		 a.posOrdem(a.obtemRaiz());
       System.out.println("Soma "+a.soma(a.obtemRaiz()));
       System.out.println("Conta "+a.conta(a.obtemRaiz()));
       System.out.println("Média dos elementos "+a.media());
       a.remove(10);
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());
       a.remove(1);
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());
       a.remove(12);
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());
       a.remove(13);
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());
       a.remove(11);
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());
       a.remove(7);
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());
       a.remove(4);
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());

	} 
}
public class ListaDeInteiros{
    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax){
        dados = new int[capMax];

        //o java pré inicializa os atributos do tipo inteiro com o valor 0, do tipo real com o valor 0.0 e atributos com o tipo abstratato de dados são inicializados com null. Portanto tamanho recebeu o valor 0 
    }

    public void adicionaFinal(int e)throws Exception{
         if(dados.length != tamanho){
        //não está cheia
        dados[tamanho] = e;
        tamanho = tamanho + 1;
        } else{
            //sim está cheia
            throw new Exception("ERRO! Lista cheia");
        }
    }

   public String toString(){
    String s = "Elementos: ";
    for (int i=0 ;i<tamanho;i++){
        s = s + " " + dados[i];
   }
   s = s + "\nTamanho: " + tamanho;
   return s;
    }

    public int obterUltimo()throws Exception{
        if(vazia())
            throw new Exception("ERRO! Lista Vazia");
        else
            return dados[tamanho-1 ];
    }

    public int obterPrimeiro()throws Exception{
        if(!vazia())
            return dados [0];
        else 
        throw new Exception("ERRO! Lista Vazia");
    }

    public int removeFinal ( )throws Exception{
        if (!vazia()) {
        // não está vazia
        tamanho = tamanho - 1;
        return dados[tamanho] ;
        } else {
        //sim está vazia
        throw new Exception("ERRO! Lista Vazia");
        }
    }
        
        public boolean vazia(){
            return tamanho == 0;
        }

        public boolean cheia(){
            return tamanho == dados.length;
        }
}
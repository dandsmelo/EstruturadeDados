public class ListaDeAlunos {
    private AlunoES alunos[];
    private int tamanho;

    public ListaDeAlunos(int capMax){
        alunos = new AlunoES[capMax];
    }

    public void adicionaFinal(AlunoES e)throws Exception{
        if(alunos.length != tamanho){
       //não está cheia
       alunos[tamanho] = e;
       tamanho = tamanho + 1;
       } else{
           //sim está cheia
           throw new Exception("ERRO! Lista cheia");
       }
   }
   public String toString(){
    String s = "Elementos: ";
    for (int i=0 ;i<tamanho;i++){
        s = s + " " + alunos[i].toString();
   }
   s = s + "\nTamanho: " + tamanho;
   return s;
    }

    public boolean vazia(){
        return tamanho == 0;
    }

    public boolean cheia(){
        return tamanho == alunos.length;
    }

    public AlunoES obterUltimo()throws Exception{
        if(vazia())
            throw new Exception("ERRO! Lista Vazia");
        else
            return alunos[tamanho-1 ];
    }

    public AlunoES obterPrimeiro()throws Exception{
        if(!vazia())
            return alunos[0];
        else 
        throw new Exception("ERRO! Lista Vazia");
    }

    public AlunoES removeFinal ( )throws Exception{
        if (!vazia()) {
        // não está vazia
        tamanho = tamanho - 1;
        return alunos[tamanho] ;
        } else {
        //sim está vazia
        throw new Exception("ERRO! Lista Vazia");
        }
    }

}

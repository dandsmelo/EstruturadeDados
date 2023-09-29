import java.util.Scanner;

public class Teste2 {
    public static void main(String args[]){
        ListaDeInteiros lista1 = new ListaDeInteiros(5);
        int op, valor;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1-Adicionar no final\n2-Adicionar no início");
            System.out.println("3-Remover do final\n4-Remover do início");
            System.out.println("5-Consulta a lista\n6-Consultar o último elemento");
            System.out.println("7-Consultar o primeiro elemento\n99-Sair");
            op=sc.nextInt();
            try{
                switch(op){
                    case 1: 
                       System.out.println("Valor? ");
                       valor = sc.nextInt();
                       lista1.adicionaFinal(valor);
                       break;
                    case 2:
                       System.out.println("Em implementação ");
                       break;
                    case 3:
                       valor = lista1.removeFinal();
                       System.out.println("Elemento removido " + valor);
                       break;   
                    case 4:
                       System.out.println("Em implementação ");
                       break;
                    case 5:
                       System.out.println("Lista: " + lista1.toString());
                       break;
                    case 6:
                       System.out.println("Último elemento " + lista1.obterUltimo());
                       break;
                    case 7:
                        System.out.println("Primeiro elemento "+lista1.obterPrimeiro());
                        break;
                    case 99:
                       System.out.println("Saindo.... ");
                       break;
                    default:
                       System.out.println("Opção Inválida");
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
       } while(op != 6);
    }
}

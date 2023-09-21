import java.util.Scanner;

public class TesteAluno {
    public static void main(String args[]){
        ListaDeAlunos listaA = new ListaDeAlunos(10);
        int op, al;
        String ra, nome;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Digite a operação desejada:");
            System.out.println("1-Adicionar no Final\n2-Adicionar no início");
            System.out.println("3-Remover do final\n4-Remover do início");
            System.out.println("5-Consulta a lista\n6-Consultar o último elemento");
            System.out.println("7-Consultar o primeiro elemento\n99-Sair");
            op = sc.nextInt();

            try{
                switch (op){
                    case 1: 
                        System.out.println("RA:");
                        ra = sc.nextLine();
                        System.out.println("Nome:");
                        nome = sc.nextLine();
                        listaA.adicionaFinal(new AlunoES(nome,ra));
                        break;
                    case 2:
                        System.out.println("");
                        break;
                }
            }
        } while(op !=10);
    }
}

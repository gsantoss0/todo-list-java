import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void listarTarefas(ArrayList<String> tarefas) {
    for (int i = 0; i < tarefas.size(); i++) {
        System.out.println(i + " - " + tarefas.get(i));
    }
}
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 5){
            System.out.println("================ LISTA DE TAREFAS =================");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Marcar tarefa como concluída");
            System.out.println("5 - sair");
            System.out.println("===================================================");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
            
                case 1:
                    boolean continuar = true;
                    
                    while (continuar) {
                    
                    System.out.println("Digite a tarefa: ");
                    String tarefa = sc.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada.");
                    System.out.println("Deseja adicionar outra tarefa?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Voltar ao MENU");
                    int decisao = sc.nextInt();
                    sc.nextLine();
                    if (decisao == 2) {
                        continuar = false;
                        }
                    }
                break;
                
                case 2:
                    listarTarefas(tarefas);
                    System.out.println("");
                    System.out.println("Pressione qualquer tecla para voltar ao MENU.");
                    sc.nextLine();
                break;
                
                case 3:
                    listarTarefas(tarefas);
                    System.out.println("");
                    System.out.println("Qual tarefa deseja remover?");
                    int indiceTarefa = sc.nextInt();
                    if (indiceTarefa >= 0 && indiceTarefa < tarefas.size()) {
                    tarefas.remove(indiceTarefa);
                    System.out.println("");
                    System.out.println("Tarefa removida. Pressione qualquer tecla para voltar ao MENU.");
                    } else{ 
                        System.out.println("");
                        System.out.println("Índice inválido! Pressione qualquer tecla para voltar ao MENU e tentar novamente.");
                    }
                    
                    
                    sc.nextLine();
                    sc.nextLine();
                break;
                
                case 4:
                    listarTarefas(tarefas);
                    System.out.println("");
                    System.out.println("Qual tarefa deseja marcar como concluída?");
                    int indice = sc.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                    String tarefa = tarefas.get(indice);
                    tarefa = tarefa + " [OK]";
                    
                    tarefas.set(indice, tarefa);
                    System.out.println("");
                    System.out.println("Tarefa "+ indice + " marcada como concluída. Pressione qualquer tecla para voltar ao MENU.");
                    
                    } else {
                        System.out.println("");
                        System.out.println("Índice inválido! Pressione qualquer tecla para voltar ao MENU e tentar novamente.");
                    }
                    sc.nextLine();
                    sc.nextLine();
                break;
            }
        }
    }
}

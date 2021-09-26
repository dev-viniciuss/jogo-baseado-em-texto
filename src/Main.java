import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introdução da História");
        System.out.println("Personagem Controlave Helena");
        Scanner input = new Scanner (System.in);
        String inventario[] = new String[10];
        String acesso_rapido[] = new String[2];
        
        int ivnt = 1;
        do {
            System.out.println("Acesse seu inventario pressionando: i");
            String acessar_iventario = input.nextLine();
            
            if (acessar_iventario.equalsIgnoreCase("i")) {
            	System.out.println(Arrays.toString(inventario).replace("null", "Espaço Vazio"));
            	ivnt -= 1;
            	
            }	else {
            	System.out.println("Aperte a tecla 'i'");
            	
            }
            } while(ivnt == 1);
        
        
        System.out.println("\nDescrição de cenario: Você está na instituição medica deitado na cama de um quarto, seus pais estão ao seu lado\n\nAções:\n\n1/Levantar da cama\n2/Interagir com seus pais\n3/Fingir que ainda está dormindo");
        int acao = input.nextInt();
        Acao_1(acao);
    }
    static void Acao_1(int acao) {
    	if (acao == 1) {
        	System.out.println("Você levanta da cama");
        	
    	}	else if (acao == 2) {
        	System.out.println("Você conversa com seus pais");
        	
    	}	else if (acao == 3) {
        	System.out.println("Seus pais pucham sua bocheca, percebendo que você esta fingindo dormir");
        	
    	}	else {
        	System.out.println("Selecione uma das ações: 1/2/3");

    	}
    }
}

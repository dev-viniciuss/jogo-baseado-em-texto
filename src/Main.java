import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introdu��o da Hist�ria");
        System.out.println("Personagem Controlave Helena");
        Scanner input = new Scanner (System.in);
        String inventario[] = new String[10];
        String acesso_rapido[] = new String[2];
        
        int ivnt = 1;
        do {
            System.out.println("Acesse seu inventario pressionando: i");
            String acessar_iventario = input.nextLine();
            
            if (acessar_iventario.equalsIgnoreCase("i")) {
            	System.out.println(Arrays.toString(inventario).replace("null", "Espa�o Vazio"));
            	ivnt -= 1;
            	
            }	else {
            	System.out.println("Aperte a tecla 'i'");
            	
            }
            } while(ivnt == 1);
        
        
        System.out.println("\nDescri��o de cenario: Voc� est� na institui��o medica deitado na cama de um quarto, seus pais est�o ao seu lado\n\nA��es:\n\n1/Levantar da cama\n2/Interagir com seus pais\n3/Fingir que ainda est� dormindo");
        int acao = input.nextInt();
        Acao_1(acao);
       

        System.out.println("\nObjetivo: Voc� t�m de sair da institui��o, sem que seus pais ou os funcionarios da institui��o te descubram");
        System.out.println("O doutor chama seus pais para conversar fora do seu quarto, o que voc� faz?\n1 - Se esconde de baixo da cama\n2 - Tenta entrar no tubulo de ventila��o no teto de seu quarto\n3 - Espera seus pais voltarem");

        
    }
         
    static void Acao_1(int acao) {
    	if (acao == 1) {
        	System.out.println("Voc� levanta da cama");
        	
    	}	else if (acao == 2) {
        	System.out.println("Voc� conversa com seus pais");
        	
    	}	else if (acao == 3) {
        	System.out.println("Seus pais pucham sua bocheca, percebendo que voc� esta fingindo dormir");
        	
    	}	else {
        	System.out.println("Selecione uma das a��es: 1/2/3");

    	}
    	
    }
}

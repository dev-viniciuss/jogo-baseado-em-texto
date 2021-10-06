import java.util.Scanner;


public class Main {

    public static void main(String args[]) {

        Scanner t = new Scanner(System.in);
        
        
        System.out.println("Chegando nos fundos do Instituto você avista 2 possibilidades, uma escada que leva para o telhado ou \n" +
                "uma porta dos fundos protegida por um único guarda armado. Por onde você quer seguir? \n" +
                "escada | porta");
        String acao = t.nextLine();

        switch (acao) {


            case "porta":
                System.out.println("Um dos membros da Ferrovia rapidamente tenta neutralizar o guarda, porém ele consegue acionar os alarmes antes de desmaiar,\n" +
                        "e no desespero vocês começam a adentrar com tudo no Instituto...");
                System.out.println("Vocês começam a avançar em direção ao galpão que ficam todos os Sintéticos, porém quanto mais soldados vocês derrubam, \n" +
                        "mais começam a aparecer, e uma frota gigante começa a correr na direção de vocês.\n" +
                        "Você quer desviar para a esquerda, ou ir de frente e lutar?\n" +
                        "esquerda | lutar");

                String tatakae = t.nextLine();
                switch (tatakae) {
                    case "lutar":
                        System.out.println("Tiros rodam todos os corredores do Instituto, vindo de todos os lados, porém diversos soldados de elite não param de aparecer,\n" +
                                "e cercam todo o seu grupo em uma sala sem saída... Ainda lutando, todos tentam revidar, mas nada era suficiente...\n" +
                                "a morte de todos os invasores que lutavam por liberdade chegou.\n" +
                                "Fim");

                    case "esquerda": 
                        System.out.println("Mesmo correndo o máximo, todas as forças do Instituto se encontravam no primeiro andar, e aos poucos vocês começam a ser\n" +
                        "engolidos pela frota de soldados, resultando no seu final...\n" +
                        "Fim.");             
                }
                break;

            case "escada":
                System.out.println("Vocês passam silenciosamente pelos fundos do Instituto e começam a subir as escadas... No topo das\n" +
                        "escadas vocês avistam um guarda no topo do telhado e a porta um pouco mais a esquerda. Você quer elimitar o guarda primeiro,\n" +
                        "ou passar sorrateiramente até a porta?\n" +
                        "guarda | porta");

                String seguir = t.nextLine();

                switch (seguir) {

                    case "guarda":
                        System.out.println(" Você rapidamente acerta uma coronhada na nuca do guarda, nacuteando ele na hora, então todos seguem para a porta...");
                        System.out.println("Porém com o abrir da porta sem identificação, O ALARME COMEÇA A SOAR POR TODO O INSTITUTO!...");
                        break;
                    case "porta":
                        System.out.println("Vocês tentam entrar pela porta diretamente, porém quando iam adentrar o guarda os avistou e soou os alarmes!!\n" +
                        "Então vocês começam a descer imediatamente as escadas.");
                        break;
                    default:
                        System.out.println("Opção invalida");


                }
            System.out.println("Entrando no Instituto centenas de guardas começam a persegui-los, enquanto vocês tentam alcançar os galpões onde ficam os Sintéticos");
            System.out.println("Lutando bravamente contra todos os soldados vocês alcançam o galpão dos Sintéticos, onde seus pais estão presos também");
            System.out.println("Você quer começar a iniciar os Sintéticos junto dos Ferrovia, ou ir direto em seus pais?\n" +
            "sinteticos | pais");

        String fim = t.nextLine();    
    
        switch (fim) {

            case "sinteticos":
            System.out.println("Você se direciona aos Sintéticos e começa a ligar um por um, então começam a se levantar, e com as ordens da Ferrovia\n" +
            "os Sintéticos começam a ajudar a fazer frente contra as tropas do Instituro, criando uma resistência enorme.\n" + 
            "Mas cada vez mais tropas começam a se mobilizar, e vocês tem que sair logo de dentro, porém seus pais ainda estão presos.\n" +
            "Você quer fugir com todos, ou ir atrás dos seus pais?\n" +
            "fugir | pais");
            String fimb = t.nextLine();
            switch (fimb) { 

                case "fugir":
                System.out.println("Você deixa para trás seus pais, pela dificuldade da situação, e foge junto com todos em meio ao combate,\n" +
                "conseguindo liberar a maioria dos Sintéticos e levando eles para a liberdade...\n" +
                "Fim.");  


            case "pais":
            System.out.println("Você começa a correr na direção da sela de seus pais, e começa a tentar abrir a porta, enquanto isso várias tropas\n" +
            "do Instituto começam a invadir a sala e uma luta começa entre os Sintéticos e as tropas.\n" +
            "Todos começam a fugir em meio a luta para sair com vida, e você finalmente solta seus pais, porém ja estão ficando para trás.\n" +
            "Nessa hora, 5 soldados se direcionam a vocês. Você quer correr com tudo ou tentar segurar os 5?\n" +
            "correr | segurar");


            String fima = t.nextLine(); 

            switch (fima) { 

                case "correr":
                System.out.println("Correndo com tudo que tem, vocês começam a chegar proximo da saida, porém quando estava prestes a sair seus pais são atingidos\n" +
                "em meio a chuva de tiros vindo dos soldados...\n" +
                "Vocês conseguem sair do Instituto e fugir, porém seus pais foram eliminados na saída...\n" +
                "Fim.");

                case "segurar":
                System.out.println("Você fica para trás para tentar segurar os soldados e seus pais saem na frente junto da Ferrovia\n" +
                "Você tenta retomar ao grupo, porém é engolido pelos soldados do Instituto... Dando a sua vida para salvar a todos.\n" +
                "Fim.");


        
        
        
        }

    }
 }
}
    }
}
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
                        " e no desespero vocês começam a adentrar com tudo no Instituto...");
                System.out.println("Vocês começam a avançar em direção ao galpão que ficam todos os Sintéticos, porém quanto mais soldados vocês derrubam, \n" +
                        " mais começam a aparecer, e uma frota gigante começa a correr na direção de vocês.\n" +
                        "Você quer desviar para a esquerda, ou ir de frente e lutar?\n" +
                        "esquerda | lutar");

                String tatakae = t.nextLine();
                switch (tatakae) {
                    case "lutar":
                        System.out.println("Tiros rodam todos os corredores do Instituto, vindo de todos os lados, porém diversos soldados de elite não param de aparecer,\n" +
                                " e cercam todo o seu grupo em uma sala sem saída... Ainda lutando, todos tentam revidar, mas nada era suficiente...\n" +
                                "a morte de todos os invasores que lutavam por liberdade chegou.\n" +
                                "Fim");
                }
                break;

            case "escada":
                System.out.println("Vocês passam silenciosamente pelos fundos do Instituto e começam a subir as escadas... No topo das\n" +
                        " escadas vocês avistam um guarda no topo do telhado e a porta um pouco mais a esquerda. Você quer elimitar o guarda primeiro,\n" +
                        " ou passar sorrateiramente ate a porta?\n" +
                        "guarda | porta");

                String seguir = t.nextLine();

                switch (seguir) {

                    case "guarda":
                        System.out.println(" Você rapidamente acerta uma coronhada na nuca do guarda, nacuteando ele na hora, então todos seguem para a porta...");
                        System.out.println("Porém com o abrir da porta sem identificação, O ALARME COMEÇA A SOAR POR TODO O INSTITUTO!...");
                        break;
                    case "porta":
                        System.out.println("Vocês tentam entrar pela porta diretamente, porém quando iam adentrar o guarda os avistou e soou os alarmes!!");
                        break;
                    default:
                        System.out.println("Opção invalida");

                        System.out.println(" entrando no Instituto centenas de guardas começam a persegui-los, enquanto vocês tentam alcançar os galpões onde ficam os Sintéticos");
                        System.out.println("Lutando bravamente contra todos os soldados vocês alcaçam o galpão dos Sintéticos");
                }

        }

    }
}
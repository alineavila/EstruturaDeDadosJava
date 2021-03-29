import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Vetor {
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for (int i=0; i < estados.length; i++) {
            System.out.println(estados[i]);
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Sigla para buscar");
        String siglaBusca = leitor.nextLine();

        boolean encontrou = false;
        for (int i = 0; i < estados.length; i++) {
            if (estados[i].equalsIgnoreCase(siglaBusca)) {
                encontrou = true;
                break;
            }
        }
        if (encontrou) {
            System.out.println("enontrou");
        } else {
            System.out.println("não encontrou");
        }

     }
}

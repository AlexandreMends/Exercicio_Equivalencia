package inatel.cdg.br;


import inatel.cdg.br.Empresario.Empresario;
import inatel.cdg.br.Jogador.Jogador1;
import inatel.cdg.br.Jogador.Jogador2;
import inatel.cdg.br.Jogador.Jogador3;

import java.util.*;


public class Main {
    public static void main (String[] agrs){
    Scanner entrada = new Scanner(System.in);
        List <String> listNomes = new ArrayList<>();
        List <Empresario> lista = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Entre com o nome " + (i + 1));
            listNomes.add(entrada.nextLine());
        }

        lista.add(new Jogador1(listNomes.get(0), new Random().nextDouble() * 100));
        lista.add(new Jogador2(listNomes.get(1), new Random().nextDouble() * 100));
        lista.add(new Jogador1(listNomes.get(2), new Random().nextDouble() * 100));
        lista.add(new Jogador3(listNomes.get(3), new Random().nextDouble() * 100));
        lista.add(new Jogador2(listNomes.get(4), new Random().nextDouble() * 100));
        lista.add(new Jogador3(listNomes.get(5), new Random().nextDouble() * 100));


    System.out.println("Lista sem ordenacao: ");
    for (Empresario empresario : lista) {
        empresario.info();
    }
    Collections.sort(lista);

    System.out.println("Lista ordenada: ");
    for (Empresario empresarioOrdenado : lista) {
        empresarioOrdenado.info();
    }

    }
}

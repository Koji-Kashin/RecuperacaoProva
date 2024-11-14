/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao02;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Questao07 {

    public static Scanner ler = new Scanner(System.in);
    public static String nomeFilme;
    public static String dicas[] = new String[5];

    public static void main(String[] args) {
        System.out.println("Jogo do filme!");
        jogadorUm();
        jogadorDois();
    }

    public static void jogadorUm() {
        System.out.print("Digite o seu nome jogador 1: ");
        String nomeJ1 = ler.nextLine();
        System.out.print("Agora digite o nome do filme: ");
        nomeFilme = ler.nextLine();

        System.out.println(nomeJ1 + " agora digite 5 dicas para o nome do filme");
        for (int i = 0; i < 5; i++) {
            System.out.println("Dica " + (i + 1) + ": ");
            dicas[i] = ler.nextLine();
        }
    }

    public static void jogadorDois() {
        System.out.println("Jogador 2 digite seu nome: ");
        String nomeJ2 = ler.nextLine();

        while (true) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Dica " + (i + 1) + " " + dicas[i]);
                System.out.print(nomeJ2 + " Digite o seu palpite: ");
                String palpite = ler.nextLine();

                if (palpite.equals(nomeFilme)) {
                    System.out.println("Voce acertou!");
                    return;

                } else {
                    System.out.println(" Voce errou, tente novamente \n");

                }

            }
        }
    }

}

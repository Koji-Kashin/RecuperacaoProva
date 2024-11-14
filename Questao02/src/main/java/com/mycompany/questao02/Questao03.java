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
public class Questao03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double vlrCafeExpresso = 0.75;
        double totalVlrExpr = 0;    // define o valor total inicial das vendas para somar
        int totalVendasCafeExp = 0;

        double vlrCapuccino = 1.00;
        int totalVendasCapu = 0;
        double totalVlrCapu = 0;  // define o valor total inicial das vendas para somar

        double vlrLeiteComCafe = 1.25;
        int totalVendasLCF = 0;
        double totalVlrLCF = 0; // define o valor total inicial das vendas para somar 

        double totalVendasTotal = 0; //define valor total inicial de todas as vendas

        int opcao = 0;

        System.out.println("--- Cafeteria ---");
        System.out.println("Digite a opcao desejada...\n");

        while (opcao != 4) {
            System.out.print("1 = Cafe expresso 2 = Capuccino 3 = Leite com Cafe\n");
            System.out.println("4 - Totalizar vendas");
            int esC = ler.nextInt();
            switch (esC) {
                case 1:
                    totalVlrExpr = (totalVlrExpr + vlrCafeExpresso);
                    totalVendasCafeExp = (totalVendasCafeExp + 1);

                    break;

                case 2:
                    totalVlrCapu = (totalVlrCapu + vlrCapuccino);
                    totalVendasCapu = (totalVendasCapu + 1);

                    break;

                case 3:
                    totalVlrLCF = (totalVlrLCF + vlrLeiteComCafe);
                    break;
                case 4:
                    opcao = 4;
                    System.out.println(" Quantidade de expressos vendidos: " + totalVendasCafeExp
                            + " Valor total de expressos vendidos: " + totalVlrExpr + "\n"
                            + " Quantidade de Capuccinos vendidos: " + totalVendasCapu
                            + " Valor total de Cappucinos vendidos: " + totalVlrCapu + "\n"
                            + " Quantiade total de Leite com Cafe vendidos: " + totalVendasLCF
                            + " Valor total de Leite com Cafe vendidos: " + totalVlrLCF);

                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

}

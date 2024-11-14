/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.questao02;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Questao02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ano = 365;
        int mes = 30;
        int dias = 0;
        int calc;

        System.out.print("Digite a sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Digite agora os meses de idade: ");
        int ms = ler.nextInt();
        System.out.println("Agora digite os dias de idade: ");
        dias = ler.nextInt();
        
        calc = (idade * ano) + (ms * mes) + dias;
        
        System.out.println("sua idade em dias eh: " + calc);    
        
        
    }
}

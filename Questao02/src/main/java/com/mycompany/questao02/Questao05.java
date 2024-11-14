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
public class Questao05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int user = 1234, password = 9999;
        int user_try = 0, pass_try = 0;

        System.out.print("Bem vindo, digite seu usuario: ");
        user_try = ler.nextInt();
        while (user_try != user) {
            System.out.println("Usuario incorreto, tente novamente");
            System.out.println(" ");
            System.out.print("Digite o usuario: ");
            user_try = ler.nextInt();
        }
        if (user_try == user) {
            System.out.println("...");
            System.out.println("Agora digite sua senha: ");
            pass_try = ler.nextInt();

        }
        while (pass_try != password) {
            System.out.println("senha incorreta, tente novamente");
            System.out.println(" ");
            System.out.print("Digite a senha: ");
            pass_try = ler.nextInt();
            if (pass_try == password) {
                System.out.println("Acesso garantido");

            }

        }

    }
}

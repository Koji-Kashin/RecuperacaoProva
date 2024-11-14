/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao02;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author d.rodrigues
 */
public class Questao08 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.print("Digite um numero para saber a tabuada: ");
        ler = dado.readLine();
        int num = Integer.parseInt(ler);

        String mensagem = "Tabuada de " + num + "\n";

        for (int i = 0; i <= 10; i++) {
            mensagem += num + " X " + i + " = " + (num * i) + "\n";
        }

        try (FileWriter arquivo = new FileWriter("C:\\Users\\d.rodrigues\\Desktop\\Tabuada" + num + ".txt")) {
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.println(mensagem);
        }

    }
}

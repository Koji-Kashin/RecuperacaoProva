/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao02;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author d.rodrigues
 */
public class Questao09 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String nomeLutador = "";
        double pesoLutador;
        
        String categoria[] = {"Pena","Leve","Ligeiro","Meio Medio","Medio","Meio pesado","Pesado"};
        
        System.out.print("Digite seu nome de lutador: ");
        nomeLutador = ler.nextLine();
        System.out.print("Agora digite o seu peso: ");
        pesoLutador = ler.nextFloat();
        if (pesoLutador <65 ) {
            int p = Arrays.binarySearch(categoria, 0);
            
        }
        if (pesoLutador >65 && pesoLutador <72) {
            int p = Arrays.binarySearch(categoria, 1);
            
            
        }
        if (pesoLutador >=72 && pesoLutador <79) {
            int p = Arrays.binarySearch(categoria, 2);
            
            
        }
        if (pesoLutador >=79 && pesoLutador <86) {
            int p = Arrays.binarySearch(categoria, 3);
            
            
        }
        if (pesoLutador >=86 && pesoLutador <93) {
            int p = Arrays.binarySearch(categoria, 4);
            
            
        }
        if (pesoLutador >+93 && pesoLutador <100) {
            int p = Arrays.binarySearch(categoria, 5);
            
            
        }    
        
        String mensagem = "Nome Fornecido: " + nomeLutador + "\n"
                + "Peso Fornecido: " + pesoLutador + "O lutador "
                + nomeLutador + " pesa " + pesoLutador + " e se enquadra na categoria " + categoria; 


        try (FileWriter arquivo = new FileWriter("//C:\\Users\\d.rodrigues\\Desktop\\Lutador" + ".txt")) {
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.println(mensagem);

        }
    }
}

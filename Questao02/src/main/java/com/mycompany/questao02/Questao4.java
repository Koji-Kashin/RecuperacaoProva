/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao02;

import java.io.DataInputStream;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Questao4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0;

        JOptionPane.showInputDialog("Digite um numero");
        DataInputStream num = new DataInputStream(System.in);
        n = ler.nextInt();
        
        int ant = n - 1;
        int suc = n + 1;

        JOptionPane.showMessageDialog(null, "Seu antecessor eh: " + ant + " e seu sucessor eh: " + suc);

    }
}

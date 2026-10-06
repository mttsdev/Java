/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tabuada;

import java.util.Scanner;
        
        
public class Tabuada {

    public static void main(String[] args) {
        Scanner ler;
        ler = new Scanner (System.in);
        int numero, i;
        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        System.out.println("-----------------------------");
        
        for (i=1;i<11;i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
            System.out.println("-");
        }        
    }
}

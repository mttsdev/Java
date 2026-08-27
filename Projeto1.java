/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto1;


public class Projeto1 {
    public static void main(String[] args) { // Rotina principal do programa
        float n1=0, n2=0;
        float n3;
        n3 = 9.5f; // Para identificar que é um float, usa-se o f no final do número
        double media;
        n1 = 6;
        n2 = 8;
        media = (n1 + n2) / 2;
        System.out.println("Média " + media); // System.out.println
        
        if (media >= 6) {
            System.out.println("Aprovado!");
        }
        
        else {
            if (media < 4) {
                System.out.println("Reprovado!");
            }
            else {
            System.out.println("Recuperação!");
            }
        }
    }
}
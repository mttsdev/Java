/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto03;
import java.util.Scanner;

public class Projeto03 {
    public static void main(String[] args) {
        Scanner ler;
        ler = new Scanner (System.in);
        double n1, n2, n3;
        System.out.println("Digite o n1: ");
        n1 = ler.nextInt();
        System.out.println("Digite o n2: ");
        n2 = ler.nextInt();
        System.out.println("Digite o n3: ");
        n3 = ler.nextInt();
        
        if (n1 > n2 && n1 > n3) {
            System.out.println("O " + n1 + "é o número maior");
        }
        
        if (n2 > n1 && n2 > n3) {
            System.out.println("O " + n2 + "é o número maior");
        }
        
        else {
            System.out.println("O " + n3 + "é o número maior");
        }
    }   
}

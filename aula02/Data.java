/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data;

import java.util.Scanner;

public class Data {

    public static void main(String[] args) {
        int dia, mes, ano;
        Scanner ler = new Scanner(System.in);
        DataS d1 = new DataS();
        System.out.println("Digite a data:");
        System.out.println("Dia:");
        dia = ler.nextInt();
        System.out.println("Mês:");
        mes = ler.nextInt();
        System.out.println("Ano:");
        ano = ler.nextInt();
        DataS d2 = new DataS(9, 9, 2026);
        d1.imprimeData();
        d2.imprimeData();
    }

}

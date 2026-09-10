/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testatriangulo;

public class TestaTriangulo {

    public static void main(String[] args) {
        System.out.println("Teste Triângulo");
        Triangulo t1 = new Triangulo ();
        Triangulo t2 = new Triangulo (10,5);
        System.out.println("T1 base:" + t1.base);
        System.out.println("T1 altura:" + t1.base);
        System.out.println("T2 base:" + t2.altura);
        System.out.println("T2 altura:" + t2.altura);
        System.out.println("Area: " + t2.CalculaArea());
    }
    
}

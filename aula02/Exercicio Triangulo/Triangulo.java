/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testatriangulo;

public class Triangulo {
    float base;
    float altura;

    public Triangulo() {
    }
   
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float CalculaArea() {
        float area;
        area = (base * altura)/2;
        return (area);
    }
    
}
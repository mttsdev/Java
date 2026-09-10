package data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class dataS {

    int dia;
    int mes;
    int ano;

    public dataS() {
    }

    public dataS(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }
    
    public void imprimeData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
}

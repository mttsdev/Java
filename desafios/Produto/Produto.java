package testeproduto;
public class Produto {
    String marca; 
    String fabricante; 
    String cod_barras; 
    double preco; 

    public Produto() {
    }

    public Produto(String marca, String fabricante, String cod_barras, double preco) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.cod_barras = cod_barras;
        this.preco = preco;
    }
    
    public void imprimeDados(){
        System.out.println("--- Dados do Produto ---");
        System.out.println("Marca.....: " + marca);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cod_barras: " + cod_barras);
        System.out.println("Preço.....: " + preco);
        System.out.println("-------------------------");
    }
    
}

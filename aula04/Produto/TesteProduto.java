package testeproduto;
import java.util.Scanner;
public class TesteProduto {
   /* static Produto p1;
    static Produto p2;
*/    
    static int posicao=0; 
    static int tamanho=3; 
    static Produto[] prods = new Produto[tamanho];
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        do {
            imprimeMenu();
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarProduto(); 
                    break;
                case 2:
                    listarProdutos(); 
                    break;
                case 3:
                    contarMarca(); 
                    break;
                case 4:
                    break;
                default: 
                    System.out.println("ERRO: Opcao invalida!!!");
            }

        } while (opcao != 4);

    }
    public static void contarMarca(){
        System.out.println("Digite a marca");
        String marca = ler.nextLine(); 
        marca = ler.nextLine(); 
        int qtde=0; 
        for(int i=0; i<prods.length; i++){
            if (prods[i].marca.equals(marca)){
                qtde = qtde + 1;                 
            }
        } 
        System.out.println("Qtde da marca:"+marca+" = " + qtde);
        
    }

    public static void listarProdutos(){
       /* prods[0].imprimeDados();
       prods[1].imprimeDados();
       prods[2].imprimeDados();
       prods[3].imprimeDados(); */ 
       int i=0; 
       for (i=0; i<prods.length; i++){
           if (prods[i] != null){
              prods[i].imprimeDados();
           }
       }
    }
    public static void cadastrarProduto(){
        System.out.println("--- Cadastro ---");
        System.out.println("Marca: ");
        String marca = ler.nextLine();
        marca = ler.nextLine();
        System.out.println("Fabricante: ");
        String fabricante = ler.nextLine(); 
        System.out.println("Cod. Barras: ");
        String cod_barras = ler.nextLine(); 
        System.out.println("Preco: ");
        Double preco = ler.nextDouble();
        if (posicao < 4){
           prods[posicao] = new Produto(marca,fabricante,cod_barras,preco);
           posicao = posicao + 1; 
           if (posicao == 4){
               System.out.println("Chegou no limite !!!!");
           }
        }
        else
        {
            System.out.println("ERRO: Limite de 4 produtos ");
        }
        /*
        if (p1 == null){
            p1 = new Produto(marca,fabricante,cod_barras,preco); 
        } else
        {
            if (p2  == null){
               p2 = new Produto(marca,fabricante,cod_barras,preco); 
            }
            else{
                System.out.println("Limite de cadastro de 2 produtos já realizado !!!");
            }
        }*/
    }
    
    public static void imprimeMenu() {
        System.out.println("--- Menu Principal ---");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Contar Marca");
        System.out.println("4 - Sair ");
        System.out.println("-----------------------");
        System.out.println("Digite a Opcao: ");
    }

}

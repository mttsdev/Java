import java.util.Random;
import java.util.Scanner;

public class Adivinha {
        public static void main(String[] args) {
                Random aleatorio = new Random();
                Scanner entrada = new Scanner(System.in);
                int num = aleatorio.nextInt(21); // 0 até 20
                int tentativa;
                System.out.println(&quot;Adivinhe o número entre 0 e 20!&quot;);
                do {
                        System.out.print(&quot;Digite sua tentativa: &quot;);
                        tentativa = entrada.nextInt();
                        if (tentativa &gt; num) {
                                System.out.println(&quot;O número é menor!&quot;);
                        } 
                        else if (tentativa &lt; num) {
                                System.out.println(&quot;O número é maior!&quot;);
                        } 
                        else {
                                System.out.println(&quot;Parabéns! Você acertou!&quot;);
                        }
                }  while (tentativa != num);
                entrada.close();
        }
}

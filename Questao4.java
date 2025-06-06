import java.util.ArrayList;
import java.util.Scanner;

public class Questao4 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    ArrayList<Double> vendas = new ArrayList<>();
    int[] contadores = new int[9];

    while (true) {
      System.out.print("Digite o valor das vendas brutas ( ou 00 para encerrar): ");
      double venda = leitura.nextDouble();
      if (venda == 00) {
        break;
      }
      vendas.add(venda);
    }

    for (double venda : vendas) {
      double salario = 200 + 0.09 * venda;
      int indice = (int) (salario / 100) - 2;
      if (indice >= 8) {
        contadores[8]++;
      } else if (indice >= 0) {
        contadores[indice]++;
      }
    }

    System.out.println("Distribuição de salários:");
    System.out.println("$200 - $299: " + contadores[0]);
    System.out.println("$300 - $399: " + contadores[1]);
    System.out.println("$400 - $499: " + contadores[2]);
    System.out.println("$500 - $599: " + contadores[3]);
    System.out.println("$600 - $699: " + contadores[4]);
    System.out.println("$700 - $799: " + contadores[5]);
    System.out.println("$800 - $899: " + contadores[6]);
    System.out.println("$900 - $999: " + contadores[7]);
    System.out.println("$1000 ou mais: " + contadores[8]);

    leitura.close();
  }
}

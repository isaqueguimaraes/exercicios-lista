import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    ArrayList<Double> notas = new ArrayList<>();

    while (true) {
      System.out.println("\nDigite a nota: (Para encerrar, digite -1)");
      double nota = leitura.nextDouble();

      if (nota == -1) {
        break;
      }

      notas.add(nota);
    }

    System.out.println("\nNotas na ordem em que foram informadas:");

    for (int i = 0; i < notas.size(); i++) {
      System.out.print(notas.get(i) + "; ");
    }

    System.out.println("\n\nNotas na ordem inversa à que foram informados:");

    for (int i = notas.size() - 1; i >= 0; i--) {
      System.out.println(notas.get(i) + " ");
    }

    double soma = 0;

    for (int i = 0; i < notas.size(); i++) {
      soma += notas.get(i);
    }

    System.out.println("\nA soma das notas é: " + soma);

    double media = soma / notas.size();

    System.out.println("\nA média das notas é: " + media);

    System.out.println("\nNotas acima da média calculada:");

    for (int i = 0; i < notas.size(); i++) {
      if (notas.get(i) > media) {
        System.out.println(notas.get(i) + ";");
      }
    }

    System.out.println("\nNotas abaixo de 7:");

    for (int i = 0; i < notas.size(); i++) {
      if (notas.get(i) < 7) {
        System.out.println(notas.get(i) + ";");
      }
    }

    System.out.println("\nPrograma encerrado!");

    leitura.close();
  }
}
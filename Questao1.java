import java.util.Scanner;

public class Questao1 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    double[] temperaturas = new double[12];
    String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };

    for (int i = 0; i < 12; i++) {
      System.out.println("\nDigite a temperatura média do mês de " + meses[i] + ":");
      temperaturas[i] = leitura.nextDouble();
    }

    double soma = 0;

    for (int i = 0; i < temperaturas.length; i++) {
      soma += temperaturas[i];
    }

    double media = soma / 12;

    System.out.printf("\nA média anual das temperaturas é: %.2f\n", media);

    System.out.println("\nMeses que tiveram a temperatura acima da média: ");

    for (int i = 0; i < 12; i++) {
      if (temperaturas[i] > media) {
        System.out.println(meses[i] + ": " + temperaturas[i]);
      }
    }

    leitura.close();
  }
}

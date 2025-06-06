import java.util.Scanner;

public class Questao2 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    String[] perguntas = { "Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?",
        "Devia para a vítima?", "Já trabalhou com a vítima?" };

    int respostasPositivas = 0;

    for (int i = 0; i < perguntas.length; i++) {
      System.out.println("\n" + perguntas[i]);
      String resposta = leitura.nextLine();

      if (resposta.equalsIgnoreCase("sim")) {
        respostasPositivas++;
      }
    }

    System.out.print("\nClassificação: ");
    if (respostasPositivas == 2) {
      System.out.println("Suspeita");
    } else if (respostasPositivas >= 3) {
      System.out.println("Cúmplice");
    } else if (respostasPositivas == 5) {
      System.out.println("Assassino");
    } else {
      System.out.println("Inocente");
    }

    leitura.close();
  }
}

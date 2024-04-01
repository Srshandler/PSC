import java.util.Scanner;

public class aula4 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double nota1, nota2, nota3, media;

    System.out.println("Digite a primeira");
    nota1 = ler.nextDouble();
    System.out.println("Digite a segunda");
    nota2 = ler.nextDouble();
    System.out.primtln("Digite a terceira");
    ;
    nota3 = ler.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;

    if (media >= 7) {
      System.out.println("Aprovado");

    } else {
    }

  }
}
import java.util.Scanner;

public class aula5 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double nota[] = new double[5];
    
    double cont, media;

    soma = 0;
    cont = 0;
    
    while(cont <5){
      System.out.print("Nota: ");
      nota[cont] = ler.out.nextDouble();

      soma = soma +nota[cont];

      cont = cont + 1;
      
    }
    media = soma / 5;

    if (media >= 7) {
      System.out.println("Aprovado com a média: "+ media);

    }else{
      System.out.println("Reprovado com a média: "+ media);
      
    }
  }
}
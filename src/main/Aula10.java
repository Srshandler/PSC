package dados;

public class Aula10{
  
  public static void  main(String[] args){
    int opcao;
    opcao = Integer.parseInt(JOptionPane.showInputDialog(
                            "Escolha sua opção: \n" +
                            "1 - Adição \n" +
                            "2 - Subtração \n" +
                            "3 - Multiplicação \n"+
                            "4 - Divisão \n"));
    switch(opcao){
      case 1 : modAdicao(); break;
    }
  static void modAdicao(){
    double v1;
    double v2;
    double res;
    v1 = Double.parseDouble(JOptionPane.showInputDialog(
      "Digite o primeiro valor: "
    ));
    v2 = Double.parseDouble(JOptionPane.showInputDialog(
      "Digite o segundo valor: "
    ));
    res = v1 + v2;
    JOptionPane.showInputDialog(null, "Resultado = " + res);
  }
}
import javax.swing.JOptionPane;
public class Exemplo_01 {

    public static void  main (String[] args){
        String nome;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null,
                "O"+ nome + "é o cara!"); //Saída da Variavel
    }
}
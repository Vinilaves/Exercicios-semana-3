import javax.swing.JOptionPane;
public class Exerc2
{
   public static void main (String args [])
   {
      double base = Double.parseDouble( JOptionPane.showInputDialog(" Digite a base: "));
      double altura = Double.parseDouble( JOptionPane.showInputDialog(" Digite a altura: "));
      
      double area = base * altura;
      
      JOptionPane.showMessageDialog(null, " Resultado " + base * altura); 
   }
}
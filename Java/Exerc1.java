import javax.swing.JOptionPane;
public class Exerc1
{
   public static void main( String args [])
   {
      int idade = Integer.parseInt( JOptionPane.showInputDialog (" Digite sua Idade: "));
      
      int dias = idade * 365;
   
      JOptionPane.showMessageDialog(null, " resultado " + dias ); 
   }
    
     
}
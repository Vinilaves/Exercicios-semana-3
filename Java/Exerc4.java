import javax.swing.JOptionPane;

public class Exerc4
{
   public static void main (String args [])
   {
        String s1 = JOptionPane.showInputDialog( " digite a primeira: " );
        String s2 = JOptionPane.showInputDialog( " digite a segunda: " );
        String s3 = JOptionPane.showInputDialog( " digite a terceira: ");
        
       
        int soma = s1.length() + s2.length() + s3.length();        
        
        JOptionPane.showMessageDialog(null, " resultado " + soma);
   }
}
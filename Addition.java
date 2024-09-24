// Fig. 12.2: Addition.java
// na linha abaixo esta importando a biblioteca(pacote) javax  modulo swing  eo componente JOption Pane
import javax.swing.JOptionPane; 
//
//na linha abaixo esta sendo declarada a classe addition 
public class Addition
// na linha abaixo esta sendo aberto o bloco de codigo de classe addition  
{
// n alinha abaixo esta sendo declarado o metodo "main" (principal) que vai executar a aplicação  
   public static void main(String[] args)
   //essa chave de blocos abre a linha do main  
   {
      // obter entrada do usuário nas caixas de diálogo de entrada do JOptionPane
      String firstNumber = 
         JOptionPane.showInputDialog("Enter first integer");
      String secondNumber =
          JOptionPane.showInputDialog("Enter second integer");

      // converter entradas de String em valores int para uso em um cálculo
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // add numbers

      // exibir o resultado em uma caixa de diálogo de mensagem JOptionPane
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
   } 
} // FINAL DA CXLASSE 


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

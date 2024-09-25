// 
// a linha abaixo importara o componente JFrame do modulo swing da biblioteca (pacote) javax
import javax.swing.JFrame;

// a linha abaixo esta declarando a classe labelTast
public class LabelTest
// 
{//vai iniciar o bloco de codigos da classe label test
 //  
    public static void main(String[] args)
   //esta declarando o metodo main

{//iniciar o bloco de codigo main
   
      LabelFrame labelFrame = new LabelFrame();
      //essa linha de codigo esta declarando a variavel lebelframe, ela tipo label frame ( é o tipo do mesmo arquivo q foi criado ex. labeltest)

      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //esta declarando o fechamento da operação JFrame 
      
      labelFrame.setSize(260, 180);
      // definir tamanho , largura, comprimento etc... 
      
      labelFrame.setVisible(true);
      // visibilidade, deixa visivel na tela , renderiza ( true mostra, false ñ mostra)
   } // encerrar o bloco de codigo do metodo ( main) 
} // final da classe LabelTest


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

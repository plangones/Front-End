// Fig. 12.6: LabelFrame.java
// JLabels with text and icons.
import java.awt.FlowLayout; // especifica a forma como os componentes estão organizados e importa
import javax.swing.JFrame; // fornece recursos basicos da janela 
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // constantes comuns usadas com Swing
import javax.swing.Icon; // interface usada para manipular imagens
import javax.swing.ImageIcon; // carrega as imagens

public class LabelFrame extends JFrame //  declaração da classe label frame  esta herdando (extend)  o componente JFrame

{//iniciando a bloco de codigos da classe labelframe
   
   // essas tres linhas sao declaracoes de variaveis (private final),' 'private' nao exporta a variavel, o 'final' serve para declara uma variavel somente leitura,
   //JLabel mostra o tipo da variavel, 'label' é o nome da variavel 
   private final JLabel label1; // JLabel with just text
   private final JLabel label2; // JLabel constructed with text and icon
   private final JLabel label3; // JLabel with added text and icon

   // (public tem que ser variavel) (label frame é o objeto, o que traz tudo organizado) construtor(labelframe) tem que ter o nome da classe e o mesmo nome do arquivo
   public LabelFrame()
   {
      super("Testing JLabel");// super significa definição de titulo da janela 
      setLayout(new FlowLayout()); //definir o layout do quadro,

      // JLabel constructor with a string argument
      label1 = new JLabel("Label with text");//
      label1.setToolTipText("This is label1");//estou definindo um texto na ferramenta de dica  
      add(label1); // add vai mostrar 

      // JLabel constructor with string, Icon and alignment arguments
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));//declarando variavel'bug' do tipo'icon'
      label2 = new JLabel("Label with text and icon", bug, // virgula dentro da separacao de parametro serve como separdor de parametro, a virgula é um separador 
         SwingConstants.LEFT);// SwingConstant é mais sobre alinhamento espacial
      label2.setToolTipText("This is label2");
      add(label2); // adicione label2 ao JFrame

      label3 = new JLabel(); //    Construtor JLabel sem argumentos 
      
      label3.setText("Label with icon and text at bottom");// definindo texto 
      label3.setIcon(bug); // add icon para  JLabel definia o icone 
      label3.setHorizontalTextPosition(SwingConstants.CENTER);//
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);//
      label3.setToolTipText("This is label3");//
      add(label3); // adicione label3 ao JFrame
   }
   // fechamento do construtor (label fra)me
 } 
 // final da classe  LabelFrame


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

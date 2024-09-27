
//.
import java.awt.FlowLayout;//é a formula q os objetos sao renderizados 
import java.awt.event.ActionListener;// capturar os eventos da tela. os botoes click
import java.awt.event.ActionEvent;//
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame // classe buttonframe extend herença  jframe é a herença q o button jframe esta recebendo 
{// abre chaves, inicio do bloco d ecodigo buttonframe 
   private final JButton plainJButton; // button with just text, declaracao de variavel 
   private final JButton fancyJButton; // button with icons

   // ButtonFrame adds JButtons to JFrame
   public ButtonFrame()// construtor,  
   {
      super("Testing Buttons");// super, definidor do titulo 
      setLayout(new FlowLayout()); // setlayout, tb é um metodo, define o layout que é a saida out das camadas 

      plainJButton = new JButton("Plain Button"); // declaracaio de variavel que recebe um novo objeto jbutton com parametro de texto
      add(plainJButton); // add plainJButton to JFrame

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));//  
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
      fancyJButton = new JButton("Fancy Button", bug1); // configuração das imagens e texto 
      fancyJButton.setRolloverIcon(bug2); // set rollover quando coloca o mouse em cima, ai ele troca o bug1 pelo bug2 (intercalação )
      add(fancyJButton); // add fancyJButton to JFrame

      // button handler é oq vai manuzear a operacao manual 
      ButtonHandler handler = new ButtonHandler();
      fancyJButton.addActionListener(handler);
      plainJButton.addActionListener(handler);
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener // dcelaracao de classe privativa da classe principal e injetando o actionlistener 
   {
      // handle button event             
      @Override
      public void actionPerformed(ActionEvent event)
      {
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "You pressed: %s", event.getActionCommand()));
      }
   } 
} // final da classe ButtonFrame
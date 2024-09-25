//
import java.awt.FlowLayout;//
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame // textfieldframe esta herdando os componentes JFrame

//inicio do bloco de codigos da classe textfieldframe
{

   //declaracao da variavel privada 
   private final JTextField textField1; // text field with set size
   private final JTextField textField2; // text field with text
   private final JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text

   // TextFieldFrame constructor adds JTextFields to JFrame

   // aonde tive public ele exporta o conntrutor pra depois ele ser importado 
   public TextFieldFrame()
   {// inicio do bloco de codigos textfieldframe
      super("Testing JTextField and JPasswordField");//  super definicapo do titulo da janela JPasswordfield
      setLayout(new FlowLayout());

      // construct textfield with 10 columns
      textField1 = new JTextField(10); // vai receber 
      add(textField1); // add textField1 to JFrame

      // construct textfield with default text
      textField2 = new JTextField("Enter text here");//atribuimos esse JTextfield e adicionamos ele no frame 
      add(textField2); // add textField2 to JFrame

      // construct textfield with default text and 21 columns
      textField3 = new JTextField("Uneditable text field", 21);//
      textField3.setEditable(false); //  disabilita a funçao de editar (seteditable false)
      add(textField3); // add textField3 to JFrame

      // construct passwordfield with default text
      passwordField = new JPasswordField("Hidden text");
      add(passwordField); // add passwordField to JFrame

      // register event handlers
      TextFieldHandler handler = new TextFieldHandler();// handler - manusear; textfieldhandler manipulador dos campos textfield 
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } // end TextFieldFrame constructor

   // private inner class for event handling
   private class TextFieldHandler implements ActionListener 
   {
      // process textfield events
      @Override// 
      public void actionPerformed(ActionEvent event)

      // inicio de bloco de codigo actionperformed
      {
         String string = "";// 
         // user pressed Enter in JTextField textField1
         if (event.getSource() == textField1)// if algoritimo de realização, quando tem dois sinais de = (igual) é operador de comparacao
            string = String.format("textField1: %s",
               event.getActionCommand());

         // user pressed Enter in JTextField textField2
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",// string.format entrega o texto formatado , o s depois da % será um texto 
               event.getActionCommand());

         // user pressed Enter in JTextField textField3
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

         // user pressed Enter in JTextField passwordField
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // display JTextField content
         JOptionPane.showMessageDialog(null, string); 
      } 
   } // end private inner class TextFieldHandler
} // end class TextFieldFramew
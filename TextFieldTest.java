//esta importando o componante JFrame do modulo swing da biblioteca javax
import javax.swing.JFrame;

//declaracao da classe  textfieldtext que tem o mesmo nome do arquivo 
public class TextFieldTest

//inicio do bloco de codigo da classe textfieldtest
{

   //declaracao do metodo main que é o metodo principal comnhecido como metodo executor
   public static void main(String[] args)

   //inicio do bloco de codigo do metodo
   { 

      //a declaracao da variavel textfieldframe, sempre aonde tem new tem um novo objeto,
      TextFieldFrame textFieldFrame = new TextFieldFrame(); 
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// aonde tem operador atribuicao tem declaracao de variavel 
      textFieldFrame.setSize(350, 100); // tamanho
      textFieldFrame.setVisible(true); // deixa visivel na tela 
   } // fim do bloco de codigo do metodo
} // fim do bloco de codigo da classe   TextFieldTest


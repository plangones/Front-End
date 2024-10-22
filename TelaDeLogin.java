import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDeLogin extends JFrame {
    private final JLabel lblLogin;
    private final JLabel lblSenha;
    private final JLabel lblNotificacoes;

    private final JTextField txtLogin;
    private final JPasswordField txtSenha;

    private final JButton btnLogar;


    public TelaDeLogin() {
        super("Tela de Login");
        setLayout(new FlowLayout());

        lblLogin = new JLabel("Login:");
        lblLogin.setToolTipText("Login");
        add(lblLogin);

        txtLogin = new JTextField(10);
        add(txtLogin);

        lblSenha = new JLabel("Senha:");
        lblSenha.setToolTipText("Senha");
        add(lblSenha);

        txtSenha = new JPasswordField(10);
        add(txtSenha);

        btnLogar = new JButton("Login");
        add(btnLogar);

        lblNotificacoes = new JLabel("Notificações");
        add(lblNotificacoes);

        ButtonHandler buttonHandler = new ButtonHandler();
        btnLogar.addActionListener(buttonHandler);
    }

    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            try {
                Connection conexao = MySQLConnector.conectar();
                String strSqlLogin = "select * from `db_senac`.`tbl_senac` where `email` = '" + txtLogin.getText() + "' and `senha` = '" + String.valueOf(txtSenha.getPassword()) + "';"; 
                Statement stmSqlLogin = conexao.createStatement();
                ResultSet rstSqlLogin = stmSqlLogin.executeQuery(strSqlLogin);
                if(rstSqlLogin.next()){
                  lblNotificacoes.setText("nao foi possivel encontrar o login e / ou senha digitados. por favor, verifique e tente novamente");
                    // Aqui vamos notificar o usuario que o login e senha foram encontrados
                } else {
                    // Aqui vamos notificar o usuario que o login e senha não foram encontrados
                }
            } catch(Exception e){
               lblNotificacoes.setText("houve um problema  enao sera possivel realizar o login neste momento. por favor, tente novamente mais tarde");
                System.err.println("Ops! Deu ruim, se liga no erro: " + e);
            }
        }
    }
    
    public static void main(String[] args){
        TelaDeLogin appTelaDeLogin = new TelaDeLogin();
        appTelaDeLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        appTelaDeLogin.setSize(150, 200);
        appTelaDeLogin.setVisible(true);
    }
}

package login.com.joptionpane;

import javax.swing.JOptionPane;


public class LoginComJOptionPane {

    
    public static void main(String[] args) {
        _login();
    }

    public static void _login(){
       JOptionPane.showMessageDialog(null, "Seja bem vindo !!!");
       String login = JOptionPane.showInputDialog("Digite seu login");
       String senha = JOptionPane.showInputDialog("Digite sua senha");
       
       String mensagem = "";
       
       if (!login.equals("admin")){
           mensagem = "Usuário não encontrado, tente novamente!";
       } else if (!senha.equals("1313")){
           mensagem = "Senha incorreta! Tente novamente!";
       } else{
           mensagem = "Login realizado com sucesso!";
       }
       
       _tela_de_aviso(mensagem);
    }
    
    public static void _tela_de_aviso(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
}


package login.com.joptionpane;

import javax.swing.JOptionPane;


public class LoginComJOptionPane {

    
    public static void main(String[] args) {
        _login();
    }

    public static void _login(){

       String mensagem = "";
       int escolha = 0;
       int tentativasMaximas = 0;
       
       do {
            
            String login = JOptionPane.showInputDialog("Digite seu login");
            String senha = JOptionPane.showInputDialog("Digite sua senha");
            if (!login.equals("admin") && !senha.equals("1313")){
                mensagem = "Login ou senha inválidos! Tentar novmente?";
                escolha = _verificar_escolha_usuario(mensagem);
            } 
            
            if (login.equals("admin") && senha.equals("1313")){
                mensagem = "Login realizado! Bem vindo!";
                escolha = 1;
                _tela_de_aviso(mensagem);
            }
            
            tentativasMaximas++;
            if (tentativasMaximas > 3){
                mensagem = "Tentativas Máximas! Tente mais tarte!";
                _tela_de_aviso(mensagem);
                escolha = 1;
            }
            
       } while(escolha == 0);

    }
    
    public static void _tela_de_aviso(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static int _verificar_escolha_usuario(String mensagem){
        String[] opcoes = {"Continuar", "Sair"};

        int escolha = JOptionPane.showOptionDialog(
                null,
                mensagem,
                "Escolha opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);    
        return escolha;
    }
}

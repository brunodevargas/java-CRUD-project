package Principal;
//imports
import View.Login;
import Model.Senha;

public class Principal {
    
    public static void main(String[] args) {
        
       //Instanciando um objeto de Login
       Login login = new Login();
       
       //Deixando ele visivel na tela
       login.setVisible(true);
       
       //Instanciando um objeto de Senha
       Senha snh = new Senha();
       String senha = "123456";
       snh.insertsenhaBd(senha);
      
    }
    

    
}

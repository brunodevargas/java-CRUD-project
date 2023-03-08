
package Model;

import DAO.SenhaDAO;


public class Senha {
   // atributos
    private String senha;
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    //contrutores 
    public Senha(){
    
    }
    
    public Senha(String senha){
        this.senha = senha;
    }
    //atribui senha de principal a SenhaDAO
    public void insertsenhaBd(String senha){
        Senha insert = new Senha(senha);
        SenhaDAO.senha.add(insert);
    }
    //atualiza a senha do usuario
    public void updateSenhaBD(String senha){
        Senha update = new Senha(senha);
        SenhaDAO.senha.set(0, update);
    }
    
}



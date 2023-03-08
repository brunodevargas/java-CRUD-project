package DAO;
//Imports
import Model.Funcionario;
import java.util.*;

public class FuncionarioDAO {
    //ArrayList principal de Funcionário
    public static ArrayList<Funcionario> MinhaLista = new ArrayList<Funcionario>();

    //Método que adiciona id
    public static int maiorID() {
        
        int maiorID = 0;
        for (int i = 0; i < MinhaLista.size(); i++) {
            if (MinhaLista.get(i).getId() > maiorID) {
                maiorID = MinhaLista.get(i).getId();
            }
        }
        return maiorID;
        
        
    }

}

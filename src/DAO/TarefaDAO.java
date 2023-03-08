package DAO;
//imports
import Model.Tarefas;
import java.util.*;

public class TarefaDAO {
    //ArrayList principal de Tarefa
    public static ArrayList<Tarefas> Tabela = new ArrayList<Tarefas>();

    //Método de adicionar número de tarefa
    public static int maiorNº() {
        
        int maiorNº = 0;
        for (int i = 0; i < Tabela.size(); i++) {
            if (Tabela.get(i).getNumerotarefa()> maiorNº) {
                maiorNº = Tabela.get(i).getNumerotarefa();
            }
        }
        
        return maiorNº;
        
    }
}


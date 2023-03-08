package Model;
//imports
import java.util.*;
import DAO.TarefaDAO;

public class Tarefas extends Funcionario  {
    
    //Atributos
    private String tarefa;
    private String descricaotarefa;
    private int numerotarefa;
    private String status;
    
    //Getters e Setters
    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDescricaotarefa() {
        return descricaotarefa;
    }

    public void setDescricaotarefa(String descricaotarefa) {
        this.descricaotarefa = descricaotarefa;
    }

    public int getNumerotarefa() {
        return numerotarefa;
    }

    public void setNumerotarefa(int numerotarefa) {
        this.numerotarefa = numerotarefa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    //Construtor vazio
    public Tarefas(){

    }
    //Contrutor de tarefa
    public Tarefas(int numerotarefa, String tarefa, String descricaotarefa, String status ){
        this.tarefa = tarefa;
        this.descricaotarefa = descricaotarefa;
        this.numerotarefa = numerotarefa;
        this.status = status;
    }
    //Construtor completo
    public Tarefas(int numerotarefa, String tarefa,String descricaotarefa,String status, int id, String nome, int idade, String setor, String turno, String cpf){
        super(setor, cpf, turno, id, nome, idade);
        this.descricaotarefa = descricaotarefa;
        this.tarefa = tarefa;
        this.numerotarefa = numerotarefa;
        this.status = status;
       
    }
    //Método sobrescrito para inserir na tela dados
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nº Tarefa: " + this.getNumerotarefa()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Cpf: " + this.getCpf()
                + "\n Turno: " + this.getTurno()
                + "\n Setor: " + this.getSetor()
                + "\n Tarefa: " + this.getTarefa()
                + "\n Descrição Tarefa: " + this.getDescricaotarefa()
                + "\n Status: " + this.getStatus();
        
    }
    
    
    //Retorna a Lista
    public ArrayList getMinhaTarefa() {
        return TarefaDAO.Tabela;
    }

    //Cria nova Tarefa
    public boolean InsertTarefaBD(String tarefa, String descricaotarefa,String status, String setor, String cpf, String turno, String nome, int idade, int id) {
        int numerotarefa = this.maiorNº()+1;
        Tarefas objeto = new Tarefas(numerotarefa, tarefa, descricaotarefa,status, id, nome, idade, setor, turno, cpf);
        TarefaDAO.Tabela.add(objeto);
        return true;
    }

    // Deleta uma Tarefa pelo Nº de tarefa
    public boolean DeleteTarefaBD(int numerotarefa) {
        int indice = this.procuraIndiceTarefa(numerotarefa);
        TarefaDAO.Tabela.remove(indice);
        return true;
    }

    // Edita um Tarefa pelo seu Nº de tarefa
    public boolean UpdateTarefaBD(int numerotarefa, String tarefa,String descricaotarefa,String status,String setor, String cpf, String turno, int id, String nome, int idade) {
        Tarefas objeto = new Tarefas(numerotarefa, tarefa, descricaotarefa,   status, id, nome, idade, setor, turno, cpf);
        int indice = this.procuraIndiceTarefa(numerotarefa);
        TarefaDAO.Tabela.set(indice, objeto);
        return true;
    }
 

    // procura o INDICE de objeto da MinhaLista que contem o ID enviado.
    private int procuraIndiceTarefa(int numerotarefa) {
        int indice = -1;
        for (int i = 0; i < TarefaDAO.Tabela.size(); i++) {
            if (TarefaDAO.Tabela.get(i).getNumerotarefa()== numerotarefa) {
                indice = i;
            }
        }
        return indice;
    }

    // carrega dados de um aluno espec�fico pelo seu ID
     public Tarefas TarefaFuncionario(int numerotarefa) {
        int indice = this.procuraIndiceTarefa(numerotarefa);
        return TarefaDAO.Tabela.get(indice);
    }
    
    // retorna o maior ID da nossa base de dados
    public int maiorNº(){
        return TarefaDAO.maiorNº();
    } 

}
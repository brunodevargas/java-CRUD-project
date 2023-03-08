package Model;
//Imports
import java.util.*;
import DAO.FuncionarioDAO;

public class Funcionario extends Pessoa {

    // Atributos
    private String cpf;
    private String turno;
    private String setor;

    
    //Construtor Vazio
    public Funcionario() {
    }

    //Construtor de funcionário
    public Funcionario(String cpf, String turno, String setor) {
        this.cpf = cpf;
        this.turno = turno;
        this.setor = setor;
    }

    //Construtor complero
    public Funcionario(String setor, String cpf, String turno, int id, String nome, int idade) {
        super(id, nome, idade);
        this.cpf = cpf;
        this.turno = turno;
        this.setor = setor;
    }
    
    //Getters e setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    //Método sobrescrito para inserir na tela dados
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Cpf: " + this.getCpf()
                + "\n Turno: " + this.getTurno()
                + "\n Setor: " + this.getSetor()
                + "\n -----------";
    }

    // Retorna a Lista de Alunos(objetos)
    public ArrayList getMinhaLista() {
        return FuncionarioDAO.MinhaLista;
    }

    // Cadastra novo aluno
    public boolean InsertAlunoBD(String setor, String cpf, String turno, String nome, int idade) {
        int id = this.maiorID() + 1;
        Funcionario objeto = new Funcionario(setor, cpf, turno, id, nome, idade);
        FuncionarioDAO.MinhaLista.add(objeto);
        return true;

    }

    // Deleta um aluno espec�fico pelo seu campo ID
    public boolean DeleteAlunoBD(int id) {
        int indice = this.procuraIndice(id);
        FuncionarioDAO.MinhaLista.remove(indice);
        return true;
    }

    // Edita um aluno espec�fico pelo seu campo ID
    public boolean UpdateAlunoBD(String setor, String cpf, String turno, int id, String nome, int idade) {
        Funcionario objeto = new Funcionario(setor, cpf, turno, id, nome, idade);
        int indice = this.procuraIndice(id);
        FuncionarioDAO.MinhaLista.set(indice, objeto);
        return true;
    }

    // procura o INDICE de objeto da MinhaLista que contem o ID enviado.
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < FuncionarioDAO.MinhaLista.size(); i++) {
            if (FuncionarioDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }

    // carrega dados de um aluno espec�fico pelo seu ID
    public Funcionario carregaAluno(int id) {
        int indice = this.procuraIndice(id);
        return FuncionarioDAO.MinhaLista.get(indice);
    }
    
    // retorna o maior ID da nossa base de dados
    public int maiorID(){
        return FuncionarioDAO.maiorID();
    }   
}

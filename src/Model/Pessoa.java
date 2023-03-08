package Model;

//Classe abstrata para não ser instanciada como objeto
public abstract class Pessoa {

    // Atributos
    protected int id;
    protected String nome;
    protected int idade;

    //Construtor vazio
    public Pessoa() {
    }
    
    
    //Construtor com dados de pessoa
    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    //Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

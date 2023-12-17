import java.util.Locale;

public abstract class Pessoa {

    private String nome;
    private String tipo;
    private Integer idade;
    private String turno;


    public Pessoa(){
    }

    public Pessoa(String nome, Integer idade, String tipo, String turno){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.turno = turno;

    }

    public Pessoa(String nome, Integer idade, String tipo) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public abstract void printarInformacoes();{

    }
}

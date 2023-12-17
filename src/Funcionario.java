package Funcionarios;


public abstract class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario() {// construtor
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario (String nome, Integer idade, String tipo, String turno, String cargo) {
        super(nome, idade, tipo, turno);
        this.cargo = cargo;
    }
}


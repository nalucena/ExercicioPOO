public abstract class Funcionario extends Pessoa {

    private String disciplina;

    public Funcionario() {  // construtor
    }

    public Funcionario(String nome, Integer idade, String tipo, String turno) {
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Funcionario (String nome, Integer idade, String tipo, String turno, String disciplina) {
        super(nome, idade, tipo, turno);
        this.disciplina = disciplina;
    }

    @Override
    public void printarInformacoes(){
        System.out.printf("Dados solicitados com sucesso: %n%n" +
                "Funcionário: %s %n" +
                "Idade: %d %n" +
                "Cargo: %s %n" +
                "Disciplina: %s %n" +
                "Turno: %s %n", getNome(), getIdade(), getTipo(), getDisciplina(), getTurno());
    }

}


import java.util.Arrays;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;
    private String[] disciplinasMatriculadas;
    public Aluno(){

    }
    public Aluno (String nome, Integer idade, String tipo, String turno, String matricula, String curso) {
        super(nome, idade, tipo, turno);
        this.curso = curso;
        this.matricula = matricula;
    }

    public Aluno(String nome, Integer idade, String tipo, String turno, String curso, String matricula, String [] disciplinasMatriculadas) {
        super(nome, idade, tipo, turno);
        this.curso = curso;
        this.matricula = matricula;
        setDisciplinasMatriculadas(disciplinasMatriculadas);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String[] getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    @Override
    public void printarInformacoes(){
        System.out.printf("Dados solicitados com sucesso: %n" +
                        "Aluno: %s %n" +
                        "Idade: %d %n" +
                        "Tipo: %s %n" +
                        "Turno: %s %n" +
                        "Matrícula: %s %n" +
                        "Curso: %s %n" +
                        "Disciplinas Matriculadas: %s %n%n"
                , getNome(), getIdade(), getTipo(), getTurno(), getMatricula(), getCurso(), Arrays.toString(getDisciplinasMatriculadas()));
    }

}
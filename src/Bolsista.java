import java.util.Arrays;

public final class Bolsista extends Aluno {

    public Bolsista(String nome, Integer idade, String tipo, String turno, String curso, String matricula, String[] disciplinasMatriculadas) {
        super(nome, idade, tipo, turno, curso, matricula, disciplinasMatriculadas);

    }

    @Override
    public void printarInformacoes(){
        super.printarInformacoes();
        System.out.printf("O(A) aluno(a) %s está matriculado(a) no seguinte conjunto de disciplinas: %s %n%n", getNome(), Arrays.toString(getDisciplinasMatriculadas()));
    }
}
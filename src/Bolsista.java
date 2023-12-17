import java.util.Arrays;

public final class Bolsista extends Aluno {

      public Bolsista(String nome, Integer idade, String tipo, String turno, String matricula, String curso, String[] disciplinasMatriculadas) {
        super(nome, idade, tipo, matricula, curso, Arrays.toString(disciplinasMatriculadas));

    }

    @Override
    public void printarInformacoes(){
        super.printarInformacoes();
        System.out.printf("O aluno %s está matriculado no seguinte conjunto de disciplinas: %s ", getNome(), getDisciplinasMatriculadas());
    }
}

import java.util.Arrays;

public final class Pagante extends Aluno {

    private Double valorMensalidade;

    public Pagante(String nome, Integer idade, String tipo, String turno, String curso, String matricula, String[] disciplinasMatriculadas, Double valorMensalidade) {
        super(nome, idade, tipo, turno, curso, matricula, disciplinasMatriculadas);
        this.valorMensalidade = valorMensalidade;

    }

    public Double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(Double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    @Override
    public void printarInformacoes(){
        super.printarInformacoes();
        System.out.printf("O aluno %s está matriculado no seguinte conjunto de disciplinas: %s , com mensalidade no valor de R$%.2f %n%n", getNome(), Arrays.toString(getDisciplinasMatriculadas()), getValorMensalidade());
    }
}
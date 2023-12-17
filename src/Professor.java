public final class Professor extends Funcionario {

    private String sistemaDeDedicacao;

    public Professor (String nome, Integer idade, String tipo, String turno, String disciplina, String sistemaDeDedicacao) {
        super(nome, idade, tipo, turno, disciplina);
        this.sistemaDeDedicacao = sistemaDeDedicacao;

    }

    public String getSistemaDeDedicacao() {
        return sistemaDeDedicacao;
    }

    public void setSistemaDeDedicacao(String sistemaDeDedicacao) {
        this.sistemaDeDedicacao = sistemaDeDedicacao;
    }

    @Override
    public void printarInformacoes(){
        System.out.printf("Dados solicitados com sucesso:" +
                "Funcinário: %s %n" +
                "Idade: %d %n" +
                "Cargo: %s %n" +
                "Disciplina: %s %n" +
                "Turno: %s %n" +
                "Dedicação: %s %n", getNome(), getIdade(), getTipo(), getDisciplina(), getTurno(), getSistemaDeDedicacao());
    }

}


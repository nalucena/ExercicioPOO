public final class Atendente extends Funcionario {

    private String tipoDeAtendimento;
    private boolean disponivel = true;

    public Atendente(String nome, Integer idade, String tipo, String turno, String tipoDeAtendimento) {
        super(nome, idade, tipo, turno);
        this.tipoDeAtendimento = tipoDeAtendimento;
    }

    /*public Atendente (String nome, Integer idade, String tipo, String turno, String tipoDeAtendimento, Boolean disponivel) {
        super(nome, idade, tipo, turno);
        this.tipoDeAtendimento = tipoDeAtendimento;
        this.disponivel = disponivel;
    }*/

    public String getTipoDeAtendimento() {
        return tipoDeAtendimento;
    }

    public void setTipoDeAtendimento(String tipoDeAtendimento) {
        this.tipoDeAtendimento = tipoDeAtendimento;
    }

    @Override
    public void printarInformacoes(){
        System.out.printf("Dados solicitados com sucesso: %n%n" +
                          "Funcionário: %s %n" +
                          "Idade: %d %n" +
                          "Cargo: %s %n" +
                          "Turno: %s %n" +
                          "O tipo de Atendimento é: %s %n", getNome(), getIdade(), getTipo(), getTurno(), getTipoDeAtendimento());
    }

}


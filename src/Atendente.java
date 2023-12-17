public final class Atendente extends Funcionario {

    private String tipoDeAtendimento;

    public Atendente (String nome, Integer idade, String tipo, String turno, String tipoDeAtendimento) {
        super(nome, idade, tipo, turno);
        this.tipoDeAtendimento = tipoDeAtendimento;
    }

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
                          "Tipo de Atendimento: %s %n" +
                          "Turno: %s %n", getNome(), getIdade(), getTipo(), getTipoDeAtendimento(), getTurno());
    }

}


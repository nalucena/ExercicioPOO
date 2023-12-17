public class Main {
    public static void main(String[] args) {

        Aluno pagante = new Pagante("Wei Wuxian", 28, "Pagante", "Tarde", "Computação", "A0002", new String[]{"Lógica de Programação I", "POO I"}, 858.90);
        pagante.printarInformacoes();

        Aluno bolsista = new Bolsista("Nathalya Lucena", 33, "Bolsista",
                "Noturno",  "Ciências da Computação","A0001",
                new String[]{"Lógica de Programação I", "POO I"});
        bolsista.printarInformacoes();

        Funcionario professor = new Professor("Xiao Zhan", 29, "Professor", "Noturno", "Lógica de Programação", "Exclusiva");
        professor.printarInformacoes();

        Funcionario atendente = new Atendente("Nathalya Lucena", 33, "Atendente", "Integral", "Online");
        atendente.printarInformacoes();

    }
}



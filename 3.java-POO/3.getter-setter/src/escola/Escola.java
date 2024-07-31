package escola;

public class Escola {
    public static void main(String[] args) throws Exception {
        Aluno joao = new Aluno();

        joao.setNome("João");
        joao.setIdade(10);

        System.out.println("O nome do aluno é " + joao.getNome() + " e a idade é " + joao.getIdade());
    }
}

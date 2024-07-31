public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        Pessoa joao = new Pessoa("João", "000.000.123-45");
        joao.setEndereco("Rua das Laranjeiras, 123");

        System.out.println(joao.getNome() + " - " + joao.getCpf() + " - " + joao.getEndereco());
    }
}

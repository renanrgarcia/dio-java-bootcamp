public class Computador {
    public static void main(String[] args) throws Exception {
        // Não sabemos qual será o serviço escolhido
        ServicoMensagemInstantanea servico = null;

        String servicoEscolhido = "MSN";

        if (servicoEscolhido.equals("MSN")) {
            servico = new MSNMessenger();
        } else if (servicoEscolhido.equals("Telegram")) {
            servico = new Telegram();
        } else if (servicoEscolhido.equals("Facebook Messenger")) {
            servico = new FacebookMessenger();
        }

        servico.enviarMensagem();
        servico.receberMensagem();
    }
}

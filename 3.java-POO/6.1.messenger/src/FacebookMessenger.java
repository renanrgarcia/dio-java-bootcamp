public class FacebookMessenger extends ServicoMensagemInstantanea {

  @Override
  public void enviarMensagem() {
    validarConexao();
    System.out.println("Enviando mensagem no Facebook Messenger");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem no Facebook Messenger");
  }

}
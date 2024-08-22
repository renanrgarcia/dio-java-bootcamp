public class MSNMessenger extends ServicoMensagemInstantanea {
  @Override
  public void enviarMensagem() {
    validarConexao();
    System.out.println("Enviando mensagem no MSN Messenger");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem no MSN Messenger");
  }
}
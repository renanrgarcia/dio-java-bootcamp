public class Carro extends Veiculo {

  private void conferirCambio() {
    System.out.println("CONFERINDO O CAMBIO");
  }

  private void conferirCombustivel() {
    System.out.println("CONFERINDO O COMBUSTIVEL");
  }

  public void ligar() {
    conferirCambio();
    conferirCombustivel();
    System.out.println("LIGANDO O CARRO");
  }

}

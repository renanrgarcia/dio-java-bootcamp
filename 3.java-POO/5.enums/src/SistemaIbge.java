public class SistemaIbge {
  public static void main(String[] args) {
    for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
      // System.out.println(estado.getSigla() + " - " + estado.getNome());
    }

    EstadoBrasileiro eb = EstadoBrasileiro.MINAS_GERAIS;
    System.out.println(eb.getNome());
    System.out.println(eb.getSigla());
    System.out.println(eb.getIbge());
    System.out.println(eb.getNomeMaiusculo());

  }
}

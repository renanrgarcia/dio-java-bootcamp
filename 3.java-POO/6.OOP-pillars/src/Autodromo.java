public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("123456789");
        // jeep.ligar();

        Moto honda = new Moto();
        honda.setChassi("987654321");
        // honda.ligar();

        Veiculo coringa = honda;

        coringa.ligar();
    }
}

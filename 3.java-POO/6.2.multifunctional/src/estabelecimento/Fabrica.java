package estabelecimento;

import copiadora.Copiadora;
import digitalizadora.Digitalizadora;
import impressora.Deskjet;
import impressora.Impressora;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) throws Exception {
        EquipamentoMultifuncional equipamento = new EquipamentoMultifuncional();
        Impressora impressora = equipamento;
        Digitalizadora digitalizadora = equipamento;
        Copiadora copiadora = equipamento;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}

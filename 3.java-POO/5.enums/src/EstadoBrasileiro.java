public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 12),
    MINAS_GERAIS("MG", "Minas Gerais", 13),
    ESPIRITO_SANTO("ES", "Espirito Santo", 14),
    CEARA("CE", "Ceara", 15);

    private String sigla;
    private String nome;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
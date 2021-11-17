public class Potencia implements Expressao {

    private final Expressao expressao;
    private final Expressao expoente;

    public Potencia(Expressao expressao, Expressao expoente) {
        this.expressao = expressao;
        this.expoente = expoente;
    }

    @Override
    public double avalia() {
        return Math.pow(expressao.avalia(), expoente.avalia());
    }
}

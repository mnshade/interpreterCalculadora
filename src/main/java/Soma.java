public class Soma implements Expressao {

    private final Expressao esquerda;
    private final Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avalia() {
        return esquerda.avalia() + direita.avalia();
    }
}

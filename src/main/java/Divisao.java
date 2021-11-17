public class Divisao implements Expressao {

    private final Expressao esquerda;
    private final Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avalia() {
        double valorDireita = this.direita.avalia();
        if (Double.compare(valorDireita, 0.0) == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return esquerda.avalia() / valorDireita;
    }
}

public class Numero implements Expressao {

    private final double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public double avalia() {
        return valor;
    }
}

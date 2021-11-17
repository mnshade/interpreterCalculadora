import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpressaoTest {

    @Test
    public void deveRetornarSoma() {
        Expressao soma = new Soma(new Numero(5), new Numero(11));
        assertEquals(16.0, soma.avalia());
    }

    @Test
    public void deveRetornarSubtracao() {
        Expressao subtracao = new Subtracao(new Numero(2), new Numero(11));
        assertEquals(-9.0, subtracao.avalia());
    }

    @Test
    public void deveRetornarDivisao() {
        Expressao divisao = new Divisao(new Numero(11), new Numero(2));
        assertEquals(5.5, divisao.avalia());
    }

    @Test
    public void deveRetornarMultiplicacao() {
        Expressao multiplicacao = new Multiplicacao(new Numero(7), new Numero(11));
        assertEquals(77.0, multiplicacao.avalia());
    }

    @Test(expected = ArithmeticException.class)
    public void exceptionDivisaoPorZero() {
        Expressao divisao = new Divisao(new Numero(5), new Numero(0.0));
        divisao.avalia();
        fail("Deveria lançar uma ArithmeticException pela divisão por zero.");
    }

    @Test
    public void deveRetornarExpressaoEncadeada() {
        Expressao soma = new Soma(new Numero(10), new Subtracao(new Numero(3), new Numero(-14)));
        assertEquals(27.0, soma.avalia());

        Expressao divisao = new Divisao(soma, new Multiplicacao(new Numero(3), new Divisao(new Numero(12), new Numero(4))));
        assertEquals(3.0, divisao.avalia());
    }

}

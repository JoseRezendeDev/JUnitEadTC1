import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegrasDescontoTest {
    public RegrasDesconto regrasDesconto;

    @BeforeEach
    public void setup() {
        regrasDesconto = new RegrasDesconto();
    }

    @Test
    public void calculaDescontoA5() {
        setTipoClienteAndQtdItens('A', 5);
        float expected = 0;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoA50() {
        setTipoClienteAndQtdItens('A', 50);
        float expected = 2.5f;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoA100() {
        setTipoClienteAndQtdItens('A', 100);
        float expected = 10;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoB5() {
        setTipoClienteAndQtdItens('B', 5);
        float expected = 0.25f;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoB60() {
        setTipoClienteAndQtdItens('B', 60);
        float expected = 9f;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoB100() {
        setTipoClienteAndQtdItens('B', 100);
        float expected = 25f;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoC5() {
        setTipoClienteAndQtdItens('C', 5);
        float expected = 0;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoC50() {
        setTipoClienteAndQtdItens('C', 50);
        float expected = 10f;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoC100() {
        setTipoClienteAndQtdItens('C', 100);
        float expected = 25;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    @Test
    public void calculaDescontoN30() {
        setTipoClienteAndQtdItens('N', 30);
        float expected = 0;
        float actual = regrasDesconto.calculaDesconto();
        assertEquals(expected, actual);
    }

    private void setTipoClienteAndQtdItens(char tipoCliente, int qtdItens) {
        regrasDesconto.id = 1;
        regrasDesconto.nome = "Teste";
        regrasDesconto.tipoCliente = tipoCliente;
        regrasDesconto.quantidadeItens = qtdItens;
    }
}
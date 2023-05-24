package Test;

import org.junit.Assert;
import org.junit.Test;

import Main.Calculo.Mensalidade_Sexo_M;

public class TestMensalidade_Sexo_M {

    @Test
    public void testCalcularMensalidade_Sexo_M_IdadeMenorIgual15() {
        double mensalidade = Mensalidade_Sexo_M.calcularMensalidade_Sexo_M(12, "M");
        Assert.assertEquals(60.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_M_IdadeEntre16e18() {
        double mensalidade = Mensalidade_Sexo_M.calcularMensalidade_Sexo_M(17, "M");
        Assert.assertEquals(75.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_M_IdadeEntre19e30() {
        double mensalidade = Mensalidade_Sexo_M.calcularMensalidade_Sexo_M(25, "M");
        Assert.assertEquals(90.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_M_IdadeEntre31e40() {
        double mensalidade = Mensalidade_Sexo_M.calcularMensalidade_Sexo_M(35, "M");
        Assert.assertEquals(85.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_M_IdadeEntre41e50() {
        double mensalidade = Mensalidade_Sexo_M.calcularMensalidade_Sexo_M(45, "M");
        Assert.assertEquals(80.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_M_IdadeMaior50() {
        double mensalidade = Mensalidade_Sexo_M.calcularMensalidade_Sexo_M(55, "M");
        Assert.assertEquals(60.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_M_SexoInvalido() {
        double mensalidade = Mensalidade_Sexo_M.calcularMensalidade_Sexo_M(30, "F");
        Assert.assertEquals(0.0, mensalidade, 0.01);
    }
}

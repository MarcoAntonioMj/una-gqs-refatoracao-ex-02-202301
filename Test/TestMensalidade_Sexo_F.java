package Test;

import org.junit.Assert;
import org.junit.Test;

import Main.Calculo.Mensalidade_Sexo_F;

public class TestMensalidade_Sexo_F {

    @Test
    public void testCalcularMensalidade_Sexo_F_IdadeMenorIgual18() {
        double mensalidade = Mensalidade_Sexo_F.calcularMensalidade_Sexo_F(15, "F");
        Assert.assertEquals(60.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_F_IdadeEntre19e25() {
        double mensalidade = Mensalidade_Sexo_F.calcularMensalidade_Sexo_F(20, "F");
        Assert.assertEquals(90.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_F_IdadeEntre26e40() {
        double mensalidade = Mensalidade_Sexo_F.calcularMensalidade_Sexo_F(30, "F");
        Assert.assertEquals(85.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_F_IdadeEntre41e50() {
        double mensalidade = Mensalidade_Sexo_F.calcularMensalidade_Sexo_F(45, "F");
        Assert.assertEquals(65.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_F_IdadeMaior50() {
        double mensalidade = Mensalidade_Sexo_F.calcularMensalidade_Sexo_F(55, "F");
        Assert.assertEquals(50.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_Sexo_F_SexoInvalido() {
        double mensalidade = Mensalidade_Sexo_F.calcularMensalidade_Sexo_F(30, "M");
        Assert.assertEquals(0.0, mensalidade, 0.01);
    }
}
